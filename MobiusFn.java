/* MOBIUS function M(N) for a natural number N is defined as follows:

M(N) = 1                          if N = 1 [Condition 1]
M(N) = 0                          if  any prime factor of N is contained in N more than once [Condition 2]
M(N) = (-1)p                    if N is a product of ‘p’ distinct prime factors [Condition 3]
Example :

M(78) = -1                ( for 78 = 2 * 3 * 13     M(78) = ( -1)3 = -1 )
M(12) = 0                 ( for 12 = 2 * 2 * 3       M(12) = 0 for 2 appears two times)
Specify the class MobiusFn giving details of the constructors, void input(), int primeFac(), and void display().
 Also define the main function to create an object and call methods accordingly to enable the task.*/
import java.util.Scanner;
class MobiusFn
{
    int n;
     
    MobiusFn()
    {
        n = 0;
    }    
    void input()
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter a number : ");
        n = sc.nextInt();
    }   
    int primeFac()
    {
        int a=n,i=2, m=0,c=0,f=0;
             
        while(a > 1) 
        {
            c = 0;
            while(a%i == 0) // if 'i' is a prime factor
            {
                c++;
                f++;
                a=a/i;
            }
                i++;
                if(c > 1) 
                return 0;
        }
        return f; // returning no. of prime factors
    }
     
    void display() // function to display value of mobius function
    {
        int mob,x;
        if(n == 1) // condition 1
            mob = 1;
        else
        {
            x = primeFac();
            if(x == 0) // condition 2
                mob = 0;
            else // condition 3
                mob = (int)Math.pow(-1,x);
        }
        System.out.println("Value of Mobius Function : "+mob);
    }
}
/*Variable desciption
  Name        Type        Description 
  n         integer     Stores a number to check 
  c         integer     counter variable
  f         integer     Stores the number of prime factors
  x         integer     Stores remainder
 mob        integer     Stores the mobius function
  a         integer     Stores quotient
 */