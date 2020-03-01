package ddd.workshop.parkingboy;

public class ParkingLot implements Comparable<ParkingLot> {

    private final int sortIndex;
    private int capacity;
    private String serialNumber;

    public ParkingLot(int sortIndex, int capacity, String serialNumber) {
        this.sortIndex = sortIndex;
        this.capacity = capacity;
        this.serialNumber = serialNumber;
    }

    public static ParkingLot of(int sortIndex, int capacity, String serialNumber) {
        return new ParkingLot(sortIndex, capacity, serialNumber);
    }

    @Override
    public int compareTo(ParkingLot o) {
        return Integer.compare(this.sortIndex, o.sortIndex);
    }

    public Ticket parking(Car car) {
        if (!hasCapacity()) {
            return null;
        }
        this.capacity --;
        return TicketFactory.createNewTicket(car, this);
    }

    private boolean hasCapacity() {
        return this.capacity > 0;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
