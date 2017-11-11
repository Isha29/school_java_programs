 class Perimeter
{
 double a,b;
 Perimeter(double c, double d)
 {
     this.a=c;
     this.b=d;
    }
 double Calculate()
 {
    double p=2*(a+b);
    return p;
 }
 void show()
 {
  System.out.println("The length of the parallelogram is: "+a);
  System.out.println("The breadth of the parallelogram is: "+b);
  System.out.println("The perimeter of the parallelogram is: "+Calculate());
 }
}
 public class Area extends Perimeter
{
  double h, b;
  Area(double h, double a, double b)
  {
   super(a,b);
   h=h; 
   b=b;
  }
  void doArea()
  {
   double area=(b*h);
   System.out.println("The area of the paralellogram is: "+ area);
  }
  void show()
  { 
    
  System.out.println("The height of the parallelogram is: " + this.h + " - " + b);
  super.show();
  this.doArea();
  }
}