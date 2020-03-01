package ddd.workshop.parkingboy;

public class ParkingLot implements Comparable<ParkingLot> {

    private final int sortIndex;

    public ParkingLot(int sortIndex) {
        this.sortIndex = sortIndex;
    }

    public static ParkingLot of(int sortIndex) {
        return new ParkingLot(sortIndex);
    }

    @Override
    public int compareTo(ParkingLot o) {
        return Integer.compare(this.sortIndex, o.sortIndex);
    }
}
