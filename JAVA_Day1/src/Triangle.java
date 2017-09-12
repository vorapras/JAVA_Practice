import java.util.Scanner;

public class Triangle
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input 3 number");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
int max,x,y;
if(a>=b && a>=c)
{
	max=a; x=b; y=c;
}
else 
	if(b>=c && b>=a)
	{
		max=b; x=a; y=c;
	}
	else
	{
		max=c; x=a; y=b;
	}
if(x+y<=max)
{
	System.out.println("is not a triangle");
	return;
}
int m,n;
m=max*max;
n=x*x+y*y;
if(m>n)
{
	System.out.println("Moom Pan");
}
	else
		if(m<n)
		{
			System.out.println("Moom Laem");
		}
		else
		{
			System.out.println("Orthagonal");
			}
if(a==b&&b==c)
{
	System.out.println("Equality");
}
else
	if(a==b||a==c||b==c)
	{
		System.out.println("Na Jua");
	}
	else
	{
		System.out.println("Normal");
	}
		}
}

