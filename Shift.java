import java.util.Scanner;
class Shift
{
  int n, m; 
  int a[][];
   Shift(int nn, int mm)
   {
       this.n=nn;
       this.m=mm;
       a=new int[m][n];
    }
   void input()
   {
       Scanner sc=new Scanner(System.in);       
       System.out.println("Enetr the elements in the array");
       for(int i=0;i<m;i++)
       {
          for(int j=0;j<n;j++) 
          {
              a[i][j]=sc.nextInt();
            }
        }
    }
     void cyclic(Shift P)
     {
          for(int i=0;i<m;i++)
       {
          for(int j=0;j<n;j++) 
          {
              if(i!=0)
              {              
              a[i][j]=P.a[i-1][j];              
            }
            else
            {                 
                a[i][j]=P.a[m-1][j];                
            }
            }
        }         
        }
        void display()
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++) 
                {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
       public static void main()
        {
            Shift x=new Shift(2,2);
            Shift y=new Shift(2,2);
            x.input();
            y.cyclic(x);
            System.out.println("The original array: ");
            x.display();
            System.out.println();
            System.out.println("The modified array: ");
            y.display();
        }
    }