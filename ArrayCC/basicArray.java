package ArrayCC;

public class basicArray {

    public static void increamentOne(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 1;
        }
    }

    public static void prime(int n)
    {
        while (n >= 0)
        {
            
        }
    }
    public static void main(String[] args) {
        //block one - passing in funtion
    {
        int arr[] = new int[10];
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        increamentOne(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //block two - returnin an array by function
    //prime number upto n
    
    }

}
