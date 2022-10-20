package lab_05;

import java.util.*;

public class lab_05 {

    public static void main(String[] args) {
        /*
         * while continuePlay = true:
         *   displayMenu() --> (1 add, 2 print, 3 max, 4 min, 5 search, 0 quit)
         *   getUserOption()
         *   6 options so use switch cases. Each option call to a method
         * */

        int userOption;
        boolean continuePlay = true;
        List<Integer> storedArrList = new ArrayList<>();

        while (continuePlay) {
            displayMenu();
            userOption = getUserOption();
            switch (userOption) {
                case 0: {
                    continuePlay = false;
                    break;
                }
                case 1: {   // addNumberIntoArrayList
                    addNumberIntoArrayList(storedArrList);
                    break;
                }
                case 2: {
                    printArrayList(storedArrList);
                    printEachNumber(storedArrList);
                    break;
                }
                case 3: {
                    int maxNum;
                    maxNum = getMaxNum(storedArrList);
                    System.out.println("Max number in array is: " + maxNum);
                    break;
                }
                case 4: {
//                    int minNumIndex;
//                    minNumIndex = storedArrList.indexOf(getMinNum(storedArrList));
//                    System.out.print("Minimum number in an array is at index: " + minNumIndex);
//                    break;
                }
                case 5: {}
            }
        }


    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("============== MENU ===============");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("0. Quit game!!!");
        System.out.println("===================================");
        System.out.println();
    }

    private static Integer getUserOption() {
        System.out.print("Please enter your option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void addNumberIntoArrayList(List<Integer> arrList) {
        /*
         * int addMore;
         * do :
         *   *   " plz input " --> input a number
         *   privArrList.add(numInput)
         *   " add more? true/false"
         *   continueAdd = scanner1.nextInt()
         * while (continueAdd = true)
         *
         * */
        boolean continueAdd;
        int numInput;
        do {
            System.out.print("Please input an integer number: ");
            Scanner scanner = new Scanner(System.in);
            numInput = scanner.nextInt();
            arrList.add(numInput);
            System.out.print("Do you want to add more? (true/false) --> : ");
            Scanner scanner1 = new Scanner(System.in);
            continueAdd = scanner1.nextBoolean();
        } while (continueAdd == true);
    }

    private static void printArrayList(List<Integer> arrList) {
        System.out.println("Array is: " + arrList);
    }

    private static void printEachNumber(List<Integer> arrList) {
        System.out.println("Numbers in an array are:......");
        for (Integer value : arrList) {
            System.out.println(value);
        }

    }

    private static Integer getMaxNum(List<Integer> arrList) {
        int privmaxNum;
        Set<Integer> setArrList= new HashSet<>(arrList);
        List<Integer> ascStoredArrList = new ArrayList<>(setArrList);
        privmaxNum = ascStoredArrList.get(ascStoredArrList.size()-1);
        return (privmaxNum);
    }
//    private static Integer getMinNum(List<Integer> arrList) {
//        int minNum;
//        Set<Integer> setArrList= new HashSet<>(arrList);
//        List<Integer> ascStoredArrList = new ArrayList<>(setArrList);
//        minNum = ascStoredArrList.get(0);
//        System.out.println(ascStoredArrList);
//        System.out.println(minNum);
//        return (minNum);
//    }
}
