import java.util.Scanner;
public class Fibonacci
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,a=0,b=1,c=0;
System.out.print("0 ");
for(i=0;i<n-1;i++)
{
a=b;
b=c;
c=a+b;
System.out.print(c+" ");
}
}
}
