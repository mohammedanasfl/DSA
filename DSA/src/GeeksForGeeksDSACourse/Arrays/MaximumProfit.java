package GeeksForGeeksDSACourse.Arrays;

public class MaximumProfit {
    public static void main(String[] args) {
        int [] prices={7, 10, 1, 3, 6, 9, 2};

        int min=prices[0];
        int profit=0,cost=0;

        for(int i=1;i< prices.length;i++){
            cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(prices[i],min);
        }
        System.out.println(profit);
    }
}
