import java.util.Scanner;
public class Pallandrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int rev=0,dig,num;
		num=n;
		while(n!=0)
		{
			dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		if(num==rev)
		System.out.println("The number is a Pallandrome");
		else
		System.out.println("The number is not a Pallandrome");
	}
}