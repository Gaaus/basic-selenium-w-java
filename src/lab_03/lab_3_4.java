package lab_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab_3_4 {
    public static void main(String[] args) {
        int[] intArr01 = {1,12,16,28,34};
        int[] intArr02 = {1,13,16,27,99};

        List<Integer> resultArr = new ArrayList<>();

        int point1;
        if (intArr01.length <= intArr02.length) {
            point1 = intArr01.length;
        } else {
            point1 = intArr02.length;
        }

        for (int i = 0; i < point1; i++) {
            if (intArr01[i] <= intArr02[i]) {
                resultArr.add(intArr01[i]);
                resultArr.add(intArr02[i]);
            } else {
                resultArr.add(intArr02[i]);
                resultArr.add(intArr01[i]);
            }
        }

        // if 2 origin arrays' length are not equal, add the rest sorted array to result
        if (intArr01.length < intArr02.length) {
            for (int k = point1; k < intArr02.length ; k++) resultArr.add(intArr02[k]);
        }
        if (intArr01.length > intArr02.length) {
            for (int k = point1; k < intArr01.length; k++) resultArr.add(intArr01[k]);
        }

        System.out.println("The 1st sorted integer array is: " + Arrays.toString(intArr01));
        System.out.println("The 2nd sorted integer array is: " + Arrays.toString(intArr02));
        System.out.print("Result of merging 2 sorted arrays is: ");
        System.out.println(resultArr);
    }
}
