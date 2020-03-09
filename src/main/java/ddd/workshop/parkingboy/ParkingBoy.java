package ddd.workshop.parkingboy;

import java.util.List;

public abstract class ParkingBoy implements ChoseParkingLot {

    protected final List<ParkingLot> parkingLots;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    List<ParkingLot> getParkingLots() {
        return this.parkingLots;
    }
}
