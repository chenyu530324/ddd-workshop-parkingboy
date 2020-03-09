package ddd.workshop.parkingboy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ParkingManagerTest {

    @Test
    public void could_init_parkingBoy_list_success() {
        List<ParkingLot> seniorParkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = ParkingLot.of(1, 0,"PARKING_LOT_1");
        ParkingLot parkingLot2 = ParkingLot.of(2, 3, "PARKING_LOT_2");
        ParkingLot parkingLot3 = ParkingLot.of(3, 10, "PARKING_LOT_3");
        seniorParkingLots.add(parkingLot2);
        seniorParkingLots.add(parkingLot3);
        seniorParkingLots.add(parkingLot1);
        ParkingBoy seniorParkingBoy = new SeniorParkingBoy(seniorParkingLots);

        List<ParkingLot> juniorParkingLots = new ArrayList<>();
        ParkingLot parkingLot4 = ParkingLot.of(4, 1,"PARKING_LOT_4");
        ParkingLot parkingLot5 = ParkingLot.of(5, 99, "PARKING_LOT_5");
        ParkingLot parkingLot6 = ParkingLot.of(6, 102, "PARKING_LOT_6");
        juniorParkingLots.add(parkingLot5);
        juniorParkingLots.add(parkingLot6);
        juniorParkingLots.add(parkingLot4);
        ParkingBoy juniorParkingBoy = new JuniorParkingBoy(juniorParkingLots);

        List<ParkingBoy> parkingBoys = new ArrayList<>();
        parkingBoys.add(seniorParkingBoy);
        parkingBoys.add(juniorParkingBoy);
        ParkingManager parkingManager = new ParkingManager(parkingBoys);
    }

}