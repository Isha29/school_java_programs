
import java.util.Scanner;
class queue
{
int front,rear,capacity;
int Q[];
Scanner sc=new Scanner(System.in);
queue(int n)
{
Q=new int[n];
front=0;
rear=0;
capacity=n;
}
boolean isOverflow()
{
 return (rear==(capacity))?true:false;
}
void showOverflow()
{
  if(isOverflow())
  {
      System.out.println("PrintJob is full, cannot add anymore");
    }
}
void insert()
{
System.out.println("Enter the number of sheets to print in this job");
int newjob=sc.nextInt();
if(!this.isOverflow())
{   
       Q[rear]=newjob;
       rear+=1;    
}
}
boolean isUnderflow()
{
return (front==0 && rear==0)?true:false;
}
void showUnderflow()
{
   System.out.println("PrintJob is empty");
}
void delete()
{
int val;
 if(!this.isUnderflow())
   {
   val=Q[front];
   front=front+1;
  if(front==rear)
  {
      front=0;
      rear=0;
    }
   }
}
void display()
{

if(isUnderflow())
showUnderflow();
else
{
System.out.println("The elements of the array are");
for(int i=front;i<rear;i++)
{
System.out.print(Q[i]+" ");
System.out.println(" ______");
}
}
}
void clear()
{
 System.out.print('\u000c');
}

/*void main()
{
System.out.println("Enter the capacity of the printing jobs");
capacity=sc.nextInt();
queue obj=new queue(capacity);

/*while(true)
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
}*/
}

