/*An evil nu,ber is a positiv whole number whose binary equivalent contains even number of 1's
 Examaple:
 Input: 15
 Binary equivalent: 1111
 Hence, it an evil number
 Writre a program to check if the number is an evil number or not*/
import java.util.Scanner;
class Smith
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
     int getSumofDigits(int n)
    {
       int a,sum=0;
       do
       {
           a=n%10;
           sum+=a;
           n/=10;
        }while(n>0);       
        return sum;
    }//returns the sum of digits of n
     int getSumofprimeFactors(int n)
    {
       int i, a,sum=0;
       for(i=2;i<n;i++)
       {
       if(n%i==0 && isPrime(i))
       sum+=getSumofDigits(i);
       }           
        return sum;
    }//returns the sum of each digit of the prime factors of n
    void display()
    {          
        System.out.println("Enter the number");
        int n=sc.nextInt();//user acceptance               
        if(getSumofDigits(n)==getSumofprimeFactors(n))
        System.out.println(n+" is a smith number");
        else
        System.out.println(n+" is not a smith number");
        }//main function  to display the result     
    }//end of class
    
/*Variable desciption:
  Name        Type        Description 
  n        integer     Stores a number to check 
  i        integer     loop variable
  c        integer     counter variable
  a        integer     stores the diguts of n
 sum       integer     stores the sumation
 */
