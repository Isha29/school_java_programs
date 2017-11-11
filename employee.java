//pg501 qs12

import java.util.Scanner;
class employee
{
  Scanner sc=new Scanner(System.in);  
  int pan;
  double taxinc;
  double tax;
  String name; 
  employee()
  {
     pan=0;
     taxinc=0.0;   
     name=null;
    }
    void input()
    {
       System.out.println("Enter the P.A.N");
       pan=sc.nextInt();
       System.out.println("Amount taxable :");
       taxinc=sc.nextDouble();
        System.out.println("Enter name of employee:");
       name=sc.next();
       
       
    }
    void cal()
    {
        if(taxinc<=100000)
        tax=0;
        else if(taxinc>100000 &&taxinc<=150000)
        tax=(taxinc-100000)*10.0/100.0;
        if(taxinc>150000 && taxinc<=250000 )
       tax=5000+(taxinc-150000)*20.0/100.0;  
        if(taxinc>250000 )
       tax=25000+(taxinc-250000)*30.0/100.0;  
       
    }  
    void display()
    {        
         employee obj=this;
         obj.input();
         obj.cal();
        System.out.println("P.A.N \t Name \t Tax income \t Tax");
        System.out.println(obj.pan+" \t"+obj.name+" \t"+obj.taxinc+" \t"+obj.tax);        
        
    }
}