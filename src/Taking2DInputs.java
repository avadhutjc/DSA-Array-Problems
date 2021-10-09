import java.util.Scanner;

public class Taking2DInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//     //   int n = scanner.nextInt();
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int arr[][] = new int[a][b];
//
//        for (int i = 0; i < a; i++){
//            for (int j = 0; j < b; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[] [] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
        }
    }
}
