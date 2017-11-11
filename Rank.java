import java.util.Scanner;
class Rank extends Record
{
int index;
Rank()
{
super();
index=0;
}
void highest()
{  
  super.readValues();
  int min=this.rank[0];
  int pos=0;
  for(int i=0;i<this.rank.length;i++)
  {
     
          if(min>rank[i])
          {
              min=rank[i];
              index=i;
            }
        
    }    
  }
void display()
{  
  this.highest();
  System.out.println("The name is: "+this.name[index]+" and the topmost rank is "+this.rank[index]);
}
}
