
/*An evil nu,ber is a positiv whole number whose binary equivalent contains even number of 1's
 Examaple:
 Input: 15
 Binary equivalent: 1111
 Hence, it an evil number
 Writre a program to check if the number is an evil number or not*/
import java.util.Scanner;
class Triangular
{
  Scanner sc=new Scanner(System.in); 
    void main()
    {        
        int i,j,k,s;
        System.out.println("Enter the starting limit");
        int n=sc.nextInt();//user acceptance
        boolean flag=false;
        for(i=1;i<n/2+1;i++)
        {
            s=0;
            for(j=i;j<n/2;j++)
            {
                s+=j;
                if(s==n)
                {
                    flag=true;
                    for(k=i;k<=j;k++)
                    {
                        System.out.println(k+"+");
                    }
                    System.out.println();
                    break;
               }
          }
      }  
      if(flag!=true)
        System.out.println(n+" is not a Special triangular number");
        else
        System.out.println(n+" is a special triangular number");
    }//main function  to display the result     
}           
/*Variable desciption:
  Name        Type        Description
  n         integer     Stores a number to check
  i         integer     loop variable
  j         integer     loop variable
  k         integer     loop variable    
  s        integer     stores the sumation 
 */
