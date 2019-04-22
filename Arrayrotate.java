import java.util.Scanner;
public class Arrayrotate
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[99];
int i,j;
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("Enter the number of times you want to rotate the array");
int num=sc.nextInt();
for(i=n-num;i<n;i++)
{
System.out.print(a[i]);
}
for(i=0;i<n-num;i++)
System.out.print(a[i]);
}
}