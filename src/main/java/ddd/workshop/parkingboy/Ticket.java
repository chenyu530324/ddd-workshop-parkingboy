package ddd.workshop.parkingboy;

public class Ticket {

    private String carPlateNumber;
    private String parkingLotSerialNumber;

    public Ticket(Car car, ParkingLot parkingLot) {
        this.carPlateNumber = car.getPlateNumber();
        this.parkingLotSerialNumber = parkingLot.getSerialNumber();
    }

    String getCarPlateNumber() {
        return carPlateNumber;
    }

    String getParkingLotSerialNumber() {
        return this.parkingLotSerialNumber;
    }
}
