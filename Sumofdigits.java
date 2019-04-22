import java .util.Scanner;
public class Sumofdigits
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,dig;
		while(n!=0)
		{
			dig=n%10;
			sum=sum+dig;
			n=n/10;
		}
		System.out.println(sum);
	}
}