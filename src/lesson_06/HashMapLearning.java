package lesson_06;

import java.util.List;
import java.util.Scanner;

public class HashMapLearning {
    public static void main(String[] args) {
//        check user password is followed the correct format
        System.out.print("Please create your password (has Capitalize, Number, Incapitalize): ");
        Scanner scanner = new Scanner(System.in);
        String myPassword = scanner.next();
        checkPassword(myPassword);
    }

    private static void checkPassword(String password) {
        /*
        * loop over characters myPassword
        *   if char is digit: flagDigit +
        *   if char is lowerCase: flagInCap +
        *   if char is Up case: flagCap+
        * if flagDigit*flagCap*flagInCap !=0: "Password is correct format"
        * else: "Password is in Incorect format"
        * */
        int flagCap, flagDigit, flagInCap;
        flagCap = flagDigit = flagInCap = 0;
        char[] arrChars = password.toCharArray();
        for (int i = 0; i < arrChars.length - 1; i++) {
            if(Character.isDigit(arrChars[i])) flagDigit++;
            if(Character.isLowerCase(arrChars[i])) flagInCap++;
            if(Character.isUpperCase(arrChars[i])) flagCap++;

        }
        if (flagDigit*flagCap*flagInCap != 0) {
            System.out.println("Congrats... Password format is Correct");
        }
        else {
            System.out.println("Password format is in-correct....");
        }
    }
}
