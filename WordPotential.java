
/**
 * Write a description of class WordPotential here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPotential
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class WordPotential
     */
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    int vakueOfAscii(char ch)
    {
        // put your code here
        if(Character.isUpperCase(ch))
        return ((int)ch-64);
        else
        return ((int)ch-96);
    }
}
