import java.util.Scanner;

public class StockMarket {
    public static int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0) {
            return 0;
        }

        // If k is large enough, we can make as many transactions as we want (greedy approach)
        if (k >= n / 2) {
            int maxProfit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }
            return maxProfit;
        }

        // DP approach
        // dp[t][i] = maximum profit using at most t transactions up to day i
        int[][] dp = new int[k + 1][n];
        
        for (int t = 1; t <= k; t++) {
            int maxDiff = -prices[0]; 
            for (int i = 1; i < n; i++) {
                // Either we do not make a transaction on day i (dp[t][i - 1])
                // or we sell on day i (prices[i] + maxDiff).
                dp[t][i] = Math.max(dp[t][i - 1], prices[i] + maxDiff);
                // Update maxDiff = max of itself or the scenario of
                // (dp[t - 1][i] - prices[i]) which means: profit if we "bought" on day i
                maxDiff = Math.max(maxDiff, dp[t - 1][i] - prices[i]);
            }
        }

        // The answer is the profit with k transactions on the last day
        return dp[k][n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read k (max number of transactions)
        int k = Integer.parseInt(scanner.nextLine().trim());

        // Read prices array
        String[] parts = scanner.nextLine().trim().split(" ");
        int[] prices = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            prices[i] = Integer.parseInt(parts[i]);
        }

        // Compute and print the result
        System.out.println(maxProfit(k, prices));

        scanner.close();
    }
}