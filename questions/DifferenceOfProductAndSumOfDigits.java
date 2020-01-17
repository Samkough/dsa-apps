public class DifferenceOfProductAndSumOfDigits {
    // O(n)
    public static int differenceOfProductAndSumDigits(int n) {
        String s = Integer.toString(n);
        int product = 1;
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            product *= Character.getNumericValue(s.charAt(i));
            sum += Character.getNumericValue(s.charAt(i));
        }
    
        return product - sum;
    }

    public static void main (String args[]) {
        int num = 8328;
        System.out.println(num + ": " + differenceOfProductAndSumDigits(num));
    }
}