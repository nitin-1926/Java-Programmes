import java.util.Scanner;
public class Allexceptmesum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[99];
int num;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+arr[i];
}
int temp;
for(int i=0;i<n;i++)
{
temp=sum-arr[i];
System.out.print(temp);
}
}
}