import java.util.Scanner;

public class StudentCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first no. for even : ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count = count + 1;

            }

        }
        System.out.println("Total even no. " +count);

      //  System.out.println("Enter second no. for divide by 5 : ");
      //  int m = scanner.nextInt();
        for (int j = 1; j <= n; j++) {
            if (j % 5 == 0) {
                count = count + 1;
            }
        }
        System.out.println("Total no. divide by 5 : " + count);

     //   System.out.println("Enter third no. for divide by 7 : ");
     //   int p = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                count = count + 1;
            }
        }
        System.out.println("Total no. divide by 7 : " + count);
    }
}
