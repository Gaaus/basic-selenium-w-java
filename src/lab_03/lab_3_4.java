package lab_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab_3_4 {
    public static void main(String[] args) {
        int[] intArr01 = {1,12,12,16,28,34};
        int[] intArr02 = {1,13,16,27,99};

        // pointer ind for arr1, arr2, mergedArr.
        // while pointer 1 < arr1 length && pointer 2 < arr2 length
        //      compare and pick small number, increase idx of arr has the picked small number

        int lengthArr01 = intArr01.length;
        int lengthArr02 = intArr02.length;
        int[] mergedArr = new int[lengthArr01 + lengthArr02];

        int pointer1, pointer2, pointer3;
        pointer1 = pointer2 = pointer3 = 0;

        while (pointer1 < lengthArr01 && pointer2 < lengthArr02) {
            if (intArr01[pointer1] <= intArr02[pointer2]) {
                mergedArr[pointer3] = intArr01[pointer1];
                pointer1++;
            } else {
                mergedArr[pointer3] = intArr02[pointer2];
                pointer2++;
            }
            pointer3++;

        }

        if (pointer1 < lengthArr01) {
            for (int idx = pointer1; idx < lengthArr01 ; idx++) {
                mergedArr[pointer3] = intArr01[idx];
                pointer3++;
            }

        }

        if (pointer2 < lengthArr02) {
            for (int idx = pointer2; idx < lengthArr02 ; idx++) {
                mergedArr[pointer3] = intArr02[idx];
                pointer3++;
            }

        }

        System.out.println("Arr1 is: " + Arrays.toString(intArr01));
        System.out.println("Arr2 is: " + Arrays.toString(intArr02));
        System.out.println();
        System.out.println("Merged array from the 2 sorted arrays is: " + Arrays.toString(mergedArr));



//      Wrong output when arr1 has duplicated number that less than arr2. see above
//        List<Integer> resultArr = new ArrayList<>();
//
//        int point1;
//        if (intArr01.length <= intArr02.length) {
//            point1 = intArr01.length;
//        } else {
//            point1 = intArr02.length;
//        }
//
//        for (int i = 0; i < point1; i++) {
//            if (intArr01[i] <= intArr02[i]) {
//                resultArr.add(intArr01[i]);
//                resultArr.add(intArr02[i]);
//            } else {
//                resultArr.add(intArr02[i]);
//                resultArr.add(intArr01[i]);
//            }
//        }
//
//        // if 2 origin arrays' length are not equal, add the rest sorted array to result
//        if (intArr01.length < intArr02.length) {
//            for (int k = point1; k < intArr02.length ; k++) resultArr.add(intArr02[k]);
//        }
//        if (intArr01.length > intArr02.length) {
//            for (int k = point1; k < intArr01.length; k++) resultArr.add(intArr01[k]);
//        }
//
//        System.out.println("The 1st sorted integer array is: " + Arrays.toString(intArr01));
//        System.out.println("The 2nd sorted integer array is: " + Arrays.toString(intArr02));
//        System.out.print("Result of merging 2 sorted arrays is: ");
//        System.out.println(resultArr);
    }
}
