import java.util.*;
class Circle extends Point1
{    
   double cal_length()
   {      
       double radius=Math.sqrt((this.x2-this.x1)+(this.y2-this.y1));
       return radius;
    }
   double cal_area()
   {       
       double area=2*3.14*Math.pow(cal_length(),2);
       return area;
    }
    void print()
    {
        this.accept();
        super.print();
        System.out.println("The length of the radius of this circle is: "+ cal_length());
        System.out.println("The area of this circle is: "+cal_area());   
        
    }
}