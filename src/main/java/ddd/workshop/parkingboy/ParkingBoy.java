package ddd.workshop.parkingboy;

import java.util.Collections;
import java.util.List;

public class ParkingBoy {

    private final List<ParkingLot> parkingLots;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        Collections.sort(parkingLots);
        this.parkingLots = parkingLots;
    }

    public List<ParkingLot> getParkingLots() {
        return this.parkingLots;
    }
}
