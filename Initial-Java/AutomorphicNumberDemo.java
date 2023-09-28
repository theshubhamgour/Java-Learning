import java.util.Scanner;

public class AutomorphicNumberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;

        boolean isAutomorphic = true;

        while (number != 0) {
            int digit1 = number % 10;
            int digit2 = square % 10;

            if (digit1 != digit2) {
                isAutomorphic = false;
                break;
            }

            number /= 10;
            square /= 10;
        }

        if (isAutomorphic) {
            System.out.println(number + " is an Automorphic Number");
        } else {
            System.out.println(number + " is not an Automorphic Number");
        }
    }
}
