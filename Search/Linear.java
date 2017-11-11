package Search;
public class Linear
{
public static int linearSearch(int A[], int Item)
 {
 int i,j,pos=-1;
 for(i=0;i<A.length;i++)
 {
     if(A[i]==Item)
     {
         pos=i;
     }     
 }
 return pos;
 }
}