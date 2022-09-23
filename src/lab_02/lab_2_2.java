package lab_02;

import java.util.Scanner;

public class lab_2_2 {

    public static void main(String[] args) {
        System.out.printf("Plz input an integer number: \n");
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        System.out.printf("%d", input_number);
        // assumption: even 0, 2,4,6 odd 1,3,5
        if (input_number % 2 == 0) {
            System.out.print(" is an even number!");
        } else {
            System.out.print(" is an odd number!");
        }
    }
}
