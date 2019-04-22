import java.util.Scanner;
public class Kaprekarnumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num;
		num=n*n;
		int sum=0,nod,count=0,dig;
		while(num!=0)
		{
		 	dig=num%10;
			num=num/10;
			count++;
			sum=sum+dig;
		}
		num=n*n;
		nod=count;
		//System.out.print(nod);
		//int temp,last_alg;
		//temp=num%10;
		//num=num/10;
		//last_alg=num+temp;
		int flag=0,dig2,sum2;
		int pro=1,no;
		while(nod!=0)
		{
			pro=1;
			num=n*n;
			nod=nod-1;
			no=nod;
			while(no!=0)
			{
				pro=pro*10;
				no--;
			}
			//System.out.println(pro);
			dig2=num % pro;
			num=num/pro;
			sum2=dig2+num;
			if(sum2==n)
			{
				flag=1;
				break;
			}
		}
		if(sum==n||flag==1)
		System.out.print("Its a Kaprekar number");
		else
		System.out.print("Its not a Kaprekar number");
	}
}       