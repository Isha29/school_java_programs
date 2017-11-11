
import java.util.Scanner;
class queueOP
{
int front,rear,n,a;
int Q[];
Scanner sc=new Scanner(System.in);
queueOP(int nn)
{
Q=new int[nn];
front=-1;
rear=-1;
n=nn;
}
boolean checkOverflow()
{
 return (rear==(n-1))?true:false;
}
void insert()
{
System.out.println("Enter an element to insert");
int item=sc.nextInt();
if(!checkOverflow())
{
 if(front==-1 && rear==-1)
 {
     front=0;
     rear=0;
    }
    else
    {
        rear+=1;
    }
        Q[rear]=item;
    
}
}
boolean underflow()
{
return (front==-1 && rear==-1)?true:false;
}
void delete()
{
int val;
if(underflow())
{
System.out.println("Queue underflow");
}
else
{
val=Q[front];
System.out.println("deleted element is: "+val);
if(front==rear)
{
front=-1;
rear=-1;
}
else
{
front+=1;
}
}
}
void display()
{

if(underflow())
System.out.println("Queue empty");
else
{
System.out.println("The elements of the array are");
for(int i=front;i<=rear;i++)
{
System.out.println("  |"+Q[i]+"| ");
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

queueOP obj=new queueOP(a);

while(true)
{
System.out.println("Enter your choice \n 1 for inserting elements \n 2 for deleting elements \n 3 for display \n 4 for clear \n 5 for exit");
int choice=sc.nextInt();
if(choice==1)
{

obj.insert();
obj.display();
}
else if(choice==2)
{
obj.delete();
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
