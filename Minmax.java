import java.util.Scanner;
public class Minmax
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[99];
int i;
for(i=0;i<n;i++)
a[i]=sc.nextInt();
int small=10000,large=-10000;
for(i=0;i<n;i++)
{
if(a[i]>large)
large=a[i];
}
System.out.println("Largest number is "+large);
for(i=0;i<n;i++)
{
if(a[i]<small)
small=a[i];
}
System.out.println("Smallest number is "+small);
}
}