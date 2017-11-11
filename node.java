import java.util.*;
class node
{
  node link;
  int data;
  node ptr;
  node()
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
           node temp=new node();    
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
}