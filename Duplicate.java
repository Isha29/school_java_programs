import java.util.*;
class Duplicate
{
   int num[],num2[];
   Duplicate(int n)
   {
       num=new int[n];
       num2=new int[n];
    }
   void readList(int n)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the numbers in sorted order: ");
       for(int i=0;i<n;i++)
       {
           num[i]=sc.nextInt();
        }
    }
   int PackList()
    {
        int c=0;
       for(int i=0;i<num.length;i++)
       {
           int n=num[i];
           for(int j=0;j<num.length;j++)
           {
            if(num[j]==n)
            {
              pos=i;
                temp=j;
                c++;
            }
            }
        }
       // int count=num.length-c;
       return c;
    }
   void displayList()
   {
       for(int i=0;i<PackList();i++)
       {
           System.out.println(num2[i]);
        }
    }
   void main()
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        Duplicate ob=new Duplicate(n);
        ob.readList(n);
        ob.PackList();
        ob.displayList();
    }
}