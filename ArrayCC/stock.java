import java.util.*;
public class stock {
    public static void main(String[] args) {
        int arr[] = { 10, 1, 5, 6, 3, 4 };
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int arr[]) {
        int maxPrice = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > maxPrice)maxPrice = arr[i]; minPrice = Integer.MAX_VALUE;
            if(arr[i] < minPrice)
            {
                minPrice = arr[i];
                // maxProfit = (maxProfit < maxPrice - minPrice)?(maxPrice - minPrice):maxProfit;\
                maxProfit = Math.max(maxProfit, maxPrice - minPrice);
            }
        }
        return maxProfit;
    }
    /*
     * 1. buy - sell
     * 2. [7, 1, 8, 3, 6, 4]
     * 3. max price = -INF;
     * 3. min price = +INF;
     * if max < a[i] --> update max, set min = 0;
     * if min > a[i] ---> update min, calculate max profit
     * 
     * 4. profit
     * 
     */
}