package ArrayCC;
//all sub arrays
public class aSA {
    public static void subarray(int arr[])
    {
        int counter = 1;
        for(int i = 0; i < arr.length - 1; i++)
        {
            int start = i;
            // finding subset 
            for(int j = i + 1; j < arr.length; j++)
            {
                int end = j;
                //printing subset
                for(int k = i; k <= j; k++)
                {
                    System.out.print(arr[k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        subarray(arr);
    }
}
