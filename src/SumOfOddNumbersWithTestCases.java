
import java.util.Scanner;
public class SumOfOddNumbersWithTestCases {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            for (int i = 0; i < T; i++) {
                int N = scanner.nextInt();
                int[] A = new int[N];
                for (int j = 0; j < N; j++) {
                    A[j] = scanner.nextInt();
                }
                int sumation = 0;
                for (int k = 0; k < N; k++) {
                    if (A[k] % 2 != 0) { //(A[k] % 2 == 1)
                        sumation += A[k];
                    }
                }
                System.out.println(sumation);
            }
        }
}
/*
2
3
1 2 3
4
5
2 2 2 2 1
1

Process finished with exit code 0
 */