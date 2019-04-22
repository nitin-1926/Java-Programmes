import java.util.Scanner;
public class Btod
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dec=0,base=1,digit;
		while(n!=0)
		{
			digit=n%10;
			n=n/10;
			dec=dec+digit*base;
			base=base*2;
		}
		System.out.println(dec);
	}
}