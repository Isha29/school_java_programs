import java.util.Scanner;
class Triangle
{
  Scanner sc=new Scanner(System.in); 
  int x,y,z;
  int a1, a2, a3;
  boolean checkTriangle()
  {
      return ((this.x+this.y)>this.z || (this.x+this.z)>this.y || (this.z+this.y)>this.x)?true:false;
  }
  boolean checkEqui()
  {
      return(this.x==this.y && this.y==this.z)?true:false;
    }
   boolean checkScalene()
  {
      return(x!=y && y!=z && x!=z)?true:false;
    }
   boolean checkIsoceles()
  {
      return(x==y && y!=z || x!=y && y==z)?true:false;
    }
  void inputSides()
  {
       System.out.println("Enter the sides of the triangle");
       x=sc.nextInt();
      
        y=sc.nextInt();
       z=sc.nextInt();
    } 
    void inputAngles()
  {
       System.out.println("Enter the angles of the triangle");
       x=sc.nextInt();
      
       y=sc.nextInt();
        z=sc.nextInt();
    } 
  boolean checkRightAngled()
  {
      return (this.a1==90 || this.a2==90 || this.a3==90)?true:false;
  } 
 boolean checkObtuse()
  {
      return (this.a1>90 || this.a2>90 || this.a3>90)?true:false;
  } 
  boolean checkAcute()
  {
      return (a1<90 || a2<90 || a3<90)?true:false;
  } 
  void displaysides()
  {
     System.out.println( this.x);
    System.out.println( this.y);
    System.out.println( this.z);
    }
  void main()
  { 
    Triangle obj=new Triangle();  
      System.out.println("Enter your choice \n Enter 1 to chheck with sides \n Enter 2 to chheck with angles");  
      int n=sc.nextInt();     
     // obj.inputSides();
          //obj.displaysides();
      switch(n)
     {
          case 1:
          {
          obj.inputSides();
          obj.displaysides();
          if(obj.checkTriangle())
          {
              if(obj.checkEqui())
             {                
       System.out.println("It is an equilatearal triangle"); 
       }
      /*  if(obj.checkScalene(x,y,z))
             {                
          System.out.println("It is a Scalene triangle"); 
              
            }
             if(obj.checkIsoceles(x,y,z))
             {                
       System.out.println("It is an isoceles triangle"); 
        }*/
    }
    else
    {                    
       System.out.println("It is not  a triangle"); 
    }
}
     break; 
    
      case 2:
      {
          obj.inputAngles();
          if(obj.checkTriangle())
          {
              if(obj.checkAcute())
             {                
       System.out.println("It is an eacute anglead triangle"); 
       }
      /*  if(obj.checkObtuse(x,y,z))
             {                
           System.out.println("It is an obtuse anglead triangle"); 
              
            }
             if(obj.checkRightAngled(x,y,z))
             {                
        System.out.println("It is an right anglead triangle"); 
        }*/
    }
    else
    {
                   
       System.out.println("It is not  a triangle"); 
    }
}
     break; 
    default:
     System.out.println("Wrong input"); 
    }
}
}

        
        