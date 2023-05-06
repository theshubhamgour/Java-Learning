import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = { 1, 2, 3, 4, 5 };
        int index = 0;

        try {
            System.out.print("Enter an index: ");
            index = scanner.nextInt();
            System.out.println("The number at index " + index + " is " + numbers[index]);
            String str = null;
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index");
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
