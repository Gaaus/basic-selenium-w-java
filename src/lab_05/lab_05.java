package lab_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_05 {
    // public: service
    public static void main(String[] args) {

        boolean isContinuing = true;


        while (isContinuing) {
            printMenu();
            int userOption = getUserOption(); // int userOption = scanner.nextInt();
            List<Integer> intArr = new ArrayList<>();

            switch (userOption) {
                case 0: {
                    isContinuing = false;
                    break;
                }
                case 1: {
                    intArr = addNumberToArrayList(intArr);
                    break;
                }
                case 2: {
                    printNumbers(intArr);
                    break;
                }
                case 3: {
                    getMaximumNum(intArr);
                    break;
                }
                case 4: {
                    getMinimumNum(intArr);
                    break;
                }
                case 5: {
                    searchANumber(intArr);
                    break;
                }
                default: {
                    System.out.println("Nhap lui roi Teo oi!");
                    break;
                }
            }
        }

    }


    // private --> support method

    private static void printMenu() {
        System.out.println("==== MENU ====");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("0. Quit game!");
    }
    private static int getUserOption() {
        System.out.print("Please input a option number: ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static List<Integer> addNumberToArrayList(List<Integer> intArr) {
        System.out.print("Please input an integer number to be added: ");

        Scanner scanner = new Scanner(System.in);
        intArr.add(scanner.nextInt());
        System.out.println(intArr);
        return intArr;
    }

    private static void printNumbers(List<Integer> intArr) {
        System.out.print("Numbers in ArrayList are: " + intArr);

//        return intArr;
    }

    private static int getMaximumNum(List<Integer> intArr) {

        int maxNum = intArr.get(0);
        for (int i = 0; i < intArr.size(); i++) {
            if (i == 0) continue;
            else {
                if (intArr.get(i) >= maxNum) maxNum = intArr.get(i);
                else continue;
            }
        }

        System.out.print("Maximum Number in ArrayList is: ");
        return maxNum;
    }
    private static int getMinimumNum(List<Integer> intArr) {

        int minNum = intArr.get(0);
        for (int i = 0; i < intArr.size(); i++) {
            if (i == 0) continue;
            else {
                if (intArr.get(i) <= minNum) minNum = intArr.get(i);
                else continue;
            }
        }

        System.out.print("Minimum Number in ArrayList is: ");
        return minNum;


    }

    private static int searchANumber(List<Integer> intArr) {
        System.out.print("Please input searching number: ");
        Scanner scanner = new Scanner(System.in);
        int searchNum = scanner.nextInt();
        int idxFound = Integer.MAX_VALUE;

        for (int i = 0; i < intArr.size(); i++) {
            if (intArr.get(i) == searchNum) {
                idxFound = i;
                System.out.print("Index of searching number in ArrayList is: ");
            } else System.out.print("Number could not be found: ");
        }
        return idxFound;
    }
}
