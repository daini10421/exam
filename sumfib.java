
public class sumfib {

    public static void main(String[] args) {
   
        int n = 10;
        int sum = 0;
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Sum of first " + n + " Fibonacci numbers is: " + sum);
    }
}

