package lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {

    public static void main(String[] args) {
        // 2 | Argument: real value for the parameter in the method/function
        printARandomNum(3);
        int maximumValue = getMaximumValue (1, 2);

    }
    // Single responsibility : 1 method just to process a single task/ objective only
    private static int getMaximumValue(int firstNum, int secondNum) {
        int maximumValue = firstNum;
        if (secondNum >= maximumValue) maximumValue = secondNum;
        return maximumValue; // sau return la khong co 1 statement nao khac nua
    }

    // inputNumber | parameter, dac ta 1 thong so can truyen vao
    public static void printARandomNum(int inputNumber) {
        // khogn co kieu tra ve, void khong co kieu tra ve, nen return la khong tra ve gi het
        // thoat khoi method immediately
        if (inputNumber == 3) return; // return nay khong co kieu tra ve (void), nen statement sau do' van dung

        System.out.println(inputNumber);

    }

    // Access Modifier | class method | returned type
    // Khong return gi ve ca thi xai static void
//    public static void printARandomNum() {
//        System.out.println(new SecureRandom().nextInt(100));
//    }

}
