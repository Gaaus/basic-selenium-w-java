package lab_06;

import java.util.Scanner;

public class lab_06_02 {
    public static void main(String[] args) {
        /* Check user input correct password, allow to input maximum 3 times
        * quota = 3
        * * do (while quota > 0):
            * usr input pass
            * checkResult = checkPassword();
            * if checkResult = true:
            *   "congrats..."
            * else:
            *   "wrong pass.."
            *   quota--;
            *   if quota = 0 --> Bye
        * checkPassword():
        *   compare length, not == return false
        *   length ==:
        *       if myPassword.equals(usrPassword) return True;
        *       else return false
        * */
        String myPassword = "password123";
        int quota = 3;
        boolean checkResult = false;

        do {
            System.out.print("Please input password...");
            Scanner scanner = new Scanner(System.in);
            String usrPassword = scanner.nextLine();

            checkResult = checkPassword(usrPassword, myPassword);
            if (checkResult) {
                System.out.println("Congrats... Welcome to Dashboard!");
                quota = 0;
            } else {
                System.out.println("Wrong password...");
                quota--;
                if (quota == 0) System.out.println("No input accepted anymore..Bye bye...!!!");
            }
        } while (quota > 0);

    }

    private static boolean checkPassword(String usrPassword, String myPassword) {
        if (myPassword.length() != usrPassword.length()) return false;
        else {
            if (myPassword.equals(usrPassword) == true) return true;
            else return false;
        }
    }
}
