/*
Given a value n, if we want to make
change for n cents, and we have
infinite supply of each of
C = { C1, C2, .. , Cm} valued coins,
what is the minimum number of coins
to make the change?
*/
public class ReturnMinimumCoins {
    public static int returnMinimumUSCoins(int n) {
        int coins = 0;
        while (n > 0) {
            if (n >= 25) {
                coins++;
                n -= 25;
            } else if (n < 25 && n >= 10) {
                coins++;
                n -= 10;
            } else if (n < 10 && n >= 5) {
                coins++;
                n -= 5;
            } else if (n < 5 && n >= 1) {
                coins++;
                n -= 1;
            }
        }

        return coins;
    }

    public static void main(String[] args) {
        System.out.println(returnMinimumUSCoins(16));
        System.out.println(returnMinimumUSCoins(34));
        System.out.println(returnMinimumUSCoins(78));
    }
}