/*In mathematics, kaprekar number for a given base is a non-negative integer
 the represebtation of whose square in that base can be split up into two part
 that adds up to the original number
 Example:
 (45)^2=2025
 20+25=45
 
 Hence,45 is a kaprekar number
 Writre a program to check if the num,ber is a kaprekar number or not*/
import java.util.Scanner;
class kaprekar
{
  Scanner sc=new Scanner(System.in);  
 int numberOfDigits(int n)
  {
      int c=0;
       do
       {
          n/=10;
          c++;
        }while(n>0);
        return c;       
    }//returns the number of digits in n
    int calculateSum(int n)
     {
       int sum=0,c,rem,quo,pow;
       c=numberOfDigits(n)/2;
       pow=(int)Math.pow(10,c);       
       sum=(n%pow)+(n/pow);
       return sum;
    }//returns the sum of half of n
    void main()
    {        
        System.out.println("Enter the starting limit");
        int n=sc.nextInt();//user acceptance
        int pow=(int)Math.pow(n,2);
        if(calculateSum(pow)==n)
        System.out.println(n+" is a kaprekar number");
        else
        System.out.println(n+" is not a kaprekar number");
        }//checks and displays the result        
    }//end of class
    
/*Variable desciption:
  Name        Type        Description 
  n         integer     Stores a number to check
  i         integer     loop variable
  c         integer     counter variable
 pow        integer     stores square
 sum        integer     Stores sumation
 */