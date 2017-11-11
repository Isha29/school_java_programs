import java.io.*;
class FileIO

{
static String FileName=("names.txt");
static InputStreamReader isr=new InputStreamReader(System.in);
static BufferedReader stdin=new BufferedReader(isr);
public static void main(String[] args)
{try
{
FileWriter fw=new FileWriter(FileName);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter outFile=new PrintWriter(bw);
for(int i=0;i<5;i++)
{
 System.out.print("Enter name: ");
 String name=stdin.readLine();
 outFile.println(name);
}
outFile.close();
}catch(IOException e){
System.out.println(e);
}
}//write 
}
