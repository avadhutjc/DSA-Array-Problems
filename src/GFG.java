// Java program to find sum of absolutre
// differences in all pairs in a sorted
// array of distinct numbers
class GFG {

    // Function to calculate sum of absolute
    // difference of all pairs in array
    // arr[] --> array of elements
    static int sumPairs(int arr[], int n) {

        // final result
        int sum = 0;
        for (int i = n - 1; i >= 0; i--)
            sum += i * arr[i] - (n - 1 - i)
                    * arr[i];

        return sum;
    }

    // Driver program
    public static void main(String arg[]) {
        int arr[] = {1,5,2};
        int n = arr.length;

        System.out.print(sumPairs(arr, n));
    }
}

// This code is contributed by Anant Agarwal.
