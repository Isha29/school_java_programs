import java.util.Scanner;
class Mirror
{   
   public static int row, col;
   int A[][]; 
   Mirror(int row)
   {
    this.row=row;
    this.col=this.row;
    this.A=new int[row][row];
   }
   void input()
   {      
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<row;i++)
       {
         for(int j=0;j<col;j++)
         {
            this.A[i][j]=sc.nextInt();
            }
        }
    }
   int[][] getMirrorImage(int A[][])
   {       
    for(int i=0;i<row;i++)
    {
        int temp=0;       
        temp=A[i][0];
        A[i][0]=A[i][(col-1)];
        A[i][(col-1)]=temp;
        
    }
    return A;
   }
    void displayArray(int A[][])
    {
        
    for(int i=0;i<row;i++)
    {
         for(int j=0;j<col;j++)
         {
             System.out.print(A[i][j]+"  ");
            }
            System.out.println();
    }
   }
   boolean isValid()
   {
      return (row<20 && row>2); 
    }
   static void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows and columns");
       row=sc.nextInt();
       Mirror obj=new Mirror(row);
        if(!obj.isValid())
        {
            System.out.println("Size out of range");
            return;
        }
        
        System.out.println("Enter the values in the array: ");      
        obj.input();
        System.out.println("ORIGINAL MATRIX");
        obj.displayArray(obj.A);
        System.out.println();
         System.out.println("MIRROR IMAGE MATRIX");
        obj.displayArray(obj.getMirrorImage(obj.A));
       
    }
}