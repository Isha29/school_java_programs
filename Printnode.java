import java.util.*;


class Printnode 
{
  node2 start, ptr;
   Printnode()
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
            ptr=new node2();
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
            System.out.println("Do you want to continue?(y/n)");
            ans=sc.next().charAt(0);
        }
        /*System.out.println("Do you want to continue?(y/n)");
        ans=sc.next().charAt(0);*/
    }
    void removeLast()
    {
        //Scanner sc=new Scanner(System.in);
        //char ans='y';
        /*System.out.println(start);
        System.out.println(ptr.nxt);
        System.out.println(ptr.nxt.nxt);*/
        for(ptr=start;ptr.nxt.nxt!=null;ptr=ptr.nxt)
        {
            ptr.nxt=null;
        }       
        display();
    }
    void display()
    {
        for(ptr=start;ptr!=null;ptr=ptr.nxt)
        {
            ptr.display();
        }
    }
    void main()
    {
        create();
        removeLast();
        display();
    }
    
}
/*import java.util.*;
class Printnode
{
  Printnode link;
  int data;
  Printnode ptr;
  Printnode()
  {
      data=0;
      link=null;      
    }
   public void create()
    {
      Scanner sc=new Scanner(System.in);     
      //if(ptr==null)
      if(this.totalNodes() == 0)
      {      
        this.data=sc.nextInt();
        ptr=this;     
       }
       else
       {
           Printnode temp=new Printnode();    
           temp.data=sc.nextInt();
           temp.link=null;
           ptr.link=temp;
           temp=null; 
           ptr=ptr.link;
        }
    }
    int totalNodes()
    {
        ptr=this;
        int count=0;
        while(ptr!=null)
        {
           count++; 
        }
        return count;
    }  
  void displayNodes()
   {
       System.out.println();
       ptr=this;
       while(ptr!=null)
       {
           System.out.print(ptr.data + ", ");
           ptr=ptr.link;
        }
    }    
}*/