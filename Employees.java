
/**
 * 7. Big Enough
 * 
 * Write a small program that asks for the names and IDs of all employees in a small
 * company, and store them in an array of integers and an array of Strings. (You will
 * need to create a java class to hold the arrays, and to access them).
 * 
 * This is similar to the example from the notes, but you do not know the number
 * of employees in advance. Read the names and IDs of the employees until the user enters a
 * an empty name (i.e. length 0) or an ID equal to 0
 * 
 * Once you have finished reading employee data, go through the employee list and print the
 * names and IDs of those employees whose ID is even or their names start with "S".
 * 
 * (Hint: As you do not know how many employees you need in advance, you will need
 * a growing array. Create a small array, if it gets full create an array twice as big, copy
 * all data to the new array, and discard the old array.)
 * 
 * @param args
 */

import java.util.Scanner;
import java.util.Arrays;

public class Employees {

	private String[] names;
	private  int[] IDs;
	
	public Employees(){
		this.names = null;
		this.IDs = new int[10]; 
	}
	
	public static void main(String[] args) {
		String employeeName = "";
		String strID = "";
		int ID = 0;
		
		int currentSize = 0;
		int currentSize2 = 0;
		Employees employees = new Employees();
		employees.names = new String[10];
		employees.IDs = new int[10];
		boolean returnLoop = true;
		
		//Reading employee data
		System.out.println("Please enter employee name: ");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter employee id: ");
	    Scanner in2 = new Scanner(System.in);
	
	    //Using example from Java for Everyone
	    while(returnLoop){
	    	//Grow array if it has been completely filled
	        employeeName = in.nextLine();
	        strID = in2.next();
	        ID = Integer.parseInt(strID);
	    	if (employeeName.length() == 0 && ID == 0){
	    		returnLoop = false;
	    	}
	    	else{
	    		if(currentSize >= employees.names.length){
	    			employees.names = Arrays.copyOf(employees.names,  2 * employees.names.length);
	    		}
	    		
	    		if(currentSize2 >= employees.IDs.length){
	    			employees.IDs = Arrays.copyOf(employees.IDs, 2 * employees.IDs.length);
	    		}
	    		
	    		employees.names[currentSize] = employeeName;
	    		employees.IDs[currentSize2] = ID;
	    		currentSize++;
	    		currentSize2++;
	    		
	    		System.out.println("Please enter employee name:" );
		    	System.out.println("Please enter employee id:" );
	    	}
	    	
	    }
	   
	    //Discard unfilled elements
	    employees.names = Arrays.copyOf(employees.names, currentSize); 
	    employees.IDs = Arrays.copyOf(employees.IDs,  currentSize);
	    
	    
	    // System.out.println("" + Arrays.toString(employees.names));  DEBUG
		// System.out.println("" + Arrays.toString(employees.IDs));  DEBUG
		
	    //Go through employee list and print the names and IDs of those employees whose ID is even
	    //or their names start with "S"
	 
	    int p = 0;
	    for (String element: employees.names){
	    	if (element.substring(0,1).equals("S")){
	    		System.out.println("name: " + employees.names[p]);
	    		System.out.println("id: " + employees.IDs[p]);
	    	} 
	    	p++;
	    }
	    
	    int k = 0;
	    for(int id: employees.IDs){
	    	if(id % 2 == 0){
	    		System.out.println("name: " + employees.names[k]);
	    		System.out.println("id: " + employees.IDs[k]);
	    	}
	    	k++;
	    }
	}
}


