import java.util.Scanner;
public class Apartment implements Paint
{
 int rooms, area;
  Apartment(int rooms,int area)
  {
      this.rooms=rooms;
      this.area=area;
    }
  public void Colour(String colourName)
   {      
       System.out.println("The colour of my house is :"+colourName);
    }
    public int Area(int sqft)
    {
        return sqft;        
    }
  public  boolean hasTexture(boolean ans)
    {
        return ans;
    }
    void display()
    {
       Colour("red");
       System.out.println("The area is: "+this.Area(this.area));
      System.out.println("It has texture: "+this.hasTexture(true));
       
    }
}