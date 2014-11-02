
/**
 * 2. Copying Arrays
 * 
 * Create a new Java class called ArrayCopier with a method called copy that takes two arrays
 * of integers as parameters. The method should copy the elements of the first array (you can call
 * it "source" to the second one(dst, from "destination") as much as possible
 * 
 * if the second array is smaller, then only those elements that fit will be copied. 
 * If the second array is larger, it will be filled with zeroes.
 *
 * Write a program that creates an object of this class and uses the method to copy
 * some arrays in all three cases:
 * 
 * Both arrays are of the same size.
 * The source array is longer.
 * The source array is shorter.
 * 
 * @author DAVISON
 *
 */

import java.util.Arrays;

public class ArrayCopier {

	/**
	 * @param args
	 */
	
	private int[] src;
	private int[] dst;
	
	public ArrayCopier(){
		this.src = null;
		this.dst = null;	
	}
	
	public int[] copy(int[] sourceArray, int[] destinationArray){
			
		//Case1 - If Destination Array is smaller than Source Array then only those elements from 
		//Source Array that fit into Destination Array will be copied to Destination Array 
		
		if(destinationArray.length < sourceArray.length){
			for (int i = 0; i < destinationArray.length; i++){
				destinationArray[i] = sourceArray[i]; 
			}
		}
		
		//Case2 - If the Destination Array is larger than Source Array then Destination Array will be filled with Zero's (0's)
		if (destinationArray.length > sourceArray.length){
			for (int i = 0; i < destinationArray.length; i++){
				destinationArray[i] = 0;
			}
		}
		
		//Case3 - If the Destination Array is the same size as the Source Array copy the contents of
		//Source Array into Destination array
		if (destinationArray.length == sourceArray.length){
			for (int i = 0; i < sourceArray.length; i++){
				destinationArray[i] = sourceArray[i];
			}
		}
		return destinationArray;
	}
	
	public static void main(String[] args) {
	
		//Test Case 1	
		ArrayCopier arrayCopier = new ArrayCopier();
		int[] srcArray3 = {1,24,56,67,87,90};
		int[] destArray3 = {1,2,3,4,5};
		int[] resultArray3 = arrayCopier.copy(srcArray3, destArray3);
		
		System.out.println("When src array size " + Arrays.toString(srcArray3)  +  " > dst array size " + Arrays.toString(destArray3) + " , dest array is: " + Arrays.toString(resultArray3));
		
		//Test Case 2
		int[] srcArray = {1,24,56,67,67};
		int[] destArray = {1,2,3,4,5,7};
		int[] resultArray = arrayCopier.copy(srcArray, destArray);
		
		System.out.println("When src array size " + Arrays.toString(srcArray) + " < dst array " + Arrays.toString(destArray)  + " size, dest array is: " + Arrays.toString(resultArray));

		//Test Case 3
		int[] srcArray2 = {1,24,56,67,67};
		int[] destArray2 = {1,2,3,4,5};
		int[] resultArray2 = arrayCopier.copy(srcArray2, destArray2);
		
		System.out.println("When src array size " + Arrays.toString(srcArray) + " = dst array " + Arrays.toString(destArray2)  + " size, dest array is: " + Arrays.toString(resultArray2));
	}
}
