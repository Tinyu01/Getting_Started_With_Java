public class Getting_Started_With_Java {

    public static void main(String[] args) {
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        int numberTickets = 8;
        double pricePerTicket = 10.57;


        double totalPrice = numberTickets * pricePerTicket;



        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        System.out.println("Username: " + firstName.toLowerCase() +lastName.toLowerCase());
        System.out.println("Movie: " + movieTitle.toUpperCase());
        System.out.println("Number of Tickets: " + numberTickets);
        System.out.println("Price per ticket: " + "$" + pricePerTicket);
        System.out.println("Total Price of 8 tickets: " + "$" + totalPrice + "\n");

        System.out.println("Thank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");
        
    }

}
