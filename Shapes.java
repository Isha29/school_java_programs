import Mensuration.Area;
import Mensuration.Perimeter;
class Shapes
{
   void getAreaOfSquare(int s)
   {
       System.out.println(Area.ofSquare(s));
   }
   void getPerimeterOfRectangle(int l, int b)
   {
       System.out.println(Perimeter.ofRectangle(l,b));
   }
}