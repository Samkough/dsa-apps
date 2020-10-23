package questions;

/*
Given a non-negative integer num, return the number of steps to reduce it to zero.
If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
*/
public class NumberStepsReduceNumberZero {
    // Time Complexity: Between O(n) and O(n/2)
    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        int num = 14;
        System.out.println("It takes " + numberOfSteps(num) + " steps for " + num + ".");
        num = 25;
        System.out.println("It takes " + numberOfSteps(num) + " steps for " + num + ".");
    }
}