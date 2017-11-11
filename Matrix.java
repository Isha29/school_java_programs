import java.util.Scanner;
class Matrix
{
  int arr[][];
  int m, n;
  Matrix(int mm, int nn)
  {
      m=mm;
      n=nn;
      arr=new int[mm][nn];
    }
  void fillArray()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the elements in the array");
      for(int i=0;i<m;i++)
      {
         for(int j=0;j<n;j++) 
         {
             arr[i][j]=sc.nextInt();
            }
        }
    }
  Matrix SubMat(Matrix A)
  {         
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++) 
         {
          this.arr[i][j]=this.arr[i][j]-A.arr[i][j];      
        }   
     }    
     return this;
   }
    void display()
    {        
         for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++) 
         {
          System.out.print(this.arr[i][j]);      
        }   
        System.out.println();
     }     
    }   
    void main()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no of rows in the matrix: ");
      m=sc.nextInt();
      System.out.println("Enter the no of columns in the matrix: ");
      n=sc.nextInt();        
      Matrix obj=new Matrix(m,n);
      Matrix A=new Matrix(m,n); 
      obj.fillArray();
      A.fillArray();   
      obj.SubMat(A).display();//method chaning
    }
}