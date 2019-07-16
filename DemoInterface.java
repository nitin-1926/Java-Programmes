import java.util.*;
public class DemoInterface
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.read();
		t.display();

		Data d;
		d = new Test();
		d.read();
		//d.display();
	}

}
interface Data
{
	void read();
}
class Test implements Data
{
	public void read()
	{
		System.out.println("Interafce ka Read");
	}
	void display()
	{
		System.out.println("Interafce ka Display");
	}
}
// abstract class Data
// 	{
// 		void display()
// 		{
// 			System.out.println("Abstract ka Display");
// 		}
// 		void fff()
// 		{
// 			System.out.println("Abstract ka fff");

// 		}
// 		abstract void read();
// 	}
// 	class Test extends Data
// 	{
// 		void read()
// 		{
// 			System.out.println("Test ka read");

// 		}
// 		void display()
// 		{
// 			super.display();
// 			System.out.println("Test ka Display");

// 		}
// 	}