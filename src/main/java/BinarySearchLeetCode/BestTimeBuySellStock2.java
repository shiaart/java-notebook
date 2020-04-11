package BinarySearchLeetCode;

public class BestTimeBuySellStock2 {
    public static void main(String[] args) {
        int[] array = new int[]{7, 1, 5, 3, 6, 4};
        int result = maxProfit(array);
    }

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
