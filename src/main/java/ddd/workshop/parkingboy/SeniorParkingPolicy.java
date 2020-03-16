package ddd.workshop.parkingboy;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SeniorParkingPolicy implements ParkingPolicy {
    @Override
    public ParkingLot findParkingLog(List<ParkingLot> parkingLots) {
        LinkedList<ParkingLot> linkedParkingLots = new LinkedList<>(parkingLots);
        linkedParkingLots.sort(Comparator.comparingInt(ParkingLot::getCapacity));
        ParkingLot parkingLot = linkedParkingLots.getLast();
        return parkingLot.isAvailable() ? parkingLot : null;
    }
}
