public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10; // Change this to generate more or fewer terms
        int[] fib = new int[n];

        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        System.out.println("The first " + n + " terms of the Fibonacci sequence are:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
