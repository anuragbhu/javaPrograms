import java.util.Scanner;

public class ArrayInsert {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA = new int[n + 1];
		
		for(int i = 0; i < n; i++) {
			arrA[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arrA[i]);
		}
		
		int index = sc.nextInt();
		int value = sc.nextInt();
		
		for(int i = n; i > index; i--) {
			arrA[i] = arrA[i-1];
		}	
		
		arrA[index] = value;
		
		for(int i = 0; i < n + 1; i++) {
			System.out.println(arrA[i]);
		}
		sc.close();
	}
}
