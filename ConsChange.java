import java.util.Scanner;
class ConsChange
{
    String word;
    int len;
   ConsChange()
   {
    word=null;
    len=0;    
    }
    void readWords()
    {       
        word=word.toLowerCase();
    }
    boolean checkIfVowel(char ch)
    {         
         return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    
    void shifticons()
    {
        String temp="";
        for(int i=0;i<word.length();i++)
        {
           char ch=word.charAt(i);
           if(!checkIfVowel(ch))
           {
            temp=ch+temp;   
            }       
           if(checkIfVowel(ch)) 
           {
               temp+=ch;
            }
        }         
        System.out.println(temp);
        word=temp;
     }
     void changeWord()
     {
         String temp="";
        for(int i=0;i<word.length();i++)
        {
           char ch=word.charAt(i);
           if(!checkIfVowel(ch))
           {
            ch=Character.toUpperCase(ch);  
            temp+=ch;
            }          
           if(checkIfVowel(ch))
           {
            temp+=ch;   
            }    
        } 
        System.out.println("The new word is: "+temp);
        }
        
        void main()
        {
            Scanner sc=new Scanner(System.in);
            ConsChange obj=new ConsChange();
            System.out.println("Enter the word");
            obj.word=sc.next();
            obj.len=obj.word.length();
            System.out.println("The original word is: "+obj.word);
            obj.readWords();
            obj.shifticons();
            obj.changeWord();
            
        }
    }
