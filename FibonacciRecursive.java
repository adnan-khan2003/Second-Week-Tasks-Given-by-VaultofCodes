import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. n should be a non-negative integer.");
        } else {
            int result = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
