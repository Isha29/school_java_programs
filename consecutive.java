import java.util.Scanner;
class consecutive
{
int n,m;
consecutive()
{
m=10;
n=30;

}
 boolean isPrime(int n)
  {
      int c=0, i;
      for(i=1;i<n;i++)
      {
          if(n%i==0)
           c++;
        }
        return (c==0)?true:false;        
    }//checks whether n is a prime number     
     int[] getPrimeArray()
  {   
         int k=0;
     for(int i=n;i<=m;i++)
     {
         if(isPrime(i))
         {
             k++;
            }
        }
     int prime[]=new int[k];
        int c=0;
        for(int i=n;i<=m;i++)
     {
         if(isPrime(i))
         {
             prime[c++]=i;
            }
        }
        return prime;
    }
    int[] getDifference(int a[])
    {
        int k=0;
     for(int i=n;i<=m;i++)
     {
         if(isPrime(i))
         {
             k++;
            }
        }
         int b[]=new int[k], c=0;
         for(int i=0;i<a.length-1;i++)
     {
         for(int j=i+1;j<a.length;j++)
         {
             b[i]=a[i]-a[j];
            }
        }   
        return a;
    }
    void display(int a[],int b[])
    {
        System.out.println("The actual array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+", ");
        }
        System.out.println();
        System.out.println("The difference array:");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+", ");
        }
    }
    void main()
    {
        consecutive obj=new consecutive();        
        obj.display(getPrimeArray(), getDifference(getPrimeArray()));
    }
}