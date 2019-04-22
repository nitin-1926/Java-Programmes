import java.util.Scanner;
class frequency
{
public static void main(String[] x)
{
int n,temp;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[99];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
int count=1;
for(int i=0;i<n;i++)
{
if(a[i]==a[i+1])
count++;
else
System.out.println(count);
}
}
}