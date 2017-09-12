import java.util.Scanner;

public class BMI
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		double weight,height,BMI;
		System.out.println("Please input your weight(kg): ");
		weight = sc.nextDouble();
		System.out.println("Please input your height(cm): ");
		height = sc.nextDouble();
		height = height/100;
		BMI = weight/(height*height);
		if(BMI>25)
		{
			System.out.println("Overweight");
		}
		else
		{
			if(BMI<20)
			{
				System.out.println("Underweight");
			}
			else
			{
				System.out.println("Normal");	
			}
		}

	}

}
