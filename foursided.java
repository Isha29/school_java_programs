import java.util.Scanner;
class foursided
{
int length,breadth;
Scanner sc=new Scanner(System.in);
 foursided(int side)
 {
    this.length=side; 
    this.breadth=side;
 }
 foursided(int length,int breadth)
 {
    this.length=length; 
    this.breadth=breadth;
 }
 int getArea()
 {
     return (this.length*this.breadth);
    }
 void main(int length, int breadth)
 {     
     foursided square=new foursided(length);
     foursided rectangle=new foursided(length,breadth);
     System.out.println("Area of square "+square.getArea());
     System.out.println("Area of squarerectangle "+rectangle.getArea());     
    }
}