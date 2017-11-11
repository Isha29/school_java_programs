import java.util.*;
class Staff
{
  int code_num;
  String sname;
  double basic;
  Staff()
  {
      code_num=0;
      sname=null;
      basic=0.0;
    }
    void input()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the code number of the staff: ");
      code_num=sc.nextInt();
      System.out.println("Enter the name of the staff: ");
      sname=sc.next();
      System.out.println("Enter the basic salary of the staff: ");
      basic=sc.nextDouble();
    }
    void printdata()
    {        
        System.out.println(code_num);
        System.out.println(sname);
       
    }
}