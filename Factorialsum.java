import java.util.Scanner;
public class Factorialsum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,dig,fac,pro=1;
while(n!=0)
{
pro=1;
dig=n%10;
n=n/10;
while(dig!=0)
{
pro=pro*dig;
dig--;
}
//System.out.print(pro+" ");
sum=sum+pro;
}
System.out.print(sum);
}
}