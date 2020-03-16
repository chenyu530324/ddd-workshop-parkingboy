package ddd.workshop.parkingboy;

import java.util.List;

public interface ParkingPolicy {

    ParkingLot findParkingLog(List<ParkingLot> parkingLots);
}
