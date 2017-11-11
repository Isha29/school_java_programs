import java.util.Scanner;
abstract class Point
{
  double x1,x2,y1,y2, dis;
  Point()
  {
      x1=0.0;
      y1=0.0;
      x2=0.0;
      y2=0.0;      
    }
    
    abstract void readPoint();
    
    
    
     abstract void FindDistance();
     
    
    void Show()
    {
        System.out.println("The first point is : ("+x1+","+y1+")");
        System.out.println("The second point is : ("+x2+","+y2+")");
    }
    
}