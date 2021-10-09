/*

 */
import java.util.Scanner;
public class SubArrayQuest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int N = scanner.nextInt();
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            int count = 0;
            for (int k = 0; k < N; k++) {  //this for loop is for even
                for (int l = k; l < N; l++) { //this for loop is for odd
                    for (int m = k; m <= l; m++) {
                        if ((arr[k] % 2 == 0) && (arr[l] % 2 == 1)) {
                            count = count + 1;
                            break;
                        }
                    }

                }
            }
            System.out.print(count);
        }
    }
}
/*
Output :
2 //no of test cases
5
1 3 5 4 9
1 //output
3
0 2 5
2 //output
Process finished with exit code 0
 */
