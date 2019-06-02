// Cracking the Coding Interview: Chapter 6 - Big O

public class BigO {
    public static void runtimes(){
        // O(s) - size of file

        // O(1) - constant time

        // O(n) - ???

        // O(n^2) - ???

        // O(2^n) - ???

        // O(log n) - ???

        // O(n log n) - ???
    }

    // Example 1
    public static void foo(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }

        System.out.println(sum + ", " + product);
    }

    // Example 2
    public static void printPairs(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        } 
    }

    public static void main(String args[]) {
        runtimes();

        // declarations/instantiations
        int[] arr1 = new int[]{4, 2, 8, 5, 3};

        /* Examples - Page 46 */
        // Example 1 - Page 46: What is the runtime?
        System.out.println("----- Example 1 -----");
        foo(arr1);
        System.out.println("----- end of Example 1 -----\n");
        // O(N) time - Iterating twice is O(2N), drop the constant, it's O(N)
        // Adding and multiplying doesn't make a difference in the for loop

        // Example 2 - Page 46: What is the runtime?
        System.out.println("----- Example 2 -----");
        printPairs(arr1);
        System.out.println("----- end of Example 2 -----\n");
        // O(N^2) - Inner loop is called O(N) times which in turn is N * N = N^2
        // It's printing all pairs which is N^2, so the runtime is O(N^2)
    }
}