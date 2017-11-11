import java.util.Scanner;
class Telephone
{
 int prv,pre,unit;
 String name;
 double amt,total; 
 Telephone()
 {
   prv=0;
   pre=0;
   unit=0;
   name=null;
   amt=0.0;
   total=0.0;   
 }
 void input() 
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the previous reading, present reading and the name");
     prv=sc.nextInt();
     pre=sc.nextInt();
     name=sc.next();     
    }
  int getUnit()
  {
      unit=pre-prv;
      return unit;
    }
    double getRate()
    {
        double rate=0.0;
        if(getUnit()<=100)
        {
           rate=0.0;
        }
         if(getUnit()>100 &&  getUnit()<=200)
        {
            rate=((getUnit()-100)*0.90);
        }
          if(getUnit()>200 &&  getUnit()<=500)
        {
            rate=((getUnit()-200)*0.80);
        }
           if(getUnit()>500)
        {
            rate=((getUnit()-500)*0.70);
        }
         if(getUnit()<=10)
        {
            rate=0.0;
        } 
        return rate;
    }
    void cal()
    {
        amt=getRate();
        total=amt+180.0;
        System.out.print("\t"+total);
    }
    void display()
    {
        input(); 
        System.out.println("Name  Unit  Amount");
        System.out.print(name+" ");
        System.out.print(" "+getUnit());
        cal();
    }
}