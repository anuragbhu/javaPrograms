import java.util.Scanner;

public class ArrayAppend {
	
	public static void main(String[] args) {
		
		//int[] intArr = new int[5];
		//intArr[0] = 121;
		//intArr[1] = 23;
		//intArr[2] = 25;
		
		//for(int i = 0 ; i < intArr.length; i++) {
		//	System.out.println("Value at index " + i + " is " + intArr[i]);
		//}
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the value :");
		//intArr[3] = sc.nextInt();
		
		//for(int i = 0 ; i < intArr.length; i++) {
		//	System.out.println("Value at index " + i + " is " + intArr[i]);
		//} 
		
		//sc.close();
		
		int[] arrA = {1, 2, 3};
		int size = arrA.length + 1;
		int[] arrB = new int[size];
		
		for(int i = 0 ; i < arrB.length - 1; i++) {
			arrB[i] = arrA[i];
		}
		
		for(int i = 0 ; i < arrB.length; i++) {
			System.out.println("Value at index " + i + " is " + arrB[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		arrB[size - 1] = sc.nextInt();
		for(int i = 0 ; i < arrB.length; i++) {
			System.out.println("Value at index " + i + " is " + arrB[i]);
		}
		sc.close();
	}
}
