package ddd.workshop.parkingboy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ParkingLotTest {

    @Test
    public void could_parking_success() {
        ParkingLot parkingLot = ParkingLot.of(1, 2, "PARKING_LOT_1");
        Car car = new Car("PLATE_NUMBER");
        Ticket ticket = parkingLot.parking(car);
        assertNotNull(ticket);
        assertEquals(ticket.getCarPlateNumber(), car.getPlateNumber());
    }

    @Test
    public void could_not_parking_success_when_parkingLot_have_no_capacity() {
        ParkingLot parkingLot = ParkingLot.of(1, 0, "PARKING_LOT_1");
        Car car = new Car("PLATE_NUMBER");
        Ticket ticket = parkingLot.parking(car);
        assertNull(ticket);
    }

}