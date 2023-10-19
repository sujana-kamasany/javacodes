/*
 * What is Coin Change Problem?
 * - We find the number of ways to make change for a specific amount of money using a given set of coin   denominations.
 * 
 * - Given : (Denominations) and (Amount to Generate)
 */

public class CoinChange {

    public static int coinChangeWays(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // There is one way to make change for 0.

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; // Coin Denominations
        int amount = 5; // Amount to make

        int ways = coinChangeWays(coins, amount);
        System.out.println("Number of ways to make change: " + ways);
    }
}
