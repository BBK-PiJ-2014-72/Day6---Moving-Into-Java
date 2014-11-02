
 /**
  * 1. Dividing Integers
  * 
  * Create a java class called Calculator. The class should implement the following
  * methods, each of them printing the result on the screen
  * @param args
  *
  * @author DAVISON
  *
  */

import java.util.Scanner;

public class Calculator {

	private int number1;
	private int number2;
	
	public Calculator(){
		this.number1 = 0;
		this.number2 = 0;
	}
	
	public int add(int number1, int number2){
		this.setNumber1(number1);
		this.setNumber2(number2);
		return this.getNumber1() + this.getNumber2();
	}
	
	public int subtraction(int number1, int number2){
		this.setNumber1(number1);
		this.setNumber2(number2);
		return this.getNumber1() - this.getNumber2();
	}

	public int multiply(int number1, int number2){
		this.setNumber1(number1);
		this.setNumber2(number2);
		return this.getNumber1() * this.getNumber2();
	}
	
	public double divide (int number1, int number2){
		this.setNumber1(number1);
		this.setNumber2(number2);
		
		double num1 = (double) this.getNumber1();
		double num2 = (double) this.getNumber2();
		double num = num1 / num2; 
		return num;
	}
	
	public int modulus(int number1, int number2){
		this.setNumber1(number1);
		this.setNumber2(number2);
		int num = this.getNumber1() % this.getNumber2();
		return num;
	}
	
	public void setNumber1(int num){
		this.number1 = num;
	}
	
	public void setNumber2(int num){
		this.number2 = num;
	}
	
	
	public int getNumber1(){
		return this.number1;
	}
	
	public int getNumber2(){
		return this.number2;
	}
	
	
	public static void main(String[] args) {
	
		//Testing Calculator class
		
		Calculator calculator = new Calculator();
		
		boolean returnLoop = true;
		while(returnLoop){
			System.out.println("Menu Options");
			System.out.println("1 - Add");
			System.out.println("2 - Subtract");
			System.out.println("3 - Multiply");
			System.out.println("4 - Divide");
			System.out.println("5 - Modulus");
			System.out.println("0 - Exit");
			System.out.print(">");
			Scanner in = new Scanner(System.in);		
			String menuStr = in.next();
			int intMenuOption = Integer.parseInt(menuStr);
			
			int num1 = 0;
			int num2 = 0;
			String str1 = "";
			String str2 = "";
			
			switch (intMenuOption){
			case 0:
				returnLoop = false;
				break;
			case 1:
				System.out.print("Please enter a number1:");
				str1 = in.next();
				num1 = Integer.parseInt(str1);
				System.out.print("Please enter a number2:");
				str2 = in.next();
				num2 = Integer.parseInt(str2);
				System.out.println("Answer " + num1 + " + " + num2 + " = "  + calculator.add(num1, num2));
				System.out.println();
				break;
			case 2:	
				System.out.print("Please enter a number1:");
				str1 = in.next();
				num1 = Integer.parseInt(str1);
				System.out.print("Please enter a number2:");
				str2 = in.next();
				num2 = Integer.parseInt(str2);
				System.out.println("Answer " + num1 + " - " + num2 + " = "  + calculator.subtraction(num1, num2));
				System.out.println();
				break;
			case 3:
				System.out.print("Please enter a number1:");
				str1 = in.next();
				num1 = Integer.parseInt(str1);
				System.out.print("Please enter a number2");
				str2 = in.next();
				num2 = Integer.parseInt(str2);
				System.out.println("Answer " + num1 + " * " + num2 + " = "  + calculator.multiply(num1, num2));
				System.out.println();
				break;
			case 4:
				System.out.print("Please enter a number1:");
				str1 = in.next();
				num1 = Integer.parseInt(str1);
				System.out.print("Please enter a number2:");
				str2 = in.next();
				num2 = Integer.parseInt(str2);
				System.out.println("Answer " + num1 + " / " + num2 + " = "  + calculator.divide(num1, num2));
				System.out.println();
				break;
			case 5:
				System.out.print("Please enter a number1:");
				str1 = in.next();
				num1 = Integer.parseInt(str1);
				System.out.print("Please enter a number2:");
				str2 = in.next();
				num2 = Integer.parseInt(str2);
				System.out.println("Answer " + num1 + " % " + num2 + " = "  + calculator.modulus(num1, num2));
				System.out.println();
				break;
		}

	}

	}
}
