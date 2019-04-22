import java.util.Scanner;
public class Columnsort
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
for(k=i+1;k<r;k++)
{
if(a[i][j]>a[k][j])
{
int temp=a[i][j];
a[i][j]=a[k][j];
a[k][j]=temp;
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

