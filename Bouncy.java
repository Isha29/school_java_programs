

import java.util.Scanner;
class Bouncy
{

  int range;

   Bouncy(int range)
   {
       this.range=range;
    }
  boolean isIncreasing(int n[])
  {
      int c=0;
      for(int i=0;i<n.length-1;i++)
    {
         for(int j=i+1;j<n.length-i-1;j++)
        {

        if(n[i]<n[j])
        {
            c++;
        }
    }
  }
   return (c==0)?false:true; 
}
 boolean isDecreasing(int n[])
  {
      int c=0;
    for(int i=0;i<n.length-1;i++)
    {
         for(int j=i+1;j<n.length-i-1;j++)
        {

        if(n[i]>n[j])
        {
            c++;
        }
    }
  }
   return (c==0)?false:true; 
}
int getLength(int n)
{
int c=0;
 while(n>0)
 {
     n/=10;
     c++;
 }
    return c;
}
int[] explode(int n)
{
 int array[]=new int[getLength(n)];
 int array2[]=new int[getLength(n)];
int k=0,k1=0;
String st="";
while(n>0)
{
int rem=n%10;
//st=rem+st;
array[k++] = rem;
n/=10;
}

for(int i=k-1;i>=0;i--)
   {
       
       array2[k1]=array[i];       
       k1++;
    }
return array2;

}

void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
Bouncy obj=new Bouncy(range);
if(obj.isIncreasing(obj.explode(n)) && obj.isDecreasing(obj.explode(n)))
{
System.out.println("The number is a bouncy number");
}
else
{
 System.out.println("The number is not a bouncy number");
}
}

}