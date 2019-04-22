import java.util.Scanner;
public class Dtob
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,k=0,arr[],rem;
		arr=new int[99];
		while(n!=0)
		{
			rem=n%2;
			n=n/2;
			arr[k++]=rem;
		}
		for(i=k-1;i>=0;i--)
		{
			int a=arr[i];
			System.out.print(a);
		}
	}
}