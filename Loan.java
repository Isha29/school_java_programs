//pg504 qs18

import java.util.Scanner;
class Loan
{
  Scanner sc=new Scanner(System.in);  
  int time;
  double principal;
  double rate;
  double interest;
  double amt;
  Loan()
  {
      time=0;
   principal=0.0;
   rate=0.0;
   interest=0.0;
  amt=0.0;
    }
    void getdata()
    {
       System.out.println("Time for which the loan was sanctioned:");
       time=sc.nextInt();
       System.out.println("Amount sanctioned :");
       principal=sc.nextDouble();
    }
    void getRate()
    {
        if(time<=5)
        rate=15.0;
        else if(time>5 &&time<=10)
        rate=12.0;
        if(time>10)
        rate=10;        
    }
    void calculate()
    {
       interest=principal*rate*time/100;
       amt=interest+principal;
       System.out.println(interest);
       System.out.println(amt);
    }
    void display()
    {
        Loan obj=new Loan();
       obj. getdata();
        obj.calculate();
    }
}