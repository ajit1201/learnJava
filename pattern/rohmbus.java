package pattern;

public class rohmbus {
    public static void main(String[] args) {
        roh(5);
        emroh(5);
    }

    private static void roh(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("* * * *");
            System.out.println();
        }
    }

    private static void emroh(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
                
            if (i == 1 || i == n)
                System.out.println("****");
            else {
                System.out.print("*");

                for (int j = 1; j <= n - 2; j++)System.out.print(" ");
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
