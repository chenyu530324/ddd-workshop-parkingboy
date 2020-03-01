package ddd.workshop.parkingboy;

public class Ticket {

    private String carPlateNumber;

    public Ticket(String plateNumber) {
        this.carPlateNumber = plateNumber;
    }

    public String getCarPlateNumber() {
        return carPlateNumber;
    }
}
