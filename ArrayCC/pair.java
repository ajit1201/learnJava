package ArrayCC;

public class pair {
    public static void pair(int arr[])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                System.out.print("(" + arr[i] + ", " + arr[j] + "), ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        pair(new int[]{1,2,3,4,5});
    }
}
