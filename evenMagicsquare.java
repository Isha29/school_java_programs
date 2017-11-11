
class evenMagicsquare
{
void display(int n)
{
int m[][]=new int[n][n];
int c=1,i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
m[i][j]=c++;
}
}
j=n-1;
for(i=0;i<n/2;i++)
{
 int temp1=m[i][i];
 m[i][i]=m[j][j];
 m[j][j]=temp1;
 
 int temp2=m[i][j];
 m[i][j]=m[j][i];
 m[j][i]=temp2;
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.println();
}
}
}