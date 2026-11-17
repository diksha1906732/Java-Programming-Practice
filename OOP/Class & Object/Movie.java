public class Movie {

    String movieName;
    int ticketPrice;
    int availableSeats;

    void bookTicket(int seats) {

        if (seats > 0 && seats <= availableSeats) {

            availableSeats = availableSeats - seats;

            System.out.println("Tickets booked successfully!");

        } else {
            System.out.println("Tickets not available!");
        }
    }

    void cancelTicket(int seats) {

        if (seats > 0) {

            availableSeats = availableSeats + seats;

            System.out.println("Tickets cancelled successfully!");

        } else {
            System.out.println("Invalid number of tickets!");
        }
    }

    void displayAvailableSeats() {

        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Available Seats: " + availableSeats);
    }

    public static void main(String[] args) {

        Movie m1 = new Movie();

        m1.movieName = "Avengers";
        m1.ticketPrice = 200;
        m1.availableSeats = 100;

        m1.displayAvailableSeats();

        m1.bookTicket(5);

        m1.displayAvailableSeats();

        m1.cancelTicket(2);

        m1.displayAvailableSeats();
    }
}