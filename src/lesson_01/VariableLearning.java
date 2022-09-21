package lesson_01;

public class VariableLearning {

    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        short myIntNum = 129;
        long myLongNum = 2000;
        float myFloatNum = 3.14f; // float luon co' datatype suffix, other num datatype no need
        double myDoubleNum = 3.14D;
        System.out.println(myIntNum);

        // constant declaring variable, often using naming convention as Cap snake_case: MY_CONSTANT
        final int MY_CONSTANT = 123;
        // MY_CONSTANT = 124; // java does not allow to assign new value for a constant variable

    }
}
