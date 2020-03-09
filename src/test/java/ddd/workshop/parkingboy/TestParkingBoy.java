package ddd.workshop.parkingboy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TestParkingBoy {

    @Test
    public void could_set_parkingLots_for_parkingBoy() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = ParkingLot.of(1, 0, "PARKING_LOT_1");
        ParkingLot parkingLot2 = ParkingLot.of(2, 0, "PARKING_LOT_2");
        ParkingLot parkingLot3 = ParkingLot.of(3, 0, "PARKING_LOT_3");
        parkingLots.add(parkingLot2);
        parkingLots.add(parkingLot3);
        parkingLots.add(parkingLot1);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);
        assertEquals(parkingBoy.getParkingLots().get(0), parkingLot1);
        assertEquals(parkingBoy.getParkingLots().get(1), parkingLot2);
        assertEquals(parkingBoy.getParkingLots().get(2), parkingLot3);
    }

    @Test
    public void could_parking_success() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = ParkingLot.of(1, 0,"PARKING_LOT_1");
        ParkingLot parkingLot2 = ParkingLot.of(2, 3, "PARKING_LOT_2");
        ParkingLot parkingLot3 = ParkingLot.of(3, 10, "PARKING_LOT_3");
        parkingLots.add(parkingLot2);
        parkingLots.add(parkingLot3);
        parkingLots.add(parkingLot1);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);

        ParkingLot parkingLot = parkingBoy.choseParkingLot();
        assertNotNull(parkingLot);
        assertEquals(parkingLot.getSerialNumber(), "PARKING_LOT_2");
    }

    @Test
    public void could_parking_failed_when_all_parking_lot_do_not_has_capacity() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = ParkingLot.of(1, 0,"PARKING_LOT_1");
        ParkingLot parkingLot2 = ParkingLot.of(2, 0, "PARKING_LOT_2");
        ParkingLot parkingLot3 = ParkingLot.of(3, 0, "PARKING_LOT_3");
        parkingLots.add(parkingLot2);
        parkingLots.add(parkingLot3);
        parkingLots.add(parkingLot1);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);

        ParkingLot parkingLot = parkingBoy.choseParkingLot();
        assertNull(parkingLot);
    }
}
