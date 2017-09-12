import java.util.Scanner;

public class test5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Please input a,b,c");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if (a>3)
{
	System.out.println("Red");
}
else
{
if(b<=2)
{
	if(c!=5)
	{
	System.out.println("Green");
	}
	else
	{
		System.out.println("Blue");
	}
}
	else
	{
		System.out.println("Pink");
	}
}
}
	}


