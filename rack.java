/*Question 12
Rack is a kind of data structure which can store at the most 20 books.
The rack restriction is that a book can be kept in to the rack or removed
only at one end i.e. on the top.
The class Rack has the following details :
Class name
Data members/ instance variables :
book[ ] name Limit top
: Rack
: array of string of maximum 50 locations to store books. : string
variable to store name of book.
: integers as maximum capacity of the array
: integer to indicate topmost book into the Rack.
Member functions/methods :
Rack( )
Rack( int nx )
void dispList( ) boolean ifEmpty( ) void putTheBook(
: a constructor to store blank in the array book[ ].
: a constructor to assign nx to limit and -1 to top.
: to display list of books in the rack.
: returns true, if rack is empty, otherwise returns false.
: input name of the book into variable name and adds it on the top into
the array book[ ] if rack is empty otherwise prints a message “Rack
overflow”.
: removes a book form the top of the rack, if rack is not Empty and print
the book name, otherwise outputs a Message “Rack underflow”.
. (a) Specify the class Rack giving details
voidputTheBook( ),voidremoveBook( )only.Assumethatotherfunctionsare
already written for you. You do not need to write the main function.
. (b) Name the entity which is being used by the above class and
also state the principle it uses.
*/
import java.util.Scanner;
class rack
{
  String book[],name;
  int limit, top;
  Scanner sc=new Scanner(System.in);
  rack()
  {
      book=new String[limit];
      for(int i=0;i<limit;i++)
      {
          book[i]="";
        }
    }
  rack(int nx)
  {
     limit=nx;
     top=-1;
    }
    
 boolean checkOverflow()
{
 return top == (limit-1);
}
void putTheBook()
{
System.out.println("Enter the name of the book");
String item=sc.nextLine();
if(checkOverflow())
{
 System.out.println("rack overflow");
 return;
}
++top;
book[top]=item;
}

boolean underflow()
{
 return top == -1;
}

void dispList()
{
if(underflow())
{
System.out.println("Rack empty");
return;
}
System.out.println("The elements of the array are");
for(int i=top;i>=0;i--)
{
System.out.println("  |"+book[i]+"| ");
System.out.println(" ______");
}
}

boolean ifEmpty()
{
 return underflow();
}

void removeTheBook()
{
if(underflow())
{
 System.out.println("Stack underflow");
 return;
}
System.out.println("Popped out element is: " + book[top]);
top--;
}
}
