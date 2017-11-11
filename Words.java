import java.util.Scanner;
class Words
{
  int num;
  Words(int num)
  {
      this.num=num;
    }
  String tens[]={"Zero","Ten", "Twenty", "Thirty", "Fourty" , "Fifty" , "Sixty", "Seventy" , "Eighty" , "Ninety"};
  String units[]={"Zero","One" , "Two" ,"Three" , "Four", "Five" , "Six" ,"Seven" , "Eight" , "Nine" , "Ten"};
  void input()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      num=sc.nextInt();
    }
    int giveNumberOfDigits()
    {
      int c=0;
      int temp=this.num;
      while(temp>0)
      {
          temp=temp/10;
          c++;
        }
        return c;
    }       
    void displayWord()
    {
       int cu=0;
       int ct=0;
       int ch=0;
       if(giveNumberOfDigits()==1)
       {
           System.out.println(this.num);
           for(int i=0;i<10;i++)
           {
              if(i==num)
              {                 
                  System.out.println(units[i]);                  
                  break;
                }  
            }
            }        
        if(giveNumberOfDigits()==2)
        {    
             for(int i=0;i<10;i++)
           {
            if(i==(num/10))
            {
                System.out.print(tens[i]); 
                break;
            }
           }
            for(int i=0;i<10;i++)
           {
            if(i==(num%10))
           {
               System.out.print(" "+units[i]);               
            }
           }       
        }
        int h=num/100;
        int t=num%100; 
        if(giveNumberOfDigits()==3)
       {  
        for(int k=0;k<10;k++)
        {
            if(k==h)
            {
                System.out.print(units[k]+" Hundred and ");               
            }
        }
         for(int j=0;j<10;j++)
           {
             if(j==(t/10))
             {
                System.out.print(tens[j]);
             }
        }
         for(int i=0;i<10;i++)
           {
             if(i==(t%10))
             {
                 System.out.print(" "+units[i]);
             }
        }
       }       
       if(giveNumberOfDigits()>3)
       {
           System.out.println("Out of Range");
        }
    }    
}