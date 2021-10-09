import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        //int present = A[4];
        for (int j = 0; j <= N; j++){        // [12, 14, 15, 42]
            if (A[j] == 42) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            break;
        }
    }
}

/*
import java.util.Scanner;
public class Smallest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        for (int j = 0; j <= N; j++){
            if (A[j] == 42) {
                System.out.println("Yes");
                break;
            }else {
                System.out.println("No");
                break;
            }
        }
    }
}

 */