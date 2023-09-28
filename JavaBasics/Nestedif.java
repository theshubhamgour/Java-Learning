package JavaBasics;

import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=20){
            System.out.println("It is greater than 20");
        }else{
            System.out.println("It is small than 20");
        }
    }
}
