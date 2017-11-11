import java.util.Scanner;
class Pattern2
{
 void getPattern()
 {
     int i,j,k, limit = 5;
     char ch='A'; 
     for(i=1; i<=limit; i++)
     {
         for(j=1; j<=i; j++)
         {
          System.out.print(i);
         }
         for(j=limit; j>=i; j--)
         {
           System.out.print(ch);
         }
            ch++;
            System.out.println();
        }
    }
}