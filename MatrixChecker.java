/**
 * 
 */

/**
 * @author DAVISON
 *
 */
public class MatrixChecker {
	
	private int num1;
	private int num2;
	private int[][] array2D;
	
	public MatrixChecker(){
	 this.num1 = 0;
	 this.num2 = 0;
	 this.array2D = null;
	}
	
	public boolean isSymetrical(int[] arrayToCheck){
		boolean symmetrical = false;
		int[] array = arrayToCheck.clone(); 
		int j = 0;
		int length = 0;
		if (array.length % 2 == 0){  //even number of array elements
		    length = array.length / 2;	
		}
		else if(array.length % 2 > 0){  //odd number of array elements
			length = array.length / 2 + 1;
		}
		
		j = array.length;
		for(int i = 0; i < length; i++){
			
			System.out.println("Array length:" + j);
			System.out.println("array[i]" + array[i]);
			System.out.println("array[j-1]" + array[j -1]);
			
			if (array[i] == array[j - 1]){
				j = j - 1;
				symmetrical = true;
			}
			else {
				symmetrical = false;
				return symmetrical;
			}
		}
		return symmetrical;
	}
	
	
	public boolean isSymmetrical(int[][] array, int num1, int num2){
		
	boolean symmetrical = false;

	this.array2D = array.clone();
	this.num1 = num1;
	this.num2 = num2;
	
	for (int i = 0; i < num1; i++){
		for (int j = 0; j < num2; j++){
			//System.out.println("array[i][j]:" + this.array2D[i][j]);  DEBUG
			//System.out.println("array[j][i]:" + this.array2D[j][i]);  DEBUG
	           if (this.array2D[i][j] == this.array2D[j][i]){  
	        	   symmetrical = true;		
	           }
	           else{
	        	   symmetrical = false;
	        	   return symmetrical;
	           }
		}
	}
	return symmetrical;
	}
	
	
	public boolean isTriangular(int[][] array2D, int num1, int num2){
		boolean triangular = false;
		
		this.array2D = array2D.clone();
		this.num1 = num1;
		this.num2 = num2;
		
		for (int i = 0; i < num1; i++){
			for (int j = 0; j < num2; j++){
				//System.out.println("array[i][j]:" + this.array2D[i][j]);  DEBUG
				//System.out.println("array[j][i]:" + this.array2D[j][i]);  DEBUG
				if (i > j){
		           if (this.array2D[i][j] == 0){  
		        	   triangular = true;		
		           }
		           else{
		        	   triangular = false;
		        	   return triangular;
		           }
				}
			}
		}
		return triangular;
	}
	
	
	
	
	public static void main(String[] args) {
		
		//Check that array is symmetrical for odd and even length arrays
		int[] array = {1,2,3,4,3,2,1};
		MatrixChecker matrixChecker = new MatrixChecker();
		System.out.println("Is array {1,2,3,4,3,2,1} symmetrical: " + matrixChecker.isSymetrical(array));
		
		int[] array2 = {1,2,3,3,2,1};
		System.out.println("Is array {1,2,3,3,2,1} symmetrical: " + matrixChecker.isSymetrical(array2));
		
		//Check that array is not symmetrical for odd and even length arrays
		
		int[] array3 = {1,2,3,4,5,6};
		System.out.println("Is array {1,2,3,4,5,6} symmetrical: " + matrixChecker.isSymetrical(array3));
		
		int[] array4 = {1,2,3,4,5,6,7};
		System.out.println("Is array {1,2,3,4,5,6,7} symmetrical: " + matrixChecker.isSymetrical(array4));
		
		
       //Is 2D array symmetrical?
		//Symmetrical 2D array
		int[][] symmetricArray2D = 
				{
					{1,2,3},
					{2,4,5},
					{3,5,6}
				};

		//Non-Symmetrical 2D array
		int[][] nonSymmetricArray2D = 
				{
					{1,2,3,3},
					{2,4,5,1},
					{3,5,6,1},
					{1,1,1,1}
				};

	
		
		//Triangular 2D array
		int[][] triangularArray2D =
					{
						{1,1,1},
						{0,1,1},
						{0,0,1}	
					};
		//non Triangular 2D array
		int[][] nonTriangularArray2D =
					{
						{0,0,0},
						{1,0,0},
						{0,1,0}	
					};
		
		
		System.out.println("Is 2D Array symmetrical?: " + matrixChecker.isSymmetrical(symmetricArray2D,3,3));	
		System.out.println("Is 2D Array symmetrical?: " + matrixChecker.isSymmetrical(nonSymmetricArray2D,4,4));
		System.out.println("Is 2D Array triangular?: " + matrixChecker.isTriangular(triangularArray2D,3,3));
		System.out.println("Is 2D Array triangular?: " + matrixChecker.isTriangular(nonTriangularArray2D,3,3));
	}
}
