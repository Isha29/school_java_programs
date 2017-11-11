/*An evil nu,ber is a positiv whole number whose binary equivalent contains even number of 1's
 Examaple:
 Input: 15
 Binary equivalent: 1111
 Hence, it an evil number
 Writre a program to check if the number is an evil number or not*/
import java.util.Scanner;
class evil
{
  Scanner sc=new Scanner(System.in); 
    void main()
    {        
        int rem,c=0;
        System.out.println("Enter the number");
        int n=sc.nextInt();//user acceptance
        while(n>0)
        {
            rem=n%2;
            if(rem==1)
            {
                c++;
            }
            n/=2;
        }//returns the number of 1 in the binary equivalent of n
        if(c%2==0)
        System.out.println(n+" is an evil number");
        else
        System.out.println(n+" is not an evil number");
        }//main function  to display the result     
    }//end of class
    
/*Variable desciption:
  Name        Type        Description 
  n         integer     Stores a number to check 
  c         integer     counter variable
 rem        integer     stores remainder 
 */
