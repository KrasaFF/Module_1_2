package Module_1_2.HT_1;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by KrasaFF on 03.05.2017.
 */
class ConsoleHelper {
    private Scanner enterNumber = new Scanner(System.in);

    void start(){

        System.out.print("Enter size your array: " );
        int size =  getIntScanner(enterNumber, getErrMes());
        ArrayHolder arrayHolder = new ArrayHolder(size);

        System.out.print("Enter the array manually[1] or random[2]: " );
        int arrayManuallyRandom =  getIntScanner(enterNumber, getErrMes());
        if (arrayManuallyRandom == 2){
            arrayHolder.fillingArrayRandom(arrayHolder.getArray());
        }else {
            arrayHolder.fillingArray(arrayHolder.getArray());
        }

        System.out.println("Your array : " + Arrays.toString(arrayHolder.getArray()));

        int choice;
        while (true) {
            getMenu();
            choice = enterNumber.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("What number do you want to search?");
                    int element = getIntScanner(enterNumber, getErrMes());
                    arrayHolder.searchArray(element);
                    break;
                }
                case 2: {
                    arrayHolder.sortArray();
                    break;
                }

                case 3: {
                    arrayHolder.exitApp();
                    break;
                }
                default: {
                    System.err.println(getErrMes());
                    break;
                }
            }
        }

}

    static int getIntScanner(Scanner sc, String errMes)
    {
        while (!sc.hasNextInt())
        {
            System.err.println(errMes);
            sc.next();
        }
        return sc.nextInt();
    }

    private void getMenu() {
        System.out.println("\nWhat do you want to do?\n1) search element;\n2) sort array;\n3) quit program");
    }

    static String getErrMes(){
        return "You entered incorrect value.\nPlease try again!";
    }
}