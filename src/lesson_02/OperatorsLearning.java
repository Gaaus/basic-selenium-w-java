package lesson_02;

public class OperatorsLearning {

    public static void main(String[] args) {
        int myNum1 = 1; // to duplicate a line: CTRL + D
        int myNum2 = 2;
        // a completed statement must be stored in a memory cell
        // right operand: phan tinh toan' ben phai
        int total = myNum1 + myNum2;
        System.out.println("total: " +  total);

        // print in format: Total is %d neu la so int, %f neu la Float, %b neu la boolean
        System.out.printf("Total is %d", total);

        // khi print in format, muon moi printf la 1 dong thi dung \n
        float myFloatNum = 3.14f;
        long myLongNum = 99999999L;
        System.out.printf("Float Num is %f\n", myFloatNum);
        System.out.printf("Long Num is %d\n", myLongNum);

        // operator: / la chia lay phan nguyen, % la chia lay phan du (Modular)
        // rounding float numbers --> refer to blog if interest

        myFloatNum = 3/2f;
        System.out.printf("new Float Num is: %f\n", myFloatNum);

        // division and modular
        float myDivResult = 5/2f;
        int myModDivResult = 5 % 2;
        System.out.printf("Division result of 5/2 is: %f\n", myDivResult);
        System.out.printf("Modular result of division is : %d\n", myModDivResult);
    }
}
