import java.util.Scanner;
public class FindSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {

            for (int j = i + 1; j <= word.length(); j++) {
                String Substring = word.substring(i, j);

                if (Substring.charAt(0)==Substring.charAt(Substring.length() - 1)) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}