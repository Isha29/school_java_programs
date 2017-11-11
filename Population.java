import java.util.Scanner;
class Population
{
Scanner sc=new Scanner(System.in);
int p;
int r;
Population(int a, int b)
{
this.p=a;
this.r=b;
}
void input()
{
System.out.println("Enter the initial population of the country");
p=sc.nextInt();
System.out.println("Enter the growth rate");
r=sc.nextInt();
}
void print()
{
int pp=0;
for(int i=2001;i<=2010;i++)
{
 pp=p*(1+r/100); 
 System.out.println("The population of at the end of "+i+" = "+pp);
 p+=pp;
}
}
void main()
{
Population obj=new Population(p,r);
obj.input();
obj.print();
}
}