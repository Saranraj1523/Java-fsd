package arithmatriccalculator;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char operator;
		    Double a,b,result;

		    Scanner input = new Scanner(System.in);

		    System.out.println("Choose an operator: +, -, *, or /");
		    operator = input.next().charAt(0);
		    		
		    System.out.println("Enter first number");
		    a = input.nextDouble();

		    System.out.println("Enter second number");
		    b = input.nextDouble();

		    switch (operator) 
		    {

		      case '+':
		        result = a+b;
		        System.out.println(a+ " + " +b + " = " + result);
		        break;

		      case '-':
		        result = a-b;
		        System.out.println(a+ " - " +b+ " = " + result);
		        break;

		      case '*':
		        result = a*b;
		        System.out.println(a+ " * " +b+ " = " + result);
		        break;

		      case '/':
		        result = a/b;
		        System.out.println(a+ " / " +b+ " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

		    input.close();
		   }
	

	}


