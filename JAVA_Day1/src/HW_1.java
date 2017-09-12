import java.util.Scanner;

public class HW_1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a,b,c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a > 13)
		{
			if (b != 6)
			{
				System.out.println("A");
			} 
			else
			{
				if (c <= 7)
				{
					System.out.println("B");
				} 
				else
				{
					System.out.println("C");
				}
			}
		}
	else
		{
			if (b <= 16)
			{
				System.out.println("D");
			} 
			else
			{
				if (c > 6)
				{
					System.out.println("E");
				}
				else
				{
					System.out.println("F");
				}

			}
		}
	}
}
