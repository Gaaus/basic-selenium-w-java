package lab_03;

import java.util.Arrays;

public class lab_3_2 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
//        int[] intArr = {1,1,1,1,5,8,-1,3};
        int minNum = intArr[0];
        int maxNum = intArr[0];
        for (int idx = 0; idx <= intArr.length -1; idx++) {
            if (idx == 0) {
                continue;
            } else {
                if (intArr[idx] < minNum) {
                    minNum = intArr[idx];
                }
                if (intArr[idx] > maxNum) {
                    maxNum = intArr[idx];
                }
            }

        }
        System.out.printf("Array is: \n", Arrays.toString(intArr));
        System.out.printf("Min integer number is: %d\n", minNum);
        System.out.printf("Max integer number is: %d\n", maxNum);
    }
}
