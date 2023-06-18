package question;

public class series1 {
    public static void main(String[] args) {
        int n = 10;
        while(n > 1)
        {
            if(n % 2 == 0)n *= 4;
            else n = (n*3 + 1);
            System.out.print(n + " ");
        }
    }
    
}
