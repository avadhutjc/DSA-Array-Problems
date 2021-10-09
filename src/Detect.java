import java.util.Scanner;

public class Detect {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // int n = scanner.nextInt(); //for int only
            String str1 = scanner.next();  //for both int and string
            //String str1 = "";  //String str = n+"";
            String rev = "";
            for(int i = str1.length()-1; i >= 0; i--){
                rev = rev + str1.charAt(i);
            }
            if(str1.equals(rev)){
                System.out.println("Yes");
            }else
                System.out.println("No");

        }
}

/*
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String d = sc.nextLine();
    int n = sc.nextInt();
    int m = 0;
    switch(d){
      case "Monday":
        m = 0;
        break;
      case "Tuesday":
        m = 1;
        break;
      case "Wednesday":
        m = 2;
        break;
      case "Thursday":
        m = 3;
        break;
      case "Friday":
        m = 4;
        break;
      case "Saturday":
        m = 5;
        break;
      case "Sunday":
        m = 6;
        break;
    }
    n = n+m;
    while (n > 7)
      n = n%7;
    switch(n){
      case 0:
        System.out.println("Monday");
        break;
      case 1:
        System.out.println("Tuesday");
        break;
      case 2:
        System.out.println("Wednesday");
        break;
      case 3:
        System.out.println("Thursday");
        break;
      case 4:
        System.out.println("Friday");
        break;
      case 5:
        System.out.println("Saturday");
        break;
      case 6:
        System.out.println("Sunday");
        break;
    }
  }
}
 */