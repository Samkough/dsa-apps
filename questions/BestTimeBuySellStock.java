/*
Say you have an array for which the ith element
is the price of a given stock on day i.

If you were only permitted to complete at most one
transaction (i.e., buy one and sell one share of the stock),
design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.
*/
public class BestTimeBuySellStock {
    public static int bfMaxProfit(int[] prices) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    temp = prices[j] - prices[i];
                    if (temp > max) {
                        max = temp;
                    }
                }
            }
        }
        return max;
    }

    public static int eMaxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }

        return max;
    }

    public static void main (String args[]) {
        int[] arr1 = new int[]{7,1,5,3,6,4};
        System.out.println("[7, 1, 5, 3, 6, 4]: " + bfMaxProfit(arr1)); // 5
        int[] arr2 = new int[]{7,6,4,3,7,3,1,4,7,1};
        System.out.println("[7, 6, 4, 3, 7, 3, 1, 4, 7, 1]: " + bfMaxProfit(arr2)); // 6
    }
}