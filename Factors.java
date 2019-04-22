import java.util.Scanner;
public class Factors
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[99];
int i,j=0;
for(i=1;i<=n/2;i++)
{
if(n%i==0)
a[j++]=i;
}
for(i=0;i<j;i++)
System.out.print(a[i]);
}
}