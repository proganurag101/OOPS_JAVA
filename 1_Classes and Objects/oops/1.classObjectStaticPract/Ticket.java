public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    int booking;
    
    //setter_ticked_id
    public void setTicketid(int id){
        ticketid = id;
    }
    public int getTicketid(){
        return this.ticketid;
    }
    
    //getter_price
    public int getPrice(){
        return this.price;
    }
    //setter_price
    public void setPrice(int val){
        
        this.price = val;
        
    }
    
    //getter_availableTickets
    public static int getAvailableTickets(){
        return availableTickets;
    }
    //setter_availableTickets
    public static void setAvailableTickets(int num){
        if(num>0){
          availableTickets = num;
        }
    }
    
    public int calculateTicketCost(int nooftickets){
        if(nooftickets<=getAvailableTickets()){
            System.out.println("Available tickets: "+getAvailableTickets());        //can also use values directly without methods.
            availableTickets -= nooftickets;
            return nooftickets*getPrice();
        }else{
            return -1;
        }
    }
    
    
    
    
    
}
