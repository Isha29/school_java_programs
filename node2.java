import java.util.Scanner;
class node2
{
  int n;
  node2 nxt;
  void input()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of sheets to be printed");
      n=sc.nextInt();
    }    
    void display()
    {
        System.out.println(n);
    }
}