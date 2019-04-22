import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int x=2;
		int flag=0;
		while(n>0)
		{
			flag=0;
			for(i=2;i<=x/2;i++)
			{
				if(x%i==0)
				{
					flag=1;
					break;
				}
			}
			x++;
			if(flag==0)
			{
			 	n--;	
			}
		}
		System.out.println(x-1);
	}
}		