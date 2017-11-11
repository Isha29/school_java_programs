
import java.util.Scanner;
class Record
{
String name[];
int rank[];
int n=3;
Scanner sc=new Scanner(System.in);
Record()
{
 this.n=n;
 name=new String[n];
 rank=new int[n];
}
void readValues()
{
  System.out.println("Enter the names and ranks of students: ");
  for(int i=0;i<name.length;i++)
  {
      name[i]=sc.next();
      rank[i]=sc.nextInt();
    }
}
 void display()
 {
     for(int i=0;i<name.length;i++)
     {
         System.out.println(name[i]+"\t"+rank[i]);
        }
    }    
}
