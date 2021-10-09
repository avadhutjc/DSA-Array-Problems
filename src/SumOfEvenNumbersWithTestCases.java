import java.util.Scanner;

public class SumOfEvenNumbersWithTestCases {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; t++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            int sum = 0;
            for (int k = 0; k < N; k++) {
                if (arr[k] % 2 == 0) {
                    sum += arr[k];   //sum = sum + arr[k];
                }
            }
            System.out.println(sum);
        }
    }
}
/*
Output :
3..//no. of test cases
5 //1
1 2 3 4 5
6
4 //2
5 6 8 2
16
7 //3
4 5 6 8 9 1 2
20
 */