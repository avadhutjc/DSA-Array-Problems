
import java.util.Scanner;
public class ArrayReverse {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Reverse array is : ");
            for (int i = arr.length - 1; i >= 0; --i) {
                System.out.print(arr[i] + " ");
            }
        }
}
/*
4
1 2 3 5
Reverse array is : 5 3 2 1
Process finished with exit code 0
 */