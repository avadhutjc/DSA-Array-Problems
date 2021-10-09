/*
5 5
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
26 27 28 29 30
31 32 33 34 35
 */
import java.util.Scanner;
public class ZigZagLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int arr[][] = new int[N][M];

        for (int i = 0; i < N; i ++){
            for (int j = 0; j < M; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++){ //this for loop is for no.of.rows only
            if (i % 2 == 0){
                for (int j = 0; j <= M-1; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }

            if (i % 2 == 1){
                for (int j = M - 1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
/*
Output :
5 5
11 12 13 14 15      --------> 15
16 17 18 19 20      <-------< 20
21 22 23 24 25      >-------> 25
26 27 28 29 30      <-------< 30
31 32 33 34 35      >-------> 35
11 12 13 14 15 20 19 18 17 16 21 22 23 24 25 30 29 28 27 26 31 32 33 34 35
Process finished with exit code 0
 */