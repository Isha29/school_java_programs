import java.util.*;
class PrintJob2 //extends Printnode 
{
   static Scanner sc=new Scanner(System.in);
  /* void addJobs()
   {        
      this.create();
    }
   void removeJobs()
   {
       this.removeLast();      
    }   */
    public static void main()
    {
        //PrintJob2 obj=new PrintJob2();
        Printnode ob=new Printnode();
        
         while(true)
        {
            System.out.println("Enter your choice \n 1 for adding jobs \n 2 for removing jobs \n 3 for display  \n 5 for exit");
            int choice=sc.nextInt();
            if(choice==1)
            {
                ob.create();
                ob.display();
            }
            else if(choice==2)
            {
                ob.removeLast();
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