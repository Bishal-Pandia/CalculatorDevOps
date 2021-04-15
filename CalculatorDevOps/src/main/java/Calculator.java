import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Opening simple calculator...");
		System.out.println("Which operation do you want to perform?");
		System.out.println("1.Addition \n"
				+ "2.Subtraction\n"
				+ "3.Multiplication\n"
				+ "4.Division\n");
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		double a, b;
		do {
			int choice;
			double res;

			choice = sc.nextInt();


			System.out.print("Enter the first number : ");
			a = sc.nextDouble();
			System.out.print("Enter the second number : ");
			b = sc.nextDouble();


			switch(choice)
			{

			case 1: 
				res=calculator.addition(a, b);
				System.out.println("Result= "+res);
				break;

			case 2: res=calculator.subtraction(a, b);
			System.out.println("Result= "+res);
			break;

			case 3: res=calculator.multiply(a, b);
			System.out.println("Result= "+res);
			break;

			case 4: res=calculator.division(a, b);
			System.out.println("Result= "+res);
			break;
			default: System.out.println("Wrong choice of operator!!");
			}		

			//		sc.close();
		}while(true);
	}

	/* add two numbers */
	public double addition(double a,double b)
	{
		return a+b;	
	}

	/* subtract two numbers */
	public double subtraction(double a,double b)
	{
		return a-b;		
	}

	/* multiply two numbers */
	public double multiply(double a,double b)
	{
		return a*b;		
	}

	/* divide two numbers */
	public double division(double a,double b)
	{
		if(b==0)
		{
			System.err.println("Error: cannot divide a number with zero.");
			return (double) 0.0;
		}
		return a/b;

	}
}