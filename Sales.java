import java.util.Scanner;
class Sales extends Representative
{
int bno, qty;
double pr, sales;
String pname;
Scanner sc=new Scanner(System.in); 
    
    void read(int b, int q,double p)
    {
      System.out.println("Enter the bill number");
      b=sc.nextInt();
      this.bno=b;
      System.out.println("Enter the quantity");
      q=sc.nextInt();
      this.qty=q;      
      System.out.println("Enter the price");
      p=sc.nextDouble();
      this.pr=p;
    }
    
    void read(double s, String pn)
    {
      System.out.println("Enter the sales");
      s=sc.nextDouble();
      this.sales=s;  
      System.out.println("Enter the product name");
      pn=sc.next();
      this.pname=pn;
    }
    void cal()
    {
        double t=qty*pr;
         System.out.println("The total sales is:"+t);
    }
    
    void display()
    {
         System.out.println("The name is:"+pname);
         System.out.println("The bill number is:"+bno);
          System.out.println("The quantity is:"+qty);
          System.out.println("The price is:"+pr);
           System.out.println("The sales is:"+sales);
           cal();
    }
    
}