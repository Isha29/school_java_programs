/*Write aprogram to check whether a number is a rev prime number or not. */
import java.util.Scanner;
class revPrime
{
  Scanner sc=new Scanner(System.in);  
  boolean isPrime(int n)
  {
      int c=0,i;
      for(i=2;i<=n;i++)
      {
          if(n%i==0)
          c++;
        }
        return (c==0)?true:false;        
    }//checks whether n is a prime number
    int getReverse(int n)
    {
       int a,b=0,temp=n;
       do
       {
           a=n%10;
           b=b*10+a;
           n/=10;
        }while(n>0);       
        return b;
    }//returns the reverse of n
    void main()
    {
        int c=0;        
        System.out.println("Enter the number");
        int n=sc.nextInt();//user aceptance                  
            if(isPrime(getReverse(n)))            
            System.out.println(n+" is a reverse prime number");
           else
           System.out.println(n+" is not a reverse prime number");          
        }//main function to display the result
 }//end of class        
    
    
/*Variable desciption
  Name        Type        Description 
  n         integer     Stores a number to check 
  i         integer     loop variable
  c         integer     counter variable 
  a         integer     Stores remainder
  b         integer     Stores the reverse of p
 */