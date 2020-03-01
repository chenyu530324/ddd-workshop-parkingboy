package ddd.workshop.parkingboy;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ParkingBoy {

    private final List<ParkingLot> parkingLots;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        Collections.sort(parkingLots);
        this.parkingLots = parkingLots;
    }

    public List<ParkingLot> getParkingLots() {
        return this.parkingLots;
    }

    public Ticket parking(Car car) {
        Ticket ticket = null;
        Iterator<ParkingLot> parkingLotList = parkingLots.iterator();
        while (null == ticket && parkingLotList.hasNext()) {
            ParkingLot parkingLot = parkingLotList.next();
            ticket = parkingLot.parking(car);
        }
        return ticket;
    }
}
