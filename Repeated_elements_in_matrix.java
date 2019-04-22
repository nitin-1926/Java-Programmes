import java.util.Scanner;
public class Repeated_elements_in_matrix
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. of rows");
	int r=sc.nextInt();
	System.out.println("Enter no. of columns");
	int c=sc.nextInt();
	int i,j,k=0;
	int temp,count=0;
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
	for(i=1;i<k;i++)
	{
		if(b[i]==b[i+1]||b[i]==b[i-1])
		continue;
		else
		count++;
	}
	int z[]=new int[99];
	z[0]=b[0];
	int x=1;
	for(i=1;i<k;i++)
	{
		if(b[i]==b[i-1])
		continue;
		else
		z[x++]=b[i];
	}
	System.out.println("No. of repeated elements in the matrix are:"+(x-count));
}
}