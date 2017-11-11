
import java.util.Scanner;
class person
{
public String name;
private int age;
person(String name)
{
this.name=name;
}
String getName()
{
return this.name;
}
int setAge(int age)
{
 this.age=age;
 if(this.age>0) 
 return this.getAge();
 else
 return 0;
}
int getAge()
{
 return this.age;
}
String s[]={"Tom","Harrry","Merry"};
person obj[]=new person[3];
void main()
{
for(int i=0;i<s.length;i++)
{
 obj[i]=new person(s[i]); 
}

for(int i=0;i<obj.length;i++)
{
   System.out.println(obj[i].getName());
}
}
}