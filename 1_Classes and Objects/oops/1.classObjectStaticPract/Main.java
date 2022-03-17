import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket t1 = new Ticket();
        System.out.println("Enter no of bookings:");
        t1.booking = sc.nextInt();
        
        int count = t1.booking;

        System.out.println("Enter the available tickets:");
        t1.setAvailableTickets(sc.nextInt());

        while(count>0){
            
        System.out.println("Enter the ticketid: ");
        t1.setTicketid(sc.nextInt());
        
        System.out.println("Enter the price: ");
        t1.setPrice(sc.nextInt());
        
        System.out.println("Enter the no of tickets: ");
        int noOfTickets = sc.nextInt();
        
        System.out.println("Total amount:"+t1.calculateTicketCost(noOfTickets));
        
        System.out.println("Available ticket after booking:"+t1.getAvailableTickets());
        
        count--;
        }
    }
}
