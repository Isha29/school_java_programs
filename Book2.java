import java.util.Scanner;
class Book2 extends node1
{

    void takeBook()
    {
        this.removeLast();
    }
    void returnBook()
    {
        this.create();
    }      
      void display()
     {
       System.out.println();
       this.ptr=this;
       while(this.ptr!=null)
       {
           System.out.print(ptr.data + ", ");
           obj.ptr=this.ptr.nxt;
        }
        if(this.ptr=null)
        {
            System.out.println("Shelf empty");
        }        
    }    
    
    void main()
    {
             Scanner sc=new Scanner(System.in);           
            System.out.println("Enter the number of copies made of the book");             
             Book2 ob=new Book2();
             ob.display()
           /*System.out.println("Do you want to take the last book from the rack? ");
           String ans=sc.next();
           if(ans=="yes")
           {
             ob.takeBook();
            }
           ob.display();*/
           /*System.out.println("Do you want to take the last book from the rack? ");
           String ans1=sc.next();
           if(ans=="yes")
           {
               ob.returnBook();
            }*/
    }
}