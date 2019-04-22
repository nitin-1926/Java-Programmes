import java.util.Scanner;
public class Snakematrix
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows");
int m=sc.nextInt();
System.out.println("Enter number of columns");
int n=sc.nextInt();
int i,j; 
int a[][]=new int[m][n];
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=sc.nextInt();
for(i=0;i<m;i++)
{
if(i%2==0)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
}
else
{
for(j=n-1;j>=0;j--)
{
System.out.print(a[i][j]+" ");
}
}
}
}
}