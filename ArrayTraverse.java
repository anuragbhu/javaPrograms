public class ArrayTraverse {
	
	public static void main (String [] args) {
		
		int[] intArray = new int[30];
		intArray[0] = 212;
		intArray[1] = 12;
		intArray[2] = -21;
		
		//int intArray[] = new int[3];
		//intArray[0] = 212;
		//intArray[1] = 12;
		//intArray[2] = -21;
		
		//int[] intArray = {212, 12, -21};
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("Value at index " +i+ " is " +intArray[i]);
		}
	}
} 
