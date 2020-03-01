package ddd.workshop.parkingboy;

public class TicketFactory {
    public static Ticket createNewTicket(Car car) {
        return new Ticket(car.getPlateNumber());
    }
}
