import java.util.*;  
  
public class Test {  
   public static void main() {  
       StringTokenizer st = new StringTokenizer("my,name.is,khan");  
        
      // printing next token  
      while(st.hasMoreTokens())
      System.out.println(st.nextToken());  
   }      
}  