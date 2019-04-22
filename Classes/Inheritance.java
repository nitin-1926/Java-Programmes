import java.util.Scanner;
public class Inheritance
{
public static void main(String[] args)
{
Area obj=new Area();
obj.getDimension(5,6);
obj.display();
obj.show();
}
}
class Dimension
{
	int l,b;
	void getDimension(int len,int bre)
	{
		l=len;
		b=bre;
	}
	void display()
	{
		System.out.print(l+"\n"+b+"\n");
	}
}
class Area extends Dimension
{
	void show()
	{
		System.out.println(l*b);
	}
}