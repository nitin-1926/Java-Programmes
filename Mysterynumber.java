import java.util.Scanner;
public class Mysterynumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,rev=0,dig,sum=0,flag=0,num;
		//if(n%2==0&&n%11==0)
		//System.out.print("Its a mystery number"+"("+n/2+","+n/2+")");
		//else
		{
			for(i=1;i<n;i++)
			{
				flag=0;
				num=i;
                                 			rev=0;
				while(num!=0)
				{
					dig=num%10;
					rev=rev*10+dig;
					num=num/10;
				}
				sum=i+rev;
				//System.out.print(rev+ "  ");
				if(sum==n)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			System.out.print("Its a mystery number"+"("+i+","+rev+")");
			else
			System.out.print("Its not a mystery number");
		}
	}
}