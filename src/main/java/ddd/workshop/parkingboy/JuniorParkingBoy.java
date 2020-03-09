package ddd.workshop.parkingboy;

import java.util.Comparator;
import java.util.List;

public class JuniorParkingBoy extends ParkingBoy {

    public JuniorParkingBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
        this.parkingLots.sort(Comparator.comparingInt(ParkingLot::getSortIndex));
    }

    @Override
    public ParkingLot chooseParkingLot() {
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.isAvailable()) {
                return parkingLot;
            }
        }
        return null;
    }
}
