import java.util.Scanner;
public class Rowsort
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of rows");
int r=sc.nextInt();
System.out.println("Enter no. of columns");
int c=sc.nextInt();
int a[][]=new int[99][99];
int i,j,k;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
for(k=j+1;k<c;k++)
{
if(a[i][j]>a[i][k])
{
int temp=a[i][j];
a[i][j]=a[i][k];
a[i][k]=temp;
}
}
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.print("\n"); 
} 
}
}

