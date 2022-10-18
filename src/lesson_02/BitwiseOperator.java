package lesson_02;

public class BitwiseOperator {
    public static void main(String[] args) {
        // && ca 2 dk deu cung dung, dk 1 sai thi khong thuc thi dk 2, always false to execute IF statement
        // condition A && condition B: Both conditions must be True to execute IF statement.
        // Check from L->R, if condition A False, won't care B, any False wont execute IF statement
        // if condition A true, continue validate B

        // || chi can 1 trong 2 dk dung thi thuc thi IF statement
        // condition A || condition B ==> only if condition A False, then continue validate condition B
        // if condition A True, won't care B
        // Only won't execute IF statement when Both A , B are False

        if (getFirstNum() != 0 || getSecondNum() != 0) {
            System.out.println("Calculating....");
            System.out.println(8 &10);
        }
    }

        private static int getFirstNum() {
            System.out.println("Calling getting 1st num!");
            return 0;
        }

        private static int getSecondNum() {
            System.out.println("Calling getting 2nd num!");
            return 0;
        }

}
