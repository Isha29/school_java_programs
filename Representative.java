import java.util.Scanner;
class Representative
{
  String name, address;
 Representative()
 {
     name=null;
     address=null;
    }
    Scanner sc=new Scanner(System.in);
    void read(String name, String add)
    {
         System.out.println("Enter the name of the representative");
         name=sc.next();
         System.out.println("Enter the address of the representative");
         add=sc.nextLine();
         this.name=name;
         this.address=add;
    }
    
    void display()
    {
         System.out.println("The name of the customer "+name);
         System.out.println("The address of the customer "+address);
    }
    
}