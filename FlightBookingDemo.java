class NoSeatsAvailableException extends Exception{
    NoSeatsAvailableException(String message){
        super(message);
    }
}
class Flight{
    int availableSeats;
    Flight(int availableSeats){
        this.availableSeats=availableSeats;
    }
    void bookSeat(int seats)throws NoSeatsAvailableException{
        if (availableSeats==0||seats>availableSeats){
            throw new NoSeatsAvailableException("No seats available on this flight");
        }
        availableSeats-=seats;
        System.out.println(seats+"seat(s) booked successfully");
        System.out.println("Remaining seats: "+availableSeats);
    }
}
public class FlightBookingDemo{
    public static void main(String[] args) {
        Flight flight=new Flight(3);
        try {
            flight.bookSeat(1);
            flight.bookSeat(2);
            flight.bookSeat(1);
        }
        catch (NoSeatsAvailableException e){
            System.out.println("Booking Failed: "+e.getMessage());
        }
    }
}