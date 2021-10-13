import java.util.Scanner;

public class SumWithRecursionAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt(); //1
        int n = scanner.nextInt();
        int sum = 0;
        int store;
        int[] arr = new int[n];
        for (int t = 0; t < test; t++) {

            for (int a = 0; a < n; a++) {
                arr[a] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    store = arr[j] - arr[i];
                    sum = sum + store;
                }
            }
            System.out.print(sum + " ");
        }
    }
}
/*
1
3
1 5 3
4 6 4
Process finished with exit code 0
 */