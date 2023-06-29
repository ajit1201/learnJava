package sorting;

public class bubbleSort {
    public static void print(int arr[])
    {
        for(int i: arr)System.out.print(i + " ");
    }
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2};
        // for(int i = 0; i < arr.length; i++)
        // System.out.print(arr[i]);
        // bubble(arr);
        insertionSort(arr);
    }

    private static void bubble(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < n - 1 - i;j++)
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        
    }

    private static void insertionSort(int arr[])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }
}
