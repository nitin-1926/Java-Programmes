import java.util.Scanner;
public class Rowsum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of rows");
int r=sc.nextInt();
System.out.println("Enter no. of columns");
int c=sc.nextInt();
int a[][]=new int[r][c];
int i,j,rsum=0,temp;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<r;i++)
{
rsum=0;
for(j=0;j<c;j++)
{
rsum=rsum+a[i][j];
}
temp=i+1;
System.out.println("Sum of row "+temp+" is "+rsum); 
}
}
}

