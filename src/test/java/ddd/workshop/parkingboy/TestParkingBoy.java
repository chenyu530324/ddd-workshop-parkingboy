package ddd.workshop.parkingboy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestParkingBoy {

    @Test
    public void could_set_parkingLots_for_parkingBoy() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = ParkingLot.of(1);
        ParkingLot parkingLot2 = ParkingLot.of(2);
        ParkingLot parkingLot3 = ParkingLot.of(3);
        parkingLots.add(parkingLot2);
        parkingLots.add(parkingLot3);
        parkingLots.add(parkingLot1);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);
        assertEquals(parkingBoy.getParkingLots().get(0), parkingLot1);
        assertEquals(parkingBoy.getParkingLots().get(1), parkingLot2);
        assertEquals(parkingBoy.getParkingLots().get(2), parkingLot3);
    }
}
