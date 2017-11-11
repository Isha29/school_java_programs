import java.io.*;
public class ReadFile
{
   public static void main(String[] args)
   {
       try
       {
           BufferedReader in=new BufferedReader(new FileReader("names.txt"));
           String str;
           while((str=in.readLine())!=null)
           {
               System.out.println(str);
            }
            System.out.println(str);
            
        }catch(FileNotFoundException e)
        {
            System.out.println("File not found");        
        }catch(IOException e)
        {
           System.out.println("Unable to read file"); 
        }
        }
    }
