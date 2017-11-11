import java.util.Scanner;
class Stat
{
Scanner sc=new Scanner(System.in);
int a[];
double m;
double sd;
Stat(int nn)
{
a=new int[nn];
m=0.0;
sd=0.0;
}
void input()
{
System.out.println("Enter the numbers");
for(int i=0;i<a.length;i++)
{
 a[i]=sc.nextInt();
}
}
int mean()
{
double sum=0.0;
for(int i=0;i<a.length;i++)
{
sum+=a[i];
}
m=sum/10;
return (int)m;
}
void dev()
{
for(int i=0;i<a.length;i++)
{
sd=mean()-a[i];
System.out.println(sd);
}
}
void main()
{
System.out.println("Enter the number of entries");
int n=sc.nextInt();
Stat obj=new Stat(n);
obj.input();
obj.dev();
}
}