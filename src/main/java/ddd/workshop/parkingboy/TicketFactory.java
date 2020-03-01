package ddd.workshop.parkingboy;

public class TicketFactory {
    public static Ticket createNewTicket(Car car, ParkingLot parkingLot) {
        return new Ticket(car, parkingLot);
    }
}
