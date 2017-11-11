import java.util.*;
class node1
{
  int n;
  node1 nxt;
  void input()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      n=sc.nextInt();
    }    
    void display()
    {
        System.out.println(n);
    }
}

class library
{
  node1 start, ptr;
   library()
   {
       start=null;
       ptr=null;
    }
    void create()
    {
        Scanner sc=new Scanner(System.in);
        char ans='y';
        while(ans=='y')
        {
            ptr=new node1();
            ptr.input();
            if(start==null)
            {
                start=ptr;
                ptr.nxt=null;
            }
            else
            {
                ptr.nxt=start;
                start=ptr;
            }
        }
        System.out.println("Do you want to continue?(y/n)");
        ans=sc.next().charAt(0);
    }
    void removeLast()
    {
        for(ptr=start;ptr.nxt.nxt!=null;ptr=ptr.nxt)
        {
            ptr.nxt=null;
        }
    }
    void display()
    {
        for(ptr=start;ptr!=null;ptr=ptr.nxt)
        {
            ptr.display();
        }
    }
}