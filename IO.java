import java.util.*;
import java.io.*;

class Addition
{
	int a,b,c;
	void read() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
	}
	void display()
	{
		System.out.println(a+b);
	}
}
public class IO
{
	public static void main(String[] args) throws Exception
	{
		Addition add = new Addition();
		add.read();
		add.display();
	}
}