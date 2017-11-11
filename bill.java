import java.util.Scanner;
class bill extends detail
{
int n;
double amt;
Scanner sc=new Scanner(System.in);
bill(int n,String name, String address, long telno, double rent)
{
 super(name,address,telno,rent);
 this.n=n;
 this.amt=amt;
}
void cal()
{
if(n>=1 && n<=100)
amt=rent;
else if(n>100 && n<=200)
amt=rent+0.60*(n-100);
else if(n>200 && n<=300)
amt=rent+0.80*(n-200);
else if(n>300)
amt=rent+1.0*(n-300);
else
amt=0;
System.out.println("the amount to be paid by customer: "+amt);
}
void show()
{
super.show();
System.out.println("The number of calls is: "+n);
this.cal();
}
}