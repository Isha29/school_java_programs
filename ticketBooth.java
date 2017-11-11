import java.util.Scanner;
class ticketBooth
{
   int people, amount;
   private int ticketPrice;
   ticketBooth()
   {
       this.people=0;
       this.amount=0;
       this.setTicketPrice(250);
   }
    
   void setTicketPrice(int price)
   {
    this.ticketPrice = price;
   }
   
   int getTicketPrice()
   {
    return this.ticketPrice;
   }
   
   int visitCounter()
   {
    return this.people++;      
   }
   
   int buyTicket()
   {
     this.amount+= this.getTicketPrice();
     return amount;
   }
   void display()
   {
       Scanner sc=new Scanner(System.in);
       
       int noOfTickets=0;
       while(true)
       {
           System.out.println("Do you want to visit the ticket counter?(yes/no)");
          String ans1=sc.next();
         if(ans1.equalsIgnoreCase("yes"))
         {
           visitCounter();
           System.out.println("Do you want to purchase a ticket?(yes/no)");
           String ans2=sc.next();
           if(ans2.equalsIgnoreCase("yes"))
           {
               buyTicket();  
               noOfTickets++;
            }          
             
        }
        else
        {
            System.out.println("They don't want to visit this counter");  
            System.out.println('\u000c');            
        }
        System.out.println("Do you want to continue?(yes/no)");
         String ans3=sc.next();
        if(ans3.equalsIgnoreCase("yes"))
        {
            System.out.println('\u000c');
            continue;
        }
        else
        {
            break;
        }
       }
        
        System.out.println("The total number of people who have visited the counter: "+people);
         System.out.println("The total number of tickets purchased: "+noOfTickets);
        System.out.println("The total amount : "+amount);
    }   
}