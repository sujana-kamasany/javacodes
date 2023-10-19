/*
 * What is Knapsack Problem?
 * => There are two most common variations of the knapsack problem:
 *      - 1. Fractional Knapsack
 *           you can take fraction of an item
 *      - 2. 0/1 Knapsack
 *           you have only two options: either take an item(1) or leave an item(0)
 
 * => Problem Statement:
 *  - You are given a set of items(each with a weight and a value) and a knapsack with a maximum weight capacity.
 *  - The goal is to determine the maximum profit, you can obtain by selecting a subset of the items to put in the knapsack, subject to the constraint that the total weight of the selected items does not exceed the knapsack's capacity.
 * 
 */

public class Knapsack {

    //knapsack takes three parameters: weight, vaue and capacity(constraint)
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;

        //dp is used to store intermediate results.
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {

                //checks if there are no items are left to be considered or knapsack has no capacity.
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } 
                //checks if the weight of current item is less or equal to current capacity
                else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                }
                //checks if the weight of current item is greater than current capacity
                else{
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;

        int maxVal = knapsack(weights, values, capacity);
        System.out.println("Maximum value: " + maxVal);
    }
}
