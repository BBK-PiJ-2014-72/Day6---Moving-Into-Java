/**
 * 
 */

/**
 * Creating matrices
 * 
 * Create a class Matrix that has a 2-D array of integers as a field. The class should have methods
 * for:
 * 
 * A constructor method Matrix (int, int) setting the size of the array as two integers (not
 * necessarily  the same). All elements in the matrix should be initialized to 1.
 * 
 * A method setElement(int, int, int) to modify one element of the array, given its position
 * (the first two integers) and the new value to be put in that position (the third integer).
 * The method must check that the indeces are valid before modifying the array to avoid an
 * IndexOutOfBoundsException. If the indeces are invalid, the method will do nothing and the 
 * third argument will vbe ignored.
 * 
 * A method setRow(int, String) that modifies one whole row of the array, given its position as an
 * integer and the list of numbers as a STring like "1,2,3". The method muct check that the index
 * is valid and the numbers are correct(i.e if the array has four rows, the String contains four
 * numbers). If the index or the String is invalid, the method will do nothing  
 * 
 * A method setColumn(int, String) that modifies one whole column of the array, given its position
 * as an integer and the list of numbers as a String like "1,2,3". The method must check that the
 * index is valid and the numbers are correct (i.e if the array has four rows, the String contains
 * four numbers). if the index or the String is invalid, the method will do nothing 
 * 
 * @author DAVISON
 *
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Matrix {

	private int[][] array = new int[1][1];
	private int num1;
	private int num2;
	
	public Matrix(int num1, int num2){
		this.array = new int[num1][num2];
		this.num1 = num1;
		this.num2 = num2;
		
		//Initialise 2D array with Zero values
		for (int i = 0; i < num1; i++){
		  for(int j = 0; j < num2; j++){
		      array[i][j] = 0;
		      //System.out.println("" + array[i][j]);
		  }
		}
	}
	
	public String toString(){
		String outputString = "";
		for (int i = 0; i < num1; i++){
			for (int j = 0; j < num2; j++){
				outputString = outputString + this.array[i][j];
				if (j < num2 - 1){
					outputString = outputString + ",";
				}
			}
			if (i < num1 - 1){
				outputString = outputString + ":";
			}
		}
		return outputString;
	}

	public void prettyPrint(){
		String str = this.toString();
		for (int i = 0; i < this.num1; i++){
			for(int j = 0; j < this.num2; j++){
				System.out.print("" + array[i][j]);

				// Don't print out last comma for row
				if (j < num2 - 1){
					System.out.print(",");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}

	public void setElement(int num1, int num2, int value){
		if (num1 > this.num1 || num1 < this.num1){
			array[num1][num2] = value;
		}
		else {
			System.out.println("Array out of bounds for setElement method!");
		}
	}

	private boolean checkIsValidString(String stringNumber){
		int commaCount = 0;
		int numberCount = 0;
		int j = 0;
		
		for(int i = 0; i < stringNumber.length(); i++){
			if(stringNumber.charAt(i) == ','){		
					String strValue = stringNumber.substring(j, i);
					int value = Integer.parseInt(strValue);
					numberCount++;
					commaCount++;
					j = i + 1;
				    //System.out.println("value:" + strValue);  DEBUG
			}
			
			if (commaCount == this.num2 - 1){
				String strLastNumber = stringNumber.substring(i+1);
				int endValue = Integer.parseInt(strLastNumber);
				//System.out.println("value:" + strLastNumber); DEBUG
				numberCount++;
				break;
			}
		}

		if (numberCount == this.num2 && commaCount == this.num2 - 1){
			return true;
		}
		else{
			return false;
		}		
	}
	
	public void setRow(int rowPosition, String stringNumbers){
	
		if(rowPosition > -1 && rowPosition < this.num1){
			if (checkIsValidString(stringNumbers)){
				
				int j = 0;
				int numberCount = 0;
				int commaCount = 0;
				for(int i = 0; i < stringNumbers.length(); i++){
					if(stringNumbers.charAt(i) == ','){		
							String strValue = stringNumbers.substring(j, i);
							int value = Integer.parseInt(strValue);
							numberCount++;
							commaCount++;
							j = i + 1;
							setElement(rowPosition,i, value);
						    //System.out.println("value:" + strValue);  DEBUG
					}
					
					if (commaCount == this.num2 - 1){
						String strLastNumber = stringNumbers.substring(i+1);
						int endValue = Integer.parseInt(strLastNumber);
						//System.out.println("value:" + strLastNumber); DEBUG
						numberCount++;
						setElement(rowPosition,i,endValue);
						break;
					}
					
				}
			}
			else {
				System.out.println("String is not valid!");	
			}
		}
		else{
			System.out.println("row position is out of bounds!");	
		}
		//Check string has three numbers
	
		
	}

	
	
	/**
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		
		System.out.println("Please enter 2D array size i.e. num1, num2:");
		Scanner in = new Scanner(System.in);
		String strX = in.next();
		String strY = in.next();
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		
		Matrix matrix = new Matrix(x,y);
		System.out.println("Matrix toString method result showing initialization values from constructor (Zero's):");
		System.out.println(matrix.toString());
		
		System.out.println("Result of setElement(3,0,25):");
		matrix.setElement(3,0,25);
		System.out.println(matrix.toString());
		
		System.out.println("Pretty Print:");
		matrix.prettyPrint();
		
		boolean isStringValid = matrix.checkIsValidString("1234,78");
		System.out.println("Is string valid?:" + isStringValid);
		
		System.out.println("Setting row 2 with 123,5,7:");
		matrix.setRow(2, "123,5,7");
		matrix.toString();
		
	}

}
