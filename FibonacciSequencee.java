public class FibonacciSequencee {
    public static void main(String[] args) {
        int n = 10; // Change this to calculate a different value of the sequence
        int fib;

        // Non-recursive function to calculate the nth value of the sequence
        fib = fibNonRecursive(n);
        System.out.println("The " + n + "th value of the Fibonacci sequence is (non-recursive): " + fib);

        // Recursive function to calculate the nth value of the sequence
        fib = fibRecursive(n);
        System.out.println("The " + n + "th value of the Fibonacci sequence is (recursive): " + fib);
    }

    // Non-recursive function to calculate the nth value of the Fibonacci sequence
    public static int fibNonRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }

    // Recursive function to calculate the nth value of the Fibonacci sequence
    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibRecursive(n-1) + fibRecursive(n-2);
    }
}
