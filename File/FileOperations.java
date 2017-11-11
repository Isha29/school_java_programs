package File;
class FileOperations
{
public static void main(String[] a)

{
try{
File file=new File("names.txt");
System.out.println(file.canRead());
System.out.println(file.canWrite());
System.out.println(file.createNewFile());
System.out.println(file.delete());
System.out.println(file.exists());
System.out.println(file.getAbsolutePath());
System.out.println(file.isDirectory());
System.out.println(file.isHidden());
System.out.println(file.list());


}catch(Exception ex){
}
}
}