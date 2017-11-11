import java.util.Scanner;
public class Manager extends Employee
{   
    String name;
    Employee2 employ;
    Manager(String name)
    {
     this.name = name;
     this.employ = new Employee2(1, "Manager", "Address 1", "Department 1");
     //super();
    }
    
   void input()
   {    
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the name of the manager");
      name=sc.next();
      System.out.println("Enter the number of the employee working under this manager");
      int n=sc.nextInt();          
      System.out.println("Enter the deatils of the employee working under this manager");
      Employee2 employees[]=new Employee2[n];
      for(int i=0;i<n;i++)
      {
         employees[i]=employ.takeInput();
      }      
    }
   


}