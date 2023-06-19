package pattern;

public class Ptrn {
    public static void main(String arg[])
    {
        // floydTriangle(5);
        zeroOneTri(5);
    }

    public static void floydTriangle(int n)
    {
        int counter = 1; 
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }

    public static void zeroOneTri(int n)
    {
    /*    int counter = 1; 
        for(int i = 1; i <= n; i++)
        {
            if(i%2 == 0)counter = 0;
            else counter = 1;

            for(int j = 1; j <= i; j++)
            {
                System.out.print(counter + " ");
                if(counter == 1)counter = 0; 
                else counter = 1; 
            }
            System.out.println();
        }
    */
    /*
     * for (int i = 0; i <= n; i++) {
    int value = (i % 2 == 0) ? 1 : 0;
    for (int j = 0; j <= i; j++) {
        System.out.print(value + " ");
        value = 1 - value; // Alternate between 0 and 1
    }
    System.out.println();
}

     */
    // better approach
        for (int i = 0; i <= n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                if((i + j)%2 == 0)System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
