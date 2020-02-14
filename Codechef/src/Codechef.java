import java.util.Scanner;

public class Codechef {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {

            int m = sc.nextInt();
            int[] arr = new int[m];

            for(int p=0; p<m; p++){

                arr[p] = sc.nextInt();
            }

            for(int q=0; q<m; q++) {
                System.out.print(arr[q] + ",");
            }
        }
    }
}