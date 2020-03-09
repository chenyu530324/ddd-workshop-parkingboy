package ddd.workshop.parkingboy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class SeniorParkingBoyTest {

    @Test
    public void could_choose_parkingLot_success() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = ParkingLot.of(1, 0,"PARKING_LOT_1");
        ParkingLot parkingLot2 = ParkingLot.of(2, 3, "PARKING_LOT_2");
        ParkingLot parkingLot3 = ParkingLot.of(3, 10, "PARKING_LOT_3");
        parkingLots.add(parkingLot2);
        parkingLots.add(parkingLot3);
        parkingLots.add(parkingLot1);
        ParkingBoy parkingBoy = new SeniorParkingBoy(parkingLots);

        ParkingLot parkingLot = parkingBoy.chooseParkingLot();
        assertNotNull(parkingLot);
        assertEquals(parkingLot.getSerialNumber(), "PARKING_LOT_3");
    }

    @Test
    public void could_not_choose_parkingLot_when_all_parking_lot_do_not_has_capacity() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = ParkingLot.of(1, 0,"PARKING_LOT_1");
        ParkingLot parkingLot2 = ParkingLot.of(2, 0, "PARKING_LOT_2");
        ParkingLot parkingLot3 = ParkingLot.of(3, 0, "PARKING_LOT_3");
        parkingLots.add(parkingLot2);
        parkingLots.add(parkingLot3);
        parkingLots.add(parkingLot1);
        ParkingBoy parkingBoy = new SeniorParkingBoy(parkingLots);

        ParkingLot parkingLot = parkingBoy.chooseParkingLot();
        assertNull(parkingLot);
    }
}
