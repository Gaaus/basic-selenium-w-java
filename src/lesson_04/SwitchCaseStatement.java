package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        System.out.print("Plz input a number! ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1: {
                System.out.println("Giai nhat!");
                System.out.println("Chuc mung ban!!!");
                break;
            }
//            If case 2 no break;, then input 2 or 3 will always print out "Giai Nhi!" and Giai ba
            case 2: {
                System.out.println("Giai nhi!");
            }
            case 3: {
                System.out.println("Giai ba");
                break;
            }
            case 4: {
                System.out.println("Nhap lui roi Teo oi!");
            }
        }
    }
}
