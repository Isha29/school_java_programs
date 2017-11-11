import java.util.Scanner;
class ISBN
{
  private String n;
  private int numLength=10;
 
 ISBN(String n)
 {
     this.n=n;
    }
    
  boolean isValidLength()
  {          
      return this.n.length()==this.numLength;
    }

    
  int getSum()
  {
      int sum=0;    
      long t=Integer.parseInt(n);
      for(int i=1;i<=n.length();i++)
      {
        sum+=(t%10)*i;
        t=t/10;
        }
      return sum;
    }
    
    boolean isValidNumber()
    {
     return this.getSum()%11==0;   
    }
    
   public static void sysOut(String msg)
    {
        System.out.println(msg);
    }
    
     public static void main()
     {
        Scanner sc=new Scanner(System.in);
        ISBN.sysOut("Enter the ISBN number :");
        String n=sc.next();        
        ISBN obj=new ISBN(n);
    if(obj.isValidLength())
         {         
         if(obj.isValidNumber())
         {
          ISBN.sysOut("SUM= "+obj.getSum());
         ISBN.sysOut("Leaves no remainder-Valid ISBN code");         
         }
        
         else
         {
              ISBN.sysOut("SUM= "+obj.getSum());
             ISBN.sysOut("Leaves remainder-Invalid ISBN code");         
            }        
        }
     else
        {
       ISBN.sysOut("Wrong input");
    }
    }
}
