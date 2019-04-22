import java.util.Scanner;
public class Columnsum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of rows");
int r=sc.nextInt();
System.out.println("Enter no. of columns");
int c=sc.nextInt();
int a[][]=new int[r][c];
int i,j,csum=0,temp;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<r;i++)
{
csum=0;
for(j=0;j<c;j++)
{
csum=csum+a[j][i];
}
temp=j+1;
System.out.println("Sum of column "+temp+" is "+csum); 
}
}
}

