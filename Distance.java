import java.util.Scanner;
class Distance extends Point
{ 
 double midx, midy;
 Scanner sc=new Scanner(System.in);
 Distance()
 {
     super();
     midx=0;
     midy=0;
    }
  void readPoint()
  {          
      System.out.println("Enter the coordinates of the first point:");
      x1=sc.nextDouble();
      y1=sc.nextDouble();
      System.out.println("Enter the coordinates of the second point:");
      x2=sc.nextDouble();
      y2=sc.nextDouble();
    }
    
    void FindDistance()
    {

         dis=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));         
    }
    
    void FindMidPoint()
    {
      midx=(x1+x2)/2;
      midy=(y1+y2)/2;
    }
    
    void Show()
    {
        readPoint();
        FindDistance();
        FindMidPoint();
        System.out.println("The distance between two points :"+ dis);
        System.out.println("The mid point between two x coordinates :"+ midx);
        System.out.println("The mid point between two y coordinates :"+ midy);
        
    }
}