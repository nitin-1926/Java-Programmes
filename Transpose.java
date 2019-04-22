import java.util.Scanner;
public class Transpose
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows");
int r=sc.nextInt();
System.out.println("Enter number of columns");
int c=sc.nextInt();
int i,j;
int a[][]=new int[r][c];
for(i=0;i<r;i++)
for(j=0;j<c;j++)
a[i][j]=sc.nextInt();
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.print(a[j][i]);
System.out.println();
}
}
}
