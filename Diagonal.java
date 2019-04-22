import java.util.Scanner;
public class Diagonal
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter no. of rows and columns");
int n=sc.nextInt();
int a[][]=new int[n][n];
int i,j;
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j||j-i==n-1||i-j==n-1)
System.out.print(a[i][j]+" ");
else
System.out.print("0 ");
}
System.out.print("\n");
}
}
}