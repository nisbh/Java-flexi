class SeatNotAvailableException extends Exception{
    SeatNotAvailableException(String message){
        super(message);
    }
}
class Movie {
    String movieName;
    int availableSeats;
    Movie(String movieName,int availableSeats){
        this.movieName=movieName;
        this.availableSeats=availableSeats;
    }
    void bookTicket(int seats)throws SeatNotAvailableException{
        if (seats<=availableSeats){
            availableSeats-=seats;
            System.out.println(seats+"seats booked for"+movieName);
            System.out.println("Remaining seats: "+availableSeats);
        }else{
            throw new SeatNotAvailableException(
                "Seats not available for"+movieName
            );
        }
    }
}
public class MovieTicketBooking{
    public static void main(String[] args){
        Movie movie=new Movie("Inception",5);
        try {
            movie.bookTicket(2);
            movie.bookTicket(2);
            movie.bookTicket(2); 
        }
        catch (SeatNotAvailableException e){
            System.out.println("Booking Failed: "+e.getMessage());
        }
    }
}