package lab_03;

import java.util.Scanner;

public class lab_3_1 {

    public static void main(String[] args) {
//        final int ARR_LENGTH = 5;
//        int[] intArr = new int[ARR_LENGTH];
//        intArr[0] = 1;
//        intArr[1] = 2;
//        intArr[2] = 3;
//        intArr[3] = 4;
//        intArr[4] = 5;
        System.out.print("Please input length of an integer array: ");
        Scanner scanner_arr_length = new Scanner(System.in);
        final int ARR_LENGTH = scanner_arr_length.nextInt();
        int[] intArr = new int[ARR_LENGTH];
        for (int i = 0; i < ARR_LENGTH; i++) {
            System.out.print("Plz input the integer number of the array: \n");
            Scanner scanner_number = new Scanner(System.in);
            intArr[i] = scanner_number.nextInt();
        }

        int cnt_even = 0;
        int cnt_odd = 0;

        for (int index = 0; index < ARR_LENGTH; index++) {
            if (intArr[index] % 2 == 0 ) {
                cnt_even++;
            } else {
                cnt_odd++;
            }

        }
        System.out.printf("Even numbers: %d\n",cnt_even);
        System.out.printf("Odd numbers: %d\n",cnt_odd);


    }
}
