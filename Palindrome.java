import java.util.Scanner;
class Palindrome
{
  String s;
   Palindrome(String s)
   {
       this.s=s;
       }
       
   boolean isUpperCase()
   {
       int c=0;
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)!=' ')
           {
            boolean check=Character.isUpperCase(s.charAt(i));
            if (!check)
            c=1;
           }
       }
        return c==0;
    }
    boolean isPalindromicWord(String st)
    {
      String revSt="";
      for(int j=0;j<st.length();j++)
       {
           revSt=st.charAt(j)+revSt;
       }             
       return (revSt.compareTo(st)==0);
                
    }
    void displayPalindrome()
    {
        int c=0,count=0;        
        for(int i=0;i<s.length();i++)
        {            
            if(s.charAt(i)==' ')  
            {
             String st=s.substring(c,i);                        
             if(isPalindromicWord(st))
             {
                 System.out.print(st+"\t");
                 count++;
                }
               c=i+1;
            }
        }
        System.out.println();
        System.out.println("The number of palindromic words are :"+ count);
    }    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String s=sc.nextLine();
        Palindrome ob=new Palindrome(s);
        if(ob.isUpperCase())
        {
         System.out.println("The palindromic words are :");
          ob.displayPalindrome();
        }
        else
        {            
            System.out.println("Invalid input");
        }
    }
    
}