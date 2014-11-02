
/**
 * Anti-aircraft aim
 * 
 * Create an enumerated type Result in its own file. The enum must have 8 possible values 
 * HIT, FAIL_LEFT, FAIL_RIGHT, FAIL_LOW, FAIL_SHORT, FAIL_LONG, OUT_OF_RANGE.
 * Hint: the enum must be public.
 * 
 * Then create a Java class Target with the following methods:
 * 
 * A constructor method Target(int) that creates a 3-D array of integers of the proposed size in all
 * three dimensions. All elements must be set to zero.
 * 
 * A method called init() 
 * 
 * @author DAVISON
 *
 */
import java.util.Scanner;

public class Target {

	private int [][][] array;
	private int num1;
	private int num2;
	private int num3;
	
	public Target(int num){
		this.array = new int[num][num][num];
		this.num1 = num;
		this.num2 = num;
		this.num3 = num;
		
		//initialise the 3D array with zero's 
		for (int i = 0; i < this.num1; i++){
			for (int j = 0; j < this.num2; j++){
				for (int k = 0; k < this.num3; k++){
					array[i][j][k] = 0;
				}
			}
		}	
	}
	
	public void init(){		
		int N = this.num1 * this.num2 * this.num3;
		
		this.num1 = (int) Math.abs(this.num1 * Math.random());
		this.num2 = (int) Math.abs(this.num2 * Math.random());
		this.num3 = (int) Math.abs(this.num3 * Math.random());
		
		this.array[this.num1][this.num2][this.num3] = 1;
	}
	
	public Result fire(int num1, int num2, int num3){
		Result result;
		
		if (num1 == this.num1 & num2 == this.num2 & num3 == this.num3){ 
		    
		}	
		if (num1 > this.num1 & num2 == this.num2 & num3 == this.num3){ 
			
		}
		if (num1 == this.num1 & num2 == this.num2 & num3 == this.num3){ 
			
		}
		
		
			
			result = result.FAIL_RIGHT;
			result = result.FAIL_HIGH;
			result = result.FAIL_LOW;
			result = result.FAIL_SHORT;
			result = result.FAIL_LONG;
			result = result.OUT_OF_RANGE;
		
		
	return result; 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0
		int num3 = 0;
		
		while(){			
			System.out.println("Here they come! Try to bring the plane down!");			
			System.out.println("Enter a coordinate X:");	
			num1 = in.next();
			System.out.println("Enter a coordinate Y:");
			num2 = in.next();
			System.out.println("Enter a coordinate Z:");
			num3 = in.next();
		}
	}

}
