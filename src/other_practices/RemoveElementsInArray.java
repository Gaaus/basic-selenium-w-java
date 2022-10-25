package other_practices;

import java.util.*;

public class RemoveElementsInArray {
    public static void main(String[] args) {

        /*
        * User input number to myArr and myElements
        * myElements includes the numbers that user want to remove from myArr
        *
        * switch case: 1. myArr, 2. myElements, 3. removeElementsOutOfArr
        *   myArr: inputNums(myArr);
        *   myElements: inputNums(myElements)
        *   removeElementsOutOfArr():
        *       print origin myArr, myElements
        *       return myArr that already removed myElements
        *
        * */

        int userOption;
        boolean isContinuing = true;
        List<Integer> myArr = new ArrayList<>();
        List<Integer> myElements = new ArrayList<>();

        while (isContinuing) {
            printMenu();
            userOption = getUserOption();
            switch (userOption) {
                case 0: {
                    System.out.println("Bye bye, see ya...");
                    isContinuing = false;
                    break;
                }
                case 1: {
                    addNumberIntoArrayList(myArr);
                    break;
                }
                case 2: {
                    addNumberIntoArrayList(myElements);
                    break;
                }
                case 3: {
                    if (myArr.isEmpty() == false && myElements.isEmpty() == false) {
                        myArr = removeElementsOutOfArr(myArr,myElements);
                        System.out.println("After removing, myArr is: " + myArr);
                    } else {
                        System.out.println("Missing Array or Elements!!! Please input missing one...");

                    }
                    break;
                }
                case 4: {
                    printArray(myArr);
                    printArray(myElements);
                    break;
                }
                default: {
                    System.out.println("Input wrong Option, please re-try....");
                    break;
                }
            }
        }

    }

    private static void printMenu() {
        System.out.println("=========================MENU=======================");
        System.out.println("1. Input Integer Numbers of an Array");
        System.out.println("2. Input Integer Numbers / Elements to be removed");
        System.out.println("3. Remove Elements out of an Array");
        System.out.println("4. Print Array and Element");
        System.out.println("0. Quit game!!!");
        System.out.println("====================================================");
    }

    private static int getUserOption() {
        System.out.print("Please input you option: ");
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextInt());
    }

    private static void addNumberIntoArrayList(List<Integer> arrList) {
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

    private static void printArray(List<Integer> arr) {
        System.out.println("Array is: " + arr);
    }

    private static List<Integer> removeElementsOutOfArr(List<Integer> myArr, List<Integer> myElements) {
        /*
        * find index of values in myArr matched with Elements --> Set: indexMatch{}
        * resultArr
        * for idx = 0 , idx < myArr.length, idx++:
        *   if idx is not in Set indexMatch:
        *       resultArr.add(myArr.get(idx))
        *   else continue;
        *
        * */

        List<Integer> resultArr = new ArrayList<>();
        Set<Integer> setMatchedIndex = new HashSet<>();
        Set<Integer> setElements = new HashSet<>(myElements);

        for (int idx = 0; idx < myArr.size(); idx++) {
            if (setElements.contains(myArr.get(idx)) == true) {
                setMatchedIndex.add(idx);
            }
        }

        for (int idx = 0; idx < myArr.size(); idx++) {
            if (setMatchedIndex.contains(idx) == false) {
                resultArr.add(myArr.get(idx));
            }
        }
        myArr.clear();
        myArr = resultArr;
        return myArr;
    }
}
