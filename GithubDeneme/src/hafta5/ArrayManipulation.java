package hafta5;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] doubleArray = {8,4,9,3,0,2,7,9,3,4};
		Arrays.sort(doubleArray);
		System.out.printf("%n doubleArray: ");
		for(double value : doubleArray){
			System.out.printf("%if",value);
			
		}

		
		int[] filledIntArray = new int[10];
		displayArray(filledIntArray,"filledIntArray");
		
		int[] intArray = {1,2,3,4,5,60};
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray,0,intArrayCopy,0,intArray.length);
		
		
		boolean b = Arrays.equals(intArray,intArrayCopy);
		System.out.printf("%n%n intARray %s intArrayCopy %", (b? "==" : "!="));
		
		
		
		
	}
	
	public static void displayArray(int[] array, String description) {
		
	System.out.printf("%n%s", description);
	 for(int value : array)
		 System.out.printf("%d", value);
	}

	
	
	

}
