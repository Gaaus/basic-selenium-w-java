package lab_03;

import java.util.Arrays;

public class lab_3_4_Merge2SortedArrays {

    public static void main(String[] args) {
        int[] intArr1 = {1, 12, 13, 16, 28, 34};
        int[] intArr2 = {1, 14, 16, 27, 99, 99};
        int[] mergedArr = merge(intArr1, intArr2);

        System.out.println("Merged 2 Sorted Arrays is: " + Arrays.toString(mergedArr));
    }

    private static int[] merge(int[] intArr1, int[] intArr2) {

        /*
        * while point1 < lengthArr1 && point2 < lengthArr2,
        *   if arr1[point1] < arr2[point2]:
        *       merged[point3] = arr1[point1]
        *       point3++
        *       point1++
        *   else:
        *       merged[point3] = arr2[point2]
        *       point3++
        *       point2++
        *
        * while point1 < lengthArr1:
        *   merged[point3] = arr1[point1]
        *   point3++
        *   point1++
        *
        * while point2 < lengthArr2:
        *   merged[point3] = arr2[point2]
        *   point3++
        *   point2++
        *
        * */

        int point1, point2, point3;
        point1 = point2 = point3 = 0;

        int lengthArr1 = intArr1.length;
        int lengthArr2 = intArr2.length;

        int[] merged = new int[lengthArr1 + lengthArr2];

        while (point1 < lengthArr1 && point2 < lengthArr2) {
            if (intArr1[point1] <= intArr2[point2]) {
                merged[point3++] = intArr1[point1++];
            } else {
                merged[point3++] = intArr2[point2++];
            }

        }

        while (point1 < lengthArr1) {
            merged[point3++] = intArr1[point1++];
        }

        while (point2 < lengthArr2) {
            merged[point3++] = intArr2[point2++];
        }


        return merged;
    }


}
