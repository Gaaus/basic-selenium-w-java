package lab_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab_3_3 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};

        int minNum, minIdx, tmpArrLength;


        List<Integer> sortedArr = new ArrayList<>();
        List<Integer> tmpArr = new ArrayList<>();

        tmpArrLength = intArr.length;

        // clone intArr to a tmpArr (ArrayList, to use .add)
        for (int i = 0; i < tmpArrLength ; i++) {
            tmpArr.add(intArr[i]);
        }
//        System.out.println(tmpArr);

        while (tmpArrLength > 1) {
            minNum = tmpArr.get(0);
            minIdx = 0;

            for (int i = 0; i < tmpArrLength; i++) {
                if (i == 0) {
                    continue;
                }
                else {
                    if (tmpArr.get(i) <= minNum) {
                        minNum = tmpArr.get(i);
                        minIdx = i;
                    } else continue;
                }
            }

            sortedArr.add(minNum);
//            System.out.println(sortedArr);

            tmpArr.remove(minIdx);
//            System.out.println(tmpArr);
            tmpArrLength--;

        }
        sortedArr.add(tmpArr.get(0));

        System.out.println("The origin / input integer array is: " + Arrays.toString(intArr));
        System.out.println("The sorted array is: " + sortedArr);


    }
}
