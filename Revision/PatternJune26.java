package Revision;

public class PatternJune26 {
    public static void sixEdgeStar()
    {
        {
            /*
            * *
           * * * 
     * * * * * * * * * 
       * * * * * * * 
         * * * * * 
       * * * * * * * 
     * * * * * * * * *
           * * *
            * *             
             */
            int n = 3; 
            int m = 2*n + 1;
            for(int i = 1; i <= n; i++)
            {
                //print spaces to align star in center
                for(int j = 1; j <= m + 1 - i; j++)System.out.print(" ");
                //Print stars for upper triangle
                for(int j = 1; j <= i; j++)System.out.print("* ");
                System.out.println();
            }
            
            for(int i = 1; i <= n; i++)
            {
                for(int j = 0; j <= i - 1; j++)System.out.print(" ");
                for(int j = 0; j <= m + 2 - 2*i; j++)System.out.print("* ");
                System.out.println();
            }
            
            for(int i = n - 1; i >= 1; i--)
            {
                for(int j = 0; j <= i - 1; j++)System.out.print(" ");
                for(int j = 0; j <= m + 2 - 2*i; j++)System.out.print("* ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        sixEdgeStar();
    }
}
