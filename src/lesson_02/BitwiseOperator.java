package lesson_02;

public class BitwiseOperator {
    public static void main(String[] args) {
        // && ca 2 dk deu cung dung, dk 1 sai thi khong thuc thi dk 2, always false
        //  || 1 trong 2 dk dung' thi thuc thi, hoac chi can dk 1 dung' thi da thuc thi roi!!!
        // neu chi 1 dau & hoac 1 dau | thi 2 dk luon duoc thuc thi, roi moi process tiep
        if (getFirstNum() != 0 && getSecondNum() != 0) {
            System.out.println("Calculating....");
        }
    }

        private static int getFirstNum() {
            System.out.println("Calling getting 1st num!");
            // return 0; --> test 1: "Calling getting 1st num!" only
            // return 1; // test 2:  "Calling...1st" & Calling...2nd & Calculating
            return 1;
        }

        private static int getSecondNum() {
            System.out.println("Calling getting 2nd num!");
            // return 2; // test 2: "Calling...1st" & Calling...2nd & Calculating
            return 0; // test 3: "calling ... 1st" & Calling ...2nd - no Calculating... since criteria 2 is false
        }

        // neu if (getFirstNum() != 0 & getSecondNum() != 0) ==> 1 dau & hoac 1 dau |,  thi luon evaluate ca 2 crits calling...1st, 2nd
        // neu ||, crit 1st sai thi moi evaluate (xem xet) toi crit 2

}
