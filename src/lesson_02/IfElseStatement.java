package lesson_02;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        // A hen B, toi dung goi thi Let's talk, khac gio thi Write a letter

        final int EXPECTED_TIME = 7;


        // Cho nhap arrival time dynamic --> Scanner
        // (listen from keyboard: (System.in)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Plz input arrival time: ");
        int arrivalTime = scanner.nextInt(); // dynamic arrivalTime = user input an integer

        boolean areTheyOnTime = arrivalTime == EXPECTED_TIME;

        // ternary operator: la cach viet gon cho 1 ve if () {} else
        // boolean areTheyOnTime = arrivalTime == EXPECTED_TIME ? true:false;

        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay toi quan");

        if (areTheyOnTime){
            System.out.println(" ---> Let's Talk!");
        } else {
            System.out.println(" ---> Write a letter!");
        }

        System.out.println("3. Dat xe ra");
        System.out.println("4. Chay xe ve");

    }
}
