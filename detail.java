import java.util.Scanner;
class detail
{
String name;
String address;
long telno;
double rent;
 detail(String name, String address, long telno, double rent)
 {
   this.name=name;
   this.address=address;
   this.telno=telno;
   this.rent=rent;
    }
    void show()
    {
        System.out.println("The name of the customer: "+name);
         System.out.println("The address of the customer: "+address);         
          System.out.println("The telno of the customer: "+telno);
           System.out.println("The rent of the customer: "+rent);        
    }
    
 }