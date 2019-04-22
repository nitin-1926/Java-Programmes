import java.util.Scanner;
public class Spiral
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows");
int m=sc.nextInt();
System.out.println("Enter number of columns");
int n=sc.nextInt();
int i, k = 0, l = 0,j; 
int a[][]=new int[m][n];
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=sc.nextInt();  
    while (k < m && l < n) 
    { 
        for (i = l; i < n; ++i) 
        { 
            System.out.print(a[k][i]); 
        } 
        k++; 
        for (i = k; i < m; ++i) 
        { 
            System.out.print(a[i][n-1]); 
        } 
        n--; 
        if ( k < m) 
        { 
            for (i = n-1; i >= l; --i) 
            { 
                System.out.print(a[m-1][i]); 
            } 
            m--; 
        } 
        if (l < n) 
        { 
            for (i = m-1; i >= k; --i) 
            { 
                System.out.print(a[i][l]); 
            } 
            l++;     
        }         
    } 
}
}