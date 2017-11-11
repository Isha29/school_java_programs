import java.util.*;
class Overtime extends Staff
{
   int ndays,ex_hrs;
   double rate;
   Overtime(int n, double r, int h)
   {
       ndays=n;
       ex_hrs=h;
       rate=r;
    }
    Double calculate()
    {       
        double total=this.basic+(ndays*rate*ex_hrs);
        return total;
    }
    void showSalary()
    {
        System.out.println("The number of days worked: "+ndays);
        System.out.println("The rate per hour is: "+rate);
        System.out.println("The total salary is: "+calculate());        
    }
   public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days worked by the staff: ");
        int ndays=sc.nextInt();
        System.out.println("Enter the number of hours worked by the staff: ");
        int ex_hrs=sc.nextInt();
        System.out.println("Enter the rate per hour: ");
        double rate=sc.nextDouble();        
        Overtime obj=new Overtime(ndays, rate, ex_hrs);
        obj.input();
        obj.showSalary();
        obj.printdata();
    }
}
