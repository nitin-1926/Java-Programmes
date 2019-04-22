import java.util.Scanner;
public class Sort2d
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number no rows");
	int r=sc.nextInt();
	System.out.println("Enter number no columns");
	int c=sc.nextInt();
	int i,j,temp,k=0;
	int a[][]=new int[r][c];
	int b[]=new int[99];
	for(i=0;i<r;i++)
	for(j=0;j<c;j++)
	a[i][j]=sc.nextInt();
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			b[k++]=a[i][j];
		}
	}
	for(i=0;i<k;i++)
	{
		for(j=i+1;j<k;j++)
		{
			if(b[i]>b[j])
			{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	k=0;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			a[i][j]=b[k++];
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		System.out.print(a[i][j]);
		System.out.println();
	}
}
}