import java.util.Scanner;
public class Perfectnumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[99];
int i,sum=0,j=0;
for(i=1;i<n;i++)
{
if(n%i==0)
a[j++]=i;
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
if(sum==n)
System.out.print("It is a perfect number");
else
System.out.print("It is not a perfect number");
}
}