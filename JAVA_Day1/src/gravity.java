import java.util.Scanner;

public class gravity
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
double f,G,m1,m2,R;
Scanner sc =new Scanner(System.in);
System.out.println("input m1,m2,R");
m1=sc.nextDouble();
m2=sc.nextDouble();
R=sc.nextDouble();
G = 6.67e-11;
f=G*m1*m2/(R*R);
System.out.println(f);

	}

}
