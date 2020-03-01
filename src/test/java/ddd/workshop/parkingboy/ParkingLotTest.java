package ddd.workshop.parkingboy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ParkingLotTest {

    @Test
    public void could_parking_success() {
        ParkingLot parkingLot = ParkingLot.of(1);
        Car car = new Car("PLATE_NUMBER");
        Ticket ticket = parkingLot.parking(car);
        assertNotNull(ticket);
        assertEquals(ticket.getCarPlateNumber(), car.getPlateNumber());
    }

}