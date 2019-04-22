import java.util.Scanner;
public class Superpallandrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int rev=0,dig,num,num1;
		num=n;
		while(n!=0)
		{
			dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		if(num==rev)
		{
			num1=num*num;
			n=num1;
			int rev1=0,dig1;
			while(n!=0)
			{
				dig1=n%10;
				rev1=rev1*10+dig1;
				n=n/10;
			}
			if(num1==rev1)
			System.out.println("The number is a Superpallandrome");
			else
			System.out.println("The number is not a Superpallandrome");
		}
		else
		System.out.println("The number is not a Superpallandrome");
	}
}