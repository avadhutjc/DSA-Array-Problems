import java.util.Scanner;

public class ZigZagTopToBottom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int arr[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
//-------------------------------------------------------------------
        for (int i = 0; i < M; i++) {
//                if (i % 2 == 0){

//                    for (int j = 0; j<= M - 1; j++){
//                        System.out.print(arr[j][i] + " ");
//                    }
//                }

            if (i % 2 == 1) {
                for (int j = N - 1; j >= 4; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }


    }
}
/*
5 5
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
26 27 28 29 30
31 32 33 34 35
 */