package lesson_08_functional_or_object_programming;

import game_menus.ArrayListMenu_Lab05;
import java.util.ArrayList;
import java.util.List;

public class Functional_TestArrayListMenu {
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
            ArrayListMenu_Lab05.displayMenu();
            userOption = ArrayListMenu_Lab05.getUserOption();
            switch (userOption) {
                case 0: {
                    continuePlay = false;
                    break;
                }
                case 1: {   // addNumberIntoArrayList
                    ArrayListMenu_Lab05.addNumberIntoArrayList(storedArrList);
                    break;
                }
                case 2: {
                    ArrayListMenu_Lab05.printArrayList(storedArrList);
                    ArrayListMenu_Lab05.printEachNumber(storedArrList);
                    break;
                }
                case 3: {
                    int maxNum;
                    maxNum = ArrayListMenu_Lab05.getMaxNum(storedArrList);
                    System.out.println("Max number in array is: " + maxNum);
                    break;
                }
                case 4: {
                    int minNum;
                    minNum = ArrayListMenu_Lab05.getMinNum(storedArrList);
                    System.out.print("Minimum number in an array is: " + minNum);
                    break;
                }
                case 5: {
                    ArrayListMenu_Lab05.searchNumber(storedArrList);
                    break;
                }
                default:
                    System.out.println("Wrong option, please re-input....");
            }
        }


    }
}
