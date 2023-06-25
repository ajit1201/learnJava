package ArrayCC;

public class sumofsubA {
    public static  int maxSumS(int arr[])
    {
        int maxSum = Integer.MIN_VALUE;
        int curMax = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            //for loop to find subset it gives subset
            for(int j = i + 1; j < arr.length; j++)
            {
                for(int k = i; k <= j; k++)
                {
                    System.out.print(arr[k] +" ");
                }
                // iterating through that subset
                System.out.println();
                for(int k = i; k <= j; k++)
                {
                    //calculating sum of perticular subarray by iterating through it
                    System.out.println("-------->"+ arr[j]+ "[" + j +", "+ i + "]");
                    curMax += arr[k];
                }
                System.out.println("-------->"+ curMax);
                //comparing of current sum if greater than max sum
                if(curMax > maxSum)maxSum = curMax;
                //reset current sum to zero for next iteration
                curMax = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, -10, 10};
        System.out.println(maxSumS(arr));
    }
}
