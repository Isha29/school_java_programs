/*A prime palindrome integer is a positive integer which is prime as well as
palindrome. Given two positive integers m and n. Write a program to determine 
how many prime palibdrome numbers are there between m and n and putput them. */
import java.util.Scanner;
class PrimePalindrome
{
  Scanner sc=new Scanner(System.in);
  int m,n;
  boolean isPrime(int p)
  {
      int c=0,i;
      for(i=2;i<=p;i++)
      {
          if(p%i==0)
          c++;
        }
        return (c==0)?true:false;        
    }//checks whether p is a prime number
    boolean isPalindrome(int p)
    {
       int a,b=0,temp=p;
       do
       {
           a=p%10;
           b=b*10+a;
           p/=10;
        }while(p>0);       
        return (temp==b)?true:false;
    }//checks whether p is a palindrome number
    void main()
    {
        int c=0;
        PrimePalindrome obj=new PrimePalindrome();
        System.out.println("Enter the starting limit");
        m=sc.nextInt();//user accpetance
        System.out.println("Enter the ending limit");
        n=sc.nextInt();//user acceptance
        System.out.println("The prime palindromic numbers between "+m+" and "+n+" are ");     
        for(int i=m;i<=n;i++)
        {            
            if(obj.isPrime(i) && obj.isPalindrome(i))            
            System.out.println(i);            
        }
        }//displays the list of prime palindrome numbers between m and n        
    }//end of class
    
/*Variable desciption
  Name        Type        Description
  m         integer     Stores the starting limit
  n         integer     Stores the ending limit
  i         integer     loop variable
  c         integer     counter variable
  p         integer     Stores a number to check
  a         integer     Stores remainder
  b         integer     Stores the reverse of p
 */