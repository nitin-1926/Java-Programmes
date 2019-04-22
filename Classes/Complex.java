public class Complex
{
public static void main(String[] args)
{
Comp ob=new Comp();
Comp ob1=new Comp(1,2);
Comp ob2=new Comp(9,8);
ob1.add(ob2);
ob1.sub(ob2);
ob1.mul(ob2);
}
}
class Comp
{
int a,b;
int sum,pro,sub;
Comp()
{
a=0;
b=0;
}
Comp(int x, int y)
{
a=x;
b=y;
}
void add(Comp c1)
{
System.out.println((a+c1.a)+"+i"+(b+c1.b));
}
void sub(Comp c2)
{
System.out.println((a-c2.a)+"i"+(b-c2.b));
}
void mul(Comp c3)
{
System.out.println(((a*c3.a)-(b*c3.b))+"+i"+((a*c3.b)+(b*c3.a)));
}
}