import java.util.Scanner;
public class Secondminmax
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[99];
int i,j=0,small=10000,large=-10000;
for(i=0;i<n;i++)
a[i]=sc.nextInt();
int b[]=new int[99];
for(i=0;i<n;i++)
{
if(a[i]>large)
large=a[i];
if(a[i]<small)
small=a[i];
}
for(i=0;i<n;i++)
{
if(a[i]<large&&a[i]>small)
b[j++]=a[i];
}
large=-10000;
small=10000;
for(i=0;i<j;i++)
{
if(b[i]>large)
large=b[i];
if(b[i]<small)
small=b[i];
}
System.out.print(large+" "+small);
}
}
