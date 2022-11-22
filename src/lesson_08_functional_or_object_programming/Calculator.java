package lesson_08_functional_or_object_programming;

public class Calculator {
//    public int sum(int num1, int num2){
//        return num1 + num2;
//    }
//
//    public int sum(int num1, int num2, int num3) {
//        return num1 + num2 + num3;
//    }
    // Varargs / kubenetes / Rest parameters   ==> output = 3 6 3
//    public int sum(int... nums) {
//        int total = 0;
//        for (int num : nums) {
//            total += num;
//        }
//        return total;
//    }
    // Rest parameters with an init number ( the init Num will not include in the calculator) ==> output = 2 5 2
    public int sum(int initNum, int... nums) {
        int total1 = 0;
        for(int num:nums) {
            total1 += num;
        }
        return total1;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3, 2));
        System.out.println(calculator.sum(3, 2, 3));

        System.out.println(calculator.sum(3, 2));


    }

}
