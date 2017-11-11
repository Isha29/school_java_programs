package File;
import java.util.*;
import java.io.*;
public class Input
{
  private String FileName;
  public Input(String FileName)
  {
      this.FileName=FileName;
    }      
  public void create(String FileName)
  {     
      this.FileName=FileName;
       try
        {   
       FileWriter fw=new FileWriter(FileName);
     }catch(IOException e){
     System.out.println(e);
     }
    }
  public void read()
  {
      try
       {
           BufferedReader in=new BufferedReader(new FileReader(FileName));
           String line;
           while((line=in.readLine())!=null)
           {
               System.out.println(line);               
            }
            System.out.println(line);            
        }catch(FileNotFoundException e)
        {
            System.out.println("File not found");        
        }catch(IOException e)
        {
           System.out.println("Unable to read file"); 
        }        
    }
}



