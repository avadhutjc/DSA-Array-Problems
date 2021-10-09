import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DetectPalindromeII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int z = 0; z < t; z++) {
            int N = scanner.nextInt();
            scanner.nextLine();
            String str = scanner.nextLine();
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                if (hashMap.containsKey(str.charAt(i))) {
                    int counter = hashMap.get(str.charAt(i));
                    hashMap.put(str.charAt(i), (counter + 1));
                } else
                    hashMap.put(str.charAt(i), 1);
            }
            int counter = 0;
            for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
                if (map.getValue() % 2 != 0)
                    counter = counter + 1;
                if (counter > 1)
                    break;
            }
            if (counter > 1)
                System.out.println("Not Possible!");
            else
                System.out.println("Possible!");
        }
    }
}

/*
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DetectPalindromeII {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for ( int t = 0 ; t < t ; t++ ){
            int N = scanner.nextInt();
            scanner.nextLine();
            String str = scanner.nextLine();
            HashMap<Character,Integer> hashMap = new HashMap<>();
            for ( int i = 0 ; i < str.length() ; i++ ){
                if ( hashMap.containsKey( str.charAt(i) ) ){
                    int counter = hashMap.get( str.charAt(i) );
                    hashMap.put( str.charAt(i) , (counter+1) );
                }
                else
                    hashMap.put( str.charAt(i) , 1 );
            }
            int counter = 0;
            for ( Map.Entry<Character,Integer> map : hashMap.entrySet() ){
                if ( map.getValue() % 2 != 0 )
                    counter++;
                if ( counter > 1)
                    break;
            }
            if ( counter > 1 )
                System.out.println("Not Possible!");
            else
                System.out.println("Possible!");
        }
    }
}

 */