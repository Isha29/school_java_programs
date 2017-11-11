
import java.util.Scanner;
class stackop
{
int sp,n,a;
int s[];
Scanner sc=new Scanner(System.in);
stackop(int nn)
{
s=new int[nn];
sp=-1;
n=nn;
}
boolean checkOverflow()
{
 return (sp==(n-1))?true:false;
}
void push()
{
System.out.println("Enter an element to push");
int item=sc.nextInt();
if(!checkOverflow())
{
++sp;
s[sp]=item;
}
}
boolean underflow()
{
return (sp==-1)?true:false;
}
void pop()
{
int val;
if(underflow())
{
System.out.println("Stack underflow");
}
else
{
val=s[sp];
System.out.println("Popped out element is: "+val);
sp--;
}
}
void display()
{

if(underflow())
System.out.println("Stack empty");
else
{
System.out.println("The elements of the array are");
for(int i=sp;i>=0;i--)
{
System.out.println("  |"+s[i]+"| ");
System.out.println(" ______");
}
}
}
void clear()
{
System.out.print('\u000c');
}
 void main()
{
System.out.println("Enter the number of elements");
a=sc.nextInt();

stackop obj=new stackop(a);

while(true)
{
System.out.println("Enter your choice \n 1 for pushing elements \n 2 for popping elements \n 3 for display \n 4 for clear \n 5 for exit");
int choice=sc.nextInt();
if(choice==1)
{

obj.push();
obj.display();
}
else if(choice==2)
{
obj.pop();
obj.display();
}
else if(choice==3)
obj.display();
else if(choice==4)
clear();
else if(choice==5)
break;
else
{
System.out.println("Wrong choice");
}
}
}
}