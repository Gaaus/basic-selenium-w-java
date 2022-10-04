package lab_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab_3_3 {
    public static void main(String[] args) {
//        int[] originArr = {12,34,1,16,28};
//        Arrays.sort(originArr);
//        System.out.println(Arrays.toString(originArr));
        int[] originArr = {12,34,1,16,28};
        List<Integer> resultArr = new ArrayList<>();
        List<Integer> restArr = new ArrayList<>();

//        int pickedNum = originArr[0];
        int lookupNum = originArr[0];
        for (int idx = 0; idx <= originArr.length - 1; idx++) {
            if (idx == 0) {
                lookupNum = originArr[idx];
                continue;
            } else {
                if (originArr[idx] < lookupNum) lookupNum = originArr[idx];
                else continue;
            }
        }
        resultArr.add(lookupNum);

        for (int value:originArr) {
            if (value != lookupNum) {
                restArr.add(value);
            } else continue;
        }
        System.out.println(restArr);

        for (int idx = 0; idx <= restArr.toArray().length - 1; idx++) {
            if (idx == 0) {
                lookupNum = restArr.indexOf(idx);
            } else {
                if (restArr.indexOf(idx) < lookupNum) lookupNum = restArr.indexOf(idx);
                else continue;
            }
        }
        resultArr.add(lookupNum);

        for (int value:restArr) {
            if (value != lookupNum) {
                restArr.add(value);
            } else continue;
        }





    }
}
