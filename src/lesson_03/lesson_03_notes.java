package lesson_03;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class lesson_03_notes {

    public static void main(String[] args) {
        // vong lap for
//        for (initial value : condition : change condition trigger) {
//
//        }

        // khai bao 1 array, khai bao length
        final int ARR_LENGTH = 5;
        int[] myIntArr = new int[ARR_LENGTH];
        // by default, int[] se duoc assign default value of its data type. int -> default value = 0
        // int[].sout --< [0,0,0,0,0]

        for (int idx = 0; idx < ARR_LENGTH; idx++) {
            System.out.println("plz input value of arr: ");
            Scanner scanner = new Scanner(System.in);
            myIntArr[idx] = scanner.nextInt();
        }

//        System.out.println("myIntArr is: " + myIntArr); // --> this will print out the position of mem to store myIntArr, not print out value of myIntArr
        System.out.println("Array is: " + Arrays.toString(myIntArr));



        for (int value : myIntArr) {
            System.out.println("Each value of myIntArr is: ");
            System.out.println(value);
        }
        // declare and fill data
        int[] myIntArr1 = new int[] {1,3456,4,6,7,2,8};
        // int hoac 'a' --> ma~ ASCII cua ky' tu a. a = 97, A = 97 - 32 = 65

        // for & while: use for loop when know when to stop, while loop when leave stop trigger to the user

        // Example for mini game "Generate a random Number" - Use whileloop for easier/shorter codes

        boolean isContinuing = true;

        while(isContinuing){
            System.out.println("===MINI GAME - GENERATE RANDOM Number from 0 to a customized integer number===");
            System.out.println("Menu: ");
            System.out.println("1. Generate random number");
            System.out.println("0. Exit game!!!");

            System.out.print("Please input option: \n");
            Scanner scanner = new Scanner(System.in);
            int scPlay = scanner.nextInt();

            if (scPlay == 0) {
                System.out.println("Goodbye...");
                isContinuing = false;

            } else if (scPlay == 1) {

                System.out.print("Plz input maximum integer number: \n");
                Scanner scannerMaxi = new Scanner(System.in);
                int scMaxiInt = scannerMaxi.nextInt();

                int randomNumber = new SecureRandom().nextInt(scMaxiInt);
                System.out.printf("Random number is: %d\n",randomNumber);


            } else {

                System.out.println("Wrong input, please re-input...!!!!!!!!!!!!!!");

            }
        }
        // loop follow control keywords: continue, break
    }
}

