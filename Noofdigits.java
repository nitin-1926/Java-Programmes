import java.util.Scanner;
public class Noofdigits
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0,dig;
while(n!=0)
{
dig=n%10;
n=n/10;
count++;
}
System.out.print(count);
}
}