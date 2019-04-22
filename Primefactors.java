import java.util.Scanner;
public class Primefactors
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[99];
int i,j=0,k;
for(i=1;i<=n;i++)
{
if(n%i==0)
a[j++]=i;
}
//for(i=0;i<j;i++)
//System.out.println(a[i]);
System.out.print("1");
//if(n%2==0)
//System.out.print(" 2");
int flag=0;
for(i=1;i<j;i++)
{
flag=0;
for(k=2;k<(a[i]);k++)
{
if(a[i]%k==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.print(" "+a[i]);
}
}
}
