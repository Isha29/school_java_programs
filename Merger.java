import java.util.*;
class Merger
{
  long n1, n2, merNum;
  String s1, s2;
  Merger()
  {
      n1=0;
      n2=0;
      merNum=0;
    }
  void readNum()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the values to concat");
      n1=sc.nextLong();
      n2=sc.nextLong();
     s1=Long.toString(n1);
     s2=Long.toString(n2);      
    }
  void joinNum()
  {
      String merSt=s1.concat(s2);
      merNum=Long.valueOf(merSt);
    }
    void show()
    {
        readNum();
        System.out.println("The original values are: "+n1+" and "+n2);
        joinNum();
        System.out.println("The merged values are: "+merNum);
    }
}