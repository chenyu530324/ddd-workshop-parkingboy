package ddd.workshop.parkingboy;

public class ParkingLot implements Comparable<ParkingLot> {

    private final int sortIndex;
    private final int capacity;

    public ParkingLot(int sortIndex, int capacity) {
        this.sortIndex = sortIndex;
        this.capacity = capacity;
    }

    public static ParkingLot of(int sortIndex, int capacity) {
        return new ParkingLot(sortIndex, capacity);
    }

    @Override
    public int compareTo(ParkingLot o) {
        return Integer.compare(this.sortIndex, o.sortIndex);
    }

    public Ticket parking(Car car) {
        if (!hasCapacity()) {
            throw new RuntimeException("ParkingLot doesn't have capacity");
        }
        return TicketFactory.createNewTicket(car);
    }

    private boolean hasCapacity() {
        return this.capacity > 0;
    }
}
