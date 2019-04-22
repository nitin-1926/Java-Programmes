import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dig,pro,sum=0;
		int num;
		num=n;
		while(n!=0)
		{
			dig=n%10;
			pro=dig*dig*dig;
			sum=sum+pro;
			n=n/10;
		}
		if(num==sum)
		System.out.println("The number is an Armstrong number");
		else
		System.out.println("The number is not Armstrong number");
	}
}