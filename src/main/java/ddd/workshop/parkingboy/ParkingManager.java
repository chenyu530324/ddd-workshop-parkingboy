package ddd.workshop.parkingboy;

import java.util.List;

public class ParkingManager {

    private List<ParkingBoy> parkingBoys;

    public ParkingManager(List<ParkingBoy> parkingBoys) {
        this.parkingBoys = parkingBoys;
    }

    public Ticket parking(Car car) {
        ParkingBoy parkingBoy = parkingBoys.get(1);
        ParkingLot parkingLot = parkingBoy.findParkingLot();
        return parkingLot.parking(car);
    }

    public ParkingLot findParkingLot() {
        ParkingBoy parkingBoy = parkingBoys.get(1);
        return parkingBoy.findParkingLot();
    }
}
