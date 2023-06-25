package ArrayCC;

public class sumofsubA {
   /* public static  int maxSumS(int arr[])
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
*/
    public static int prfArr(int arr[])
    {
        int curSum = 0;
        int sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        for(int i = 1; i < arr.length; i++)
        {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++)
        {
            int start = i;
            int end; 

            for(int j = i; j < arr.length; j++)
            {
                end = j;
                curSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
            }
            sum = (sum < curSum) ? curSum:sum;
        }
        return sum;
        
    }
 
    public static int Kadens(int arr[])
    {
        int CS = 0; 
        int MS = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            CS += arr[i];
            CS = (CS < 0)? 0: CS;
            MS = Math.max(CS, MS);
        }
        
        return MS;
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        // System.out.println(maxSumS(arr));
        System.out.println(prfArr(arr));
        System.out.println(Kadens(arr));
        
    }
}
