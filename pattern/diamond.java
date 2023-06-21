package pattern;

public class diamond {
    public static void main(String[] args) {
        dia(5);
    }

    public static void dia(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces before *
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for * in line
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--)
        {
            // for spaces before *
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for * in line
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

