import java.util.*;
class Point1
{
   double x1, y1, x2,y2;
   Point1()
   { 
        x1=0.0;
        x2=0.0;
        y1=0.0;
        y2=0.0;
    }
    void accept()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the vale of L(x,y): ");
      x1=sc.nextDouble();
      y1=sc.nextDouble();
      System.out.println("Enter the vale of M(x,y): ");
      x2=sc.nextDouble();
      y2=sc.nextDouble();
    }
    void print()
    {
        System.out.println("The first point is: L("+x1+","+y1+")");
        System.out.println("The second point is: M("+x1+","+y1+")");
        System.out.println("Hence the line joins the points: L("+x1+","+y1+") and M("+x1+","+y1+")");
    }
   
}
   
