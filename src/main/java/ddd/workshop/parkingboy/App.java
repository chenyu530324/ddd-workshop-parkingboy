package ddd.workshop.parkingboy;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = ParkingLot.of(1, 0,"PARKING_LOT_1");
        ParkingLot parkingLot2 = ParkingLot.of(2, 3, "PARKING_LOT_2");
        ParkingLot parkingLot3 = ParkingLot.of(3, 10, "PARKING_LOT_3");
        parkingLots.add(parkingLot2);
        parkingLots.add(parkingLot3);
        parkingLots.add(parkingLot1);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);

        Car car = new Car("川A 5012J");
        Ticket ticket = parkingBoy.parking(car);
    }
}
