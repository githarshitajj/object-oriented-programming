package classesObjects.level2;

class MovieTicket {
String movieName;
int seatNumber;
double price;

// Constructor
public MovieTicket(String movieName, int seatNumber, double price) {
    this.movieName = movieName;
    this.seatNumber = seatNumber;
    this.price = price;
}

// Method to book a ticket
public void bookTicket(int seatNumber, double price) {
    this.seatNumber = seatNumber;
    this.price = price;
    System.out.println("Ticket booked for seat: " + seatNumber);
}

// Method to display ticket details
public void displayTicketDetails() {
    System.out.println("Movie: " + movieName);
    System.out.println("Seat Number: " + seatNumber);
    System.out.println("Price: " + price);
}
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers", 0, 0);
        ticket.bookTicket(15, 12.5);
        ticket.displayTicketDetails();
    }
}
