
/**
 * Write a description of class WordPotential here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    // instance variables - replace the example below with your own   

    import java.util.Scanner;
    class WordPotential
    {
      String s;
      void input()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the sentence: ");
          s=sc.nextLine();
          s=s.trim();
        }
    /**
     *returns the modified ascii value of the given character
     */
    int valueOfAscii(char ch)
    {
        // put your code here
        int a=ch;
        // System.out.println(a-64);
        if(Character.isUpperCase(ch))
        return (a-64);
        if(Character.isLowerCase(ch))
        return (a-96);      
        else
        return 0;
    }
    /**
     * returns the potential of each word of sentence
     */
    int encryptWord(String st)
    {
        int potential=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
           potential+=valueOfAscii(ch);
        }
        return potential;
    }
    /**
     * displays potential of every word in the sentence
     */
    void DisplayEncryptSentence()
    {
        int count=0;        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String temp="";
            if(ch==' ')
            {
            temp=s.substring(count,i);            
            count=i+1;
            System.out.println(temp+"="+encryptWord(temp));
           }
         }         
    }   
    void main()
    {
        WordPotential encrypt=new WordPotential();
        encrypt.input();
        System.out.println("The sentence is: "+s);
        System.out.println("The potential of each word of the sentence is: ");
        encrypt.DisplayEncryptSentence();
    }
}
