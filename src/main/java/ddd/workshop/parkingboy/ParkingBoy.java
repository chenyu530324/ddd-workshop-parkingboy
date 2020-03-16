package ddd.workshop.parkingboy;

import java.util.List;

public class ParkingBoy {

    private List<ParkingLot> parkingLots;

    private ParkingPolicy parkingPolicy;

    public ParkingBoy(List<ParkingLot> parkingLots, ParkingPolicy parkingPolicy) {
        this.parkingLots = parkingLots;
        this.parkingPolicy = parkingPolicy;
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public ParkingLot findParkingLot() {
        return this.parkingPolicy.findParkingLog(parkingLots);
    }
}
