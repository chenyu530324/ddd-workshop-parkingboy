package ddd.workshop.parkingboy;

import java.util.List;

public class JuniorParkingPolicy implements ParkingPolicy {
    @Override
    public ParkingLot findParkingLog(List<ParkingLot> parkingLots) {
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.isAvailable()) {
                return parkingLot;
            }
        }
        return null;
    }
}
