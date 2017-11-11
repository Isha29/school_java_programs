//Employee- number, name, address, department
import java.util.Scanner;
public class Employee2
{
  int number;
  String name, address, department;
  Employee2(int empNo, String name, String address, String department)
  {
      this.number = empNo;
      this.name = name;
      this.address = address;
      this.department = department;
  }
  
  public Employee2 takeInput()
  { 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number: ");
      number=sc.nextInt();
      System.out.println("Enter the name: ");
      name=sc.next();
      System.out.println("Enter the department: ");
      department=sc.next();
      System.out.println("Enter the address: ");
      address=sc.nextLine();     
      return new Employee2(number, name, address, department);
    }
  public void show(Employee2 emp)
  {
      System.out.println(emp.number);
      System.out.println(emp.name);   
      System.out.println(emp.address);
      System.out.println(emp.department);
  }
}