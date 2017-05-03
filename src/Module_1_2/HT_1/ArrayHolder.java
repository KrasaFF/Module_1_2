package Module_1_2.HT_1;

/**
 * Created by KrasaFF on 03.05.2017.
 */
import java.util.*;
import java.lang.reflect.Array;

class ArrayHolder {

    private int[] imas;

    ArrayHolder(int arraySize) {
        imas = new int[arraySize];
    }

    int[] getArray() {
        return imas;
    }

    void fillingArrayRandom(int[] imas) {
        for (int i = 0; i < imas.length; i++) {
            imas[i] = (int) ((Math.random() * 10 + 1));
        }
    }

    void fillingArray(int[] imas) {
        Scanner in = new Scanner(System.in);
        int i= 0;
        int count = 0;
        while (count < imas.length) {
            System.out.print("Enter  imas[" + i++ + "]: ");
            try {
                imas[count] = ConsoleHelper.getIntScanner(in, ConsoleHelper.getErrMes());
                count++;
            } catch (Exception e) {
                System.out.println("Not integer. Try again.");
            }
        }
    }

    void sortArray() {
        Arrays.sort(imas);
        System.out.println("Sorted array: " +Arrays.toString(imas));
    }

    void searchArray(int element) {
        boolean isInteger = false ;
        System.out.println("Searching.........");

        int searchElement=0;
        for (int i = 0; i < imas.length; i++) {
           if (element == imas[i]) {
                System.out.println("Number " + element +" is found: " +", " + " array index is: " + i);
               searchElement = 2;
                break;
            } else searchElement = -1;
        }
        if(searchElement == -1) System.out.println("Number is not found.");
    }

    void exitApp() {
        System.out.println("Exit from the application...............");
        System.exit(0);
    }

}