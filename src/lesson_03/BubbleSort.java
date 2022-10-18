package lesson_03;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] myArr = {2, 2, 7, 13, 7, 6, 34, 99, 8, 11}; // ctrl + atl + L to format space after comma
        /*
         * unsortedPosition = myArr.length - 1
         * loop until unsortedPosition = 1 (ie: > 0) --> while
         * loop over each pairs of numbers in myArr that < unsortedPosition :
         *   if left > right (ie: myArr[i] > myArr[i+1]):
         *       tmp = left
         *       left = right
         *       right = tmp
         *       unsortedPosition--
         *
         *
         * */
        System.out.println("origin myArr is: " + Arrays.toString(myArr));

        int unsortedPosition = myArr.length - 1;
        int tmp;

        while (unsortedPosition > 0) {
            for (int idx = 0; idx < unsortedPosition; idx++) {
                if (myArr[idx] > myArr[idx + 1]) {
                    tmp = myArr[idx];
                    myArr[idx] = myArr[idx + 1];
                    myArr[idx + 1] = tmp;

                }

            }
            unsortedPosition--;
        }

        System.out.println("myArr is Sorted as: " + Arrays.toString(myArr));

//      If dont use variable tmp as a mid-point to deliver / switch numbers between Left & Right
//        int[] myArr1 = {2, 56, 2, 3, 1, 12, 12, 12, 4, 5, 6, 7, 7, 2, 4, 2, 1, 3334};
        int[] myArr1 = {2, 2, 7, 13, 7, 6, 34, 99, 8, 11};
        System.out.println();
        System.out.println("Origin myArr1 is: " + Arrays.toString(myArr1));

        int unsortedPosition1 = myArr1.length - 1;

        while (unsortedPosition1 > 0) {
            for (int idx = 0; idx < unsortedPosition1; idx++) {
                if (myArr1[idx] > myArr1[idx + 1]) {
                    myArr1[idx] = myArr1[idx] + myArr1[idx + 1];
                    myArr1[idx + 1] = myArr1[idx] - myArr1[idx + 1];
                    myArr1[idx] = myArr1[idx] - myArr1[idx + 1];
                }
            }
            unsortedPosition1--;
        }
        System.out.println("myArr1 is sorted as: " + Arrays.toString(myArr1));


    }
}
