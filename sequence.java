import java.util.*;
class sequence 
{ 
  int range;
  String num; 
  String word[]={"ONE","TWO","THREE","FOUR"};
  void input()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number between 1 t 9");
      num=sc.next();      
    }
   String getfrequency(String s)
  {   
      String w;
      String temp="";
   for(int i=0;i<s.length()-1;i++)
   {
       char ch=s.charAt(i);
       int count=0;
       for(int j=i+1;j<s.length();j++)
       {
          char c=s.charAt(j);
          if(c==ch)
          {
              count++;
            }
        }
       //w=word[count-1];
       w=Integer.toString(count);
       temp+=w+ch;
    }
    return temp;
    }    
}