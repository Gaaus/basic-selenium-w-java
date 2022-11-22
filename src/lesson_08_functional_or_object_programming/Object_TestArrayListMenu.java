package lesson_08_functional_or_object_programming;



import game_menus.ObjectArrayListMenuLab05;

import java.util.ArrayList;
import java.util.List;

public class Object_TestArrayListMenu {
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
        ObjectArrayListMenuLab05 arrayListGame = new ObjectArrayListMenuLab05();

        while (continuePlay) {
            arrayListGame.displayMenu();
            userOption = arrayListGame.getUserOption();
            switch (userOption) {
                case 0: {
                    continuePlay = false;
                    break;
                }
                case 1: {   // addNumberIntoArrayList
                    arrayListGame.addNumberIntoArrayList(storedArrList);
                    break;
                }
                case 2: {
                    arrayListGame.printArrayList(storedArrList);
                    arrayListGame.printEachNumber(storedArrList);
                    break;
                }
                case 3: {
                    int maxNum;
                    maxNum = arrayListGame.getMaxNum(storedArrList);
                    System.out.println("Max number in array is: " + maxNum);
                    break;
                }
                case 4: {
                    int minNum;
                    minNum = arrayListGame.getMinNum(storedArrList);
                    System.out.print("Minimum number in an array is: " + minNum);
                    break;
                }
                case 5: {
                    arrayListGame.searchNumber(storedArrList);
                    break;
                }
                default:
                    System.out.println("Wrong option, please re-input....");
            }
        }


    }
}
