import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of integers: ");
        String line = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(line);

        int sum = 0;
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            int num = Integer.parseInt(token);
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println();
        System.out.println("Sum of all integers: " + sum);
    }
}
