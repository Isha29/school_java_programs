import java.util.Scanner;
class Discount
{
int cost;
String name;
double dc;
double amt;
Discount()
{
this.cost=0;
this.name=null;
this.dc=0.0;
this.amt=0.0;
}
Scanner sc=new Scanner(System.in);
void input()
{
System.out.println("enter the name of the customer");
this.name=sc.nextLine();
System.out.println("enter the cost");
this.cost=sc.nextInt();
}
double getDiscount()
{
 if(cost<=5000)
    return dc;
   else if(cost>5000 && cost<=10000)
       return (dc=(10.0/100.0)*cost);
  else if(cost>10000 && cost<=15000)
    return (dc=(15.0/100.0)*cost);
   else if(cost>15000)
    return (dc=(20.0/100.0)*cost);
    else
    return 0.0;
}
void cal()
{
this.amt=this.cost+this.dc;
System.out.print(this.amt);
}
void display()
{
this.input();
System.out.println("Name of the customer\tDiscount\tAmount to be paid");
System.out.print("\t"+this.name+"\t\t");
this.dc=this.getDiscount();
System.out.print(this.dc+"\t\t");
this.cal();
System.out.print("\t");
}
}