import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // print the numbers in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // print the stars in the current row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // move to the next line
        }
    }
}
