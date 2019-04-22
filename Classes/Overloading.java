import java.util.Scanner;
public class Overloading
{
public static void main(String[] args)
{
//Scanner sc=new Scanner(System.in);
//int a=sc.nextInt();
//int b=sc.nextInt();
Area ob;
ob=new Area();
Area ob1=new Area(3,4);
Area ob2=new Area(9);
Area ob3=new Area(3.14f);
ob1.calArea(3,4);
ob2.calArea(9);
ob3.calArea(3.14f);
}
}
class Area
{
int l,b,s;
float r;
Area()
{
l=0;b=0;
}
Area(int x, int y)
{
l=x;
b=y;
}
Area(int x)
{
s=x;
}
Area(float y)
{
r=y;
}
void calArea(int x, int y)
{
System.out.println(x*y);
}
void calArea(int z)
{
System.out.println(s*s);
}
void calArea(float p)
{
System.out.println(3.14*p*p);
}
}
