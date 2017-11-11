//'\u000C'
import java.util.*;
import java.io.*;
public class File1
{ 
  static String st;
  static InputStreamReader isr=new InputStreamReader(System.in);
  static BufferedReader stdin=new BufferedReader(isr); 
 public void input()throws IOException
  {
      System.out.println("Enter the file name and type");
            st=stdin.readLine();
    }
     public void clear()
        {
            System.out.println('\u000C');
        }
    public void write()
    {
        try
        {   
            input();
            String FileName=st;
            FileWriter fw=new FileWriter(FileName);
             BufferedWriter bw=new BufferedWriter(fw);
             PrintWriter file=new PrintWriter(bw);  
            System.out.print("Shop Inventory Amount: ");
            int amount=Integer.parseInt(stdin.readLine());
            file.println("Shop Inventory Amount: "+amount);
            System.out.print("Product Code: ");
            int code=Integer.parseInt(stdin.readLine());
            file.println("Product code: "+code);  
             System.out.print("Product name: ");
            String name=stdin.readLine();
            file.println("Product name: "+name);  
             System.out.print("Quantity: ");
            int quan=Integer.parseInt(stdin.readLine());
            file.println("Quantity: "+quan);  
             System.out.print("Unit Price: ");
            int price=Integer.parseInt(stdin.readLine());
            file.println("Product code: "+price);                   
            file.close();                    
                }catch(IOException e){
                    System.out.println(e);
                }
              }
       
         public void read()
   {
       try
       {
           BufferedReader in=new BufferedReader(new FileReader(st));
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
        public static void main()
        {
             File1 obj=new File1();
             //obj.input();
             obj.write();
             obj.clear();
             obj.read();
        }
    }
        
        
  

