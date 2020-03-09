package ddd.workshop.parkingboy;

import java.util.Collections;
import java.util.List;

public class ParkingBoy {

    private final List<ParkingLot> parkingLots;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        Collections.sort(parkingLots);
        this.parkingLots = parkingLots;
    }

    List<ParkingLot> getParkingLots() {
        return this.parkingLots;
    }

    public ParkingLot choseParkingLot() {
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.isAvailable()) {
                return parkingLot;
            }
        }
        return null;
    }
}
