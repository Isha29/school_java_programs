import java.util.*;
class PrintJob 
{
  
   void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the capacity of the printing jobs");
        int capacity=sc.nextInt();       
        queue ob=new queue(capacity);
        while(true)
        {
            System.out.println("Enter your choice \n 1 for adding jobs \n 2 for removing jobs \n 3 for display \n 4 for clear \n 5 for exit");
            int choice=sc.nextInt();
            if(choice==1)
            {
                ob.insert();
                ob.display();
            }
            else if(choice==2)
            {
                ob.delete();
                ob.display();
            }
                else if(choice==3) 
                ob.display();               
                else if(choice==5)
                break;
                else
                {   
                    System.out.println("Wrong choice");
                }
            }
    }
}