import java.util.*;
class create extends node
{
   static Scanner sc=new Scanner(System.in);
   void input()
   {        
       for(;;)
       {   
           System.out.println("Enter an element: ");
           this.create();
           System.out.println("Do you want to continue?(1=Yes/ 0=no)");
           int n=sc.nextInt(); 
           if(n!=1)
           {
               break;
            }
        }
    }
   void display()
   {
       this.input();
       this.displayNodes();
    }
}