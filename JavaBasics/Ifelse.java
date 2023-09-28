package JavaBasics;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you tired? : true or false");
        boolean tired = sc.nextBoolean();
        if (tired) {
            System.out.println("I am Sleepy");
        } else {
            System.out.println("Let's work");
        }
    }
}
