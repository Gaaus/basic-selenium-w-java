package lab_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class lab_06_01 {
    public static void main(String[] args) {
        /*Calculate how many minutes in total
        * input string: #hrs#mins, # hours and # mins, etc.
        * Split by "h", fill in arrTimeParts
        * replace and parse # hrs in arrTimePart[0]
        * calculate minsFromHrs --> minsPart1
        * replace and parse # mins in arrTimePart[1] --> minsPart2
        * totalMins = minsPart1 + minsPart2
        * */

        System.out.print("Please input hours and mins: ");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        System.out.println(inputStr);
        int minsPart1, minsPart2, totalMins;
        minsPart1 = minsPart2 = totalMins = 0;
        String[] arrTimeParts = new String[2];
        arrTimeParts = inputStr.split("h");
//        System.out.println(Arrays.asList(arrTimeParts));
        minsPart1 = 60*(Integer.parseInt(arrTimeParts[0].replaceAll("[^0-9]","")));
        minsPart2 = Integer.parseInt(arrTimeParts[1].replaceAll("[^0-9]",""));
        totalMins = minsPart1 + minsPart2;
        System.out.println("Total mins are: " + totalMins);
    }
}
