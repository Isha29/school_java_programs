
import java.util.Scanner;
public class Current extends Account 
{
  double amount;  
  Current()
  {
      super();
      this.amount=0.0;
    }
  void input() 
  {     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the amount :");
      amount=sc.nextDouble();  
      openBalance=amount;
      System.out.println("Enter the name of the customer :");
      name=sc.next();
      System.out.println("Enter the account number: ");
      accNo=sc.nextInt();      
  }  
    void display()
    {       
        input();
        System.out.println("The account number is: "+accNo );
        System.out.println("The name of the customer is: "+name);
        System.out.println("The opening balance of the customer is: Rs."+openBalance);                
    }
}

