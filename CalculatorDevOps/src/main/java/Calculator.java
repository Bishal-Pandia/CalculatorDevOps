import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

	private static final Logger logger = LogManager.getLogger(Calculator.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Opening simple calculator CLI...");
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
			try {
				System.out.print("Enter your choice in numerals!!");
				choice = sc.nextInt();
			}
			catch (InputMismatchException error) {
				logger.error("Invalid input, Entered input is not a numeral");
				return;
			}

			try {
				System.out.print("Enter the first number : ");
				a = sc.nextDouble();
				System.out.print("Enter the second number : ");
				b= sc.nextDouble();
			} catch (InputMismatchException error) {
				logger.error("Invalid input, Entered input is not a number");
				return;
			}

			switch(choice)
			{

			case 1: res=calculator.addition(a, b);
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
		logger.info("[addition called] - " + a + ", " + b);
		double result = a+b;
		logger.info("[addition result] - " + result);
		return result;	
	}

	/* subtract two numbers */
	public double subtraction(double a,double b)
	{
		logger.info("[subtraction called] - " + a + ", " + b);
		double result = a-b;
		logger.info("[subtraction result] - " + result);
		return result;	
	}

	/* multiply two numbers */
	public double multiply(double a,double b)
	{
		logger.info("[multiplication called] - " + a + ", " + b);
		double result = a*b;
		logger.info("[multiplication result] - " + result);
		return result;	
	}

	/* divide two numbers */
	public double division(double a,double b)
	{
		logger.info("[division called] - " + a + ", " + b);
		if(b==0)
		{
			System.err.println("Error: cannot divide a number with zero.");
			logger.info("[division result] - " + 0.0);
			return (double) 0.0;
		}
		double result = a/b;
		logger.info("[division result] - " + result);
		return result;	

	}
}