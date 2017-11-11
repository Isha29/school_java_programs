import java.util.Scanner;
class Emirp
{
  int n, rev, f;
    Emirp(int nn)
    {
       n=nn;
       rev=0;
       f=2;
    }
    int isprime(int x)
    {
        int c=1;
        for(int i=f;i<x;i++)
        {
            if(x%i==0)
            {
                c=0;
            }            
        }
        return c;
    }
    int a,b=0;
    int reverse()
    {
      a=n%10;
      b=b*10+a;
      n/=10;          
      if(n>0)
      {
          reverse();
        }
      return b;
    }
    void isEmirp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        Emirp obj=new Emirp(n);
        if(obj.isprime(n)==1 && obj.isprime(obj.reverse())==1)
        {
            System.out.println("The number is an Emirp number");
        }
        else
        {
            System.out.println("The number is not an Emirp number");
        }
    }
}
