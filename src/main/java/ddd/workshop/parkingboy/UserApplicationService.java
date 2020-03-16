package ddd.workshop.parkingboy;

import java.util.List;

public class UserApplicationService {

    private List<ParkingBoy> parkingBoys;

    private ParkingManager parkingManager;

    public Ticket parkByParkingBoy(Car car) {
        ParkingBoy parkingBoy = parkingBoys.get(1);
        ParkingLot parkingLot = parkingBoy.findParkingLot();
        return parkingLot.parking(car);
    }

    public Ticket parkByParkingManage(Car car) {
        ParkingLot parkingLot = parkingManager.findParkingLot();
        return parkingLot.parking(car);
    }

    public ParkingLot findParkingLot() {
        return parkingManager.findParkingLot();
    }

}
