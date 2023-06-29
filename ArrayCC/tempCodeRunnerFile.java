int maxPrice = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > maxPrice)maxPrice = arr[i]; minPrice = Integer.MAX_VALUE;
            if(arr[i] < minPrice)
            {
                minPrice = arr[i];
                maxProfit = (maxProfit < maxPrice - minPrice)?(maxPrice - minPrice):maxProfit;
            }
        }
        return maxProfit;