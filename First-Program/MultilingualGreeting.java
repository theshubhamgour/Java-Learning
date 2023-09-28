import java.util.Scanner;

public class MultilingualGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Read the user's name
        
        System.out.println("Select a language (1 for English, 2 for French, 3 for Spanish): ");
        int languageChoice = sc.nextInt();
        
        switch (languageChoice) {
            case 1:
                System.out.println("Hello, " + name + "!");
                break;
            case 2:
                System.out.println("Bonjour, " + name + "!");
                break;
            case 3:
                System.out.println("Hola, " + name + "!");
                break;
            default:
                System.out.println("Invalid language choice.");
        }
    }
}
