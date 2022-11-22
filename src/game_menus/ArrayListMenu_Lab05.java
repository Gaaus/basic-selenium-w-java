package game_menus;

import java.util.*;

public class ArrayListMenu_Lab05 {

    public static void displayMenu() {
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

    public static Integer getUserOption() {
        System.out.print("Please enter your option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void addNumberIntoArrayList(List<Integer> arrList) {
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
        do {
            System.out.print("Please input an integer number: ");
            Scanner scanner = new Scanner(System.in);
            arrList.add(scanner.nextInt());
            System.out.print("Do you want to add more? (true/false) --> : ");
            Scanner scanner1 = new Scanner(System.in);
            continueAdd = scanner1.nextBoolean();
        } while (continueAdd == true);
    }

    public static void printArrayList(List<Integer> arrList) {
        System.out.println("Array is: " + arrList);
    }

    public static void printEachNumber(List<Integer> arrList) {
        System.out.println("Numbers in an array are:......");
        for (Integer value : arrList) {
            System.out.println(value);
        }

    }

    public static Integer getMaxNum(List<Integer> arrList) {
        int maxNum;
        SortedSet<Integer> sortedSetArrList = new TreeSet<>(arrList);
        List<Integer> ascStoredArrList = new ArrayList<>(sortedSetArrList);
        maxNum = ascStoredArrList.get(ascStoredArrList.size()-1);
        return (maxNum);
    }

    public static Integer getMinNum(List<Integer> arrList) {
        int minNum;
        SortedSet<Integer> sortedSetArrList = new TreeSet<>(arrList);
        List<Integer> ascStoredArrList = new ArrayList<>(sortedSetArrList);
        minNum = ascStoredArrList.get(0);
        return (minNum);
    }

    public static void searchNumber(List<Integer> storedArrList) {
        System.out.print("Please input Searching Number: ");
        Scanner scanner = new Scanner(System.in);
        int searchNum = scanner.nextInt();
        if (storedArrList.contains(searchNum) == true) {
            System.out.println("Index of the searching number is: " + storedArrList.indexOf(searchNum));
        } else {
            System.out.println("No Index found");
        }
    }
}
