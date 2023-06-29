package sorting;
import java.util.*;

public class countingSort{
    public static int minOfArray(int arr[])
    {
        int min = Integer.MAX_VALUE;
        for(int num: arr)min = (min > num)?num:min;
        return min;
    }
    public static int maxOfArray(int arr[])
    {
        int max = Integer.MAX_VALUE;
        for(int num: arr)max = (max < num)?num:max;
        return max;
    }
    
    public static int[] frequ(int arr[], int min, int max)
    {
        int freq[] = new int[max - min + 1];
        int p = 0;
        for(int num : arr)
        {
            freq[num - min] += 1;
        }
        return freq;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,2,6,4,2,7};
        int min = minOfArray(arr);
        int max = maxOfArray(arr);
        int fre[] = frequ(arr, min, max);
        for(int i: fre)System.out.print(i + " ");

        
    }
}