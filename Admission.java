import java.util.*;
class Admission
{
  int adNo[];
  int n;
  Admission(int nn)
  {
      this.n=nn;
      this.adNo=new int[n];
    }
  void fillArray()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the elements in ascending order");
      for(int i=0;i<n;i++)
      {
          adNo[i]=sc.nextInt();
        }
    }
    
        int Search(int v)
       {    
         int lb=0, ub=n-1, pos;
           while(ub>lb)
           {            
             int mid=(ub-lb)/2;
            if(adNo[mid]==v)
            {
                pos=mid;
                return 1;
            }
            if(adNo[mid]>v)
            {
                ub=mid;
            }
            if(adNo[mid]<v)
            {
                lb=mid;
            }
        }
            return -1;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of the array");
        int range=sc.nextInt();
        Admission obj=new Admission(range);
        obj.fillArray();
        System.out.println("Enter the element to search");
        int v=sc.nextInt();
        if(obj.Search(v)==1)
        {
            System.out.println("The value is present in the given array");
        }
        else
        {           
            System.out.println("The value is not present in the given array");
            
        }
    }
}