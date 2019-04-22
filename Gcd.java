import java.util.Scanner;
public class Gcd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[99];
		int i,j=0,temp;
		int res=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			a[j++]=i;
		}
		for(i=j-1;i>0;i--)
		{
			if(m%a[i]==0)
			{
				res=a[i];
				break;
			}
		}
		System.out.print(res);
	}
}