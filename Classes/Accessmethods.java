import java.util.Scanner;
public class Accessmethods
{
	public static void main(String[] args)
	{
		Accessmethods obj=new Accessmethods();
		obj.display();
	}
	private Accessmethods()
	{
		System.out.println("Base constructor called");
	}
	void display()
	{
		System.out.print("Derived constructor called");
	}
}

