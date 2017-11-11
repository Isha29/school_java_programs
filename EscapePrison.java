/*
 * given: the height upto whuch he can jump
 *        the height from which he will slide
 *        height of walls in the form of an array
 *        
 * Find how many times does he have to jump.          
 */
import java.util.*;
class EscapePrison
{
   int jump, slide, n;
   int heights[];
   EscapePrison(int n)
   {
       this.n=n;
       this.heights=new int[n];
    }
   void input()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the height upto which he can jump: ");
       this.jump=sc.nextInt();
       System.out.println("Enter the height upto which he can slide: ");
       this.slide=sc.nextInt();      
       System.out.println("Enter the height of each wall: ");
       for(int i=0;i<n;i++)
       {
           heights[i]=sc.nextInt();
        }   
    }
   int checkEqual(int h)
   {
           if(jump!=h)
           {
               return 1;
            }
            else
            {
                return 0;
            }
     }
   int giveJumps(int h)
   {       
       int attempt=0;
       while(h>=0 /*&& checkEqual()=false*/)
       {           
           h-=(jump-slide);
           attempt++;
        }
        return attempt;
    }
   int givetotalJumps()
   {       
       int count=0;
       //int attempt=0;
       for(int i=0;i<n;i++)
       {
        count+=giveJumps(heights[i])+checkEqual(heights[i]);
       }        
       return count;
   }
    void main()
    {
        input();
        System.out.println(jump);
        System.out.println(slide);
        System.out.println(givetotalJumps());
    }
}