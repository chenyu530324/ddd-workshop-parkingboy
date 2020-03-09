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

    static ParkingLot of(int sortIndex, int capacity, String serialNumber) {
        return new ParkingLot(sortIndex, capacity, serialNumber);
    }

    @Override
    public int compareTo(ParkingLot o) {
        return Integer.compare(this.sortIndex, o.sortIndex);
    }

    Ticket parking(Car car) {
        if (!hasCapacity()) {
            return null;
        }
        this.capacity --;
        return new Ticket(car, this);
    }

    private boolean hasCapacity() {
        return this.capacity > 0;
    }

    String getSerialNumber() {
        return this.serialNumber;
    }

    int getCapacity() {
        return this.capacity;
    }
}
