/*A happy number is one in which sum of square of digits is equal to 1
   Example:
   28=(2)^2+(8)^2=4+64=68
   68=(6)^2+(8)^2=36+64=100
   100=(1)^2+(0)^2+(0)^2=1
   Hence, 28 is a happy number   
   Write a programn to check whether a number is a happy number or not*/
import java.util.Scanner;
class happy
{
  Scanner sc=new Scanner(System.in);  
    void main()
    {              
        System.out.println("Enter the starting limit");
        int n=sc.nextInt(); //user acceptance
        int c=n,p;       
         while(true)        
        {           
            p=0;
            while(c>0)
            {
                int r=c%10;
                c/=10;
                p+=r*r;
            }
        }//summation of square of digits of c;
        String s=Integer.toString(p);
        int l=s.length();
        if(l!=1)
          c=p;       
        if(p==1)
        System.out.println(n+" is an happy number");
        else
        System.out.println(n+" is not an happy number");
        
        } //main function to check and display the result       
    }
    
/*Variable desciption
  Name        Type        Description
  n         integer     Stores a number to check
  c         integer     Copy variable
  p         integer     Stores sum of square of each digit of c
  s         integer     Converts p to string   
  l         integer     Stores length of s
 */