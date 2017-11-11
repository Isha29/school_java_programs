import java.util.Scanner;
class Marks
{
  int regnum, marks[], subno;
  String subject[];
  Scanner sc=new Scanner(System.in); 
  void inpDetails2()
  {
      System.out.println("Enter the subno of subjects");
      int subno=sc.nextInt();      
       marks=new int[subno];
       subject=new String[subno];  
      System.out.println("Enter the marks obtained in each subject");
       for(int i=0;i<subno;i++)
       {
          subject[i]=sc.next();
          marks[i]=sc.nextInt();        
       }
       System.out.println("Enter the regnum of student: ");
       regnum=sc.nextInt();
    }
    void show()
    {       
        for(int i=0;i<subno;i++)
        {
            System.out.println(subject[i]+": "+marks[i]);
        }
        System.out.println("The regnum of the student is: "+regnum);
    }
    }
