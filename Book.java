import java.util.Scanner;
class Book
{
  int number, copiesmade, copiesissued;
  String name, author, publisher;
  double price;
  Book(String name, String author, String publisher, int number, double price, int copiesmade,int copiesissued)
  {
      this.name=name;
      this.author=author; 
      this.publisher=publisher;
      this.number=number;
      this.price=price;
      this.copiesmade=copiesmade;
      this.copiesissued=copiesissued;
    }
  boolean isAvailible()
  {
      return this.copiesmade > 0 && this.copiesissued < this.copiesmade;
  }
  int returnBook()
  {
      copiesissued-=1;
      return copiesissued;
    }
  void display()
  {
      System.out.println(number+"/t"+name);
      System.out.println(author);
      System.out.println(publisher);
      System.out.println(price);
      System.out.println(copiesmade);     
      if(isAvailible())
      System.out.println("The book is available");
      else
       System.out.println("The book is not available");
      System.out.println(copiesissued);
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the book");
          number=sc.nextInt();
         System.out.println("Enter the name of the book");
         name=sc.next();          
           System.out.println("Enter the name of the author of the book");
           author=sc.next();
            System.out.println("Enter the name of the publisher of the book");
            publisher=sc.next();
             System.out.println("Enter the number of copies made of the book");
             int copiesmade=sc.nextInt();
            System.out.println("Enter the number of copies issued of this book");
             copiesissued=sc.nextInt();  
           Book ob=new Book(name, author, publisher, number, price, copiesmade, copiesissued);
           System.out.println("Do you want to return this book? ");
           String ans=sc.next();
           if(ans=="yes")
           {
             ob.returnBook();
            }
           ob.display();           
    }
}