/*
Objective
In this challenge, we learn about conditional statements. Check out the Tutorial tab for learning materials and an instructional video.
Task
Given an integer, , perform the following conditional actions:
If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
Input Format
A single line containing a positive integer, .
Constraints
Output Format
Print Weird if the number is weird; otherwise, print Not Weird.
Sample Input 0
3
Sample Output 0
Weird
Sample Input 1
24
Sample Output 1
Not Weird
Explanation
Sample Case 0: n=3
n is odd and odd numbers are weird, so we print Weird.
Sample Case 1: n=24
n>20 and n is even, so it is not weird. Thus, we print Not Weird.
 */
import java.util.*;
public class Conditional {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            if (n % 2 == 0)
            {
                if (n >= 2 && n <= 5)
                {
                    System.out.println("Not Weird");
                }

                 else if (n >= 6 && n <= 20) {
                    System.out.println("Weird");
                }
                else
                {
                    System.out.println("Not Weird");
                }
            }
            else
            {
                System.out.println("Weird");
            }

        }
}
/*
Output :
24
Not Weird

Process finished with exit code 0
 */