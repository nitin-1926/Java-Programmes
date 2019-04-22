import java.util.Scanner;
class Student 
{
int r;
String n;
Student(int x,String nam)
{
r=x;
n=nam;
}
void display()
{
System.out.println(r+" "+n);
}
}
public class Arrobj
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i;
Student obj[]=new Student[5];
for(i=0;i<5;i++)
{
int n=sc.nextInt();
String name=sc.next();
obj[i]=new Student(n,name);
}
for(i=0;i<5;i++)
{
obj[i].display();
}
}
}