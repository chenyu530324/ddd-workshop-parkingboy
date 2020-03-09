package ddd.workshop.parkingboy;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SeniorParkingBoy extends ParkingBoy {

    public SeniorParkingBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    public ParkingLot chooseParkingLot() {
        LinkedList<ParkingLot> linkedParkingLots = new LinkedList<>(parkingLots);
        linkedParkingLots.sort(Comparator.comparingInt(ParkingLot::getCapacity));
        ParkingLot parkingLot = linkedParkingLots.getLast();
        return parkingLot.isAvailable() ? parkingLot : null;
    }
}
