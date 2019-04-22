import java.util.Scanner;
public class Primerange
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i,j,flag=0;
		for(i=n;i<m;i++)
		{
			flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0&&i!=1)
			System.out.println(i);
		}
	}
}
		 