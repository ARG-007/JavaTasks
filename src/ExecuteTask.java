import java.util.Scanner;

import tasks.interfaces.TASK;
import tasks.programs.*;

public class ExecuteTask {

    public static void doTask(int selection){

        TASK task;

        //Determines which class's object to be initialized
        switch(selection){
            case  0 : return;
            
            case 17 : task = new Task_17();break;
            case 18 : task = new Task_18();break;
            case 19 : task = new Task_19();break;
            case 20 : task = new Task_20();break;
            case 21 : task = new Task_21();break;
            case 22 : task = new Task_22();break;
            case 23 : task = new Task_23();break;
            case 24 : task = new Task_24();break;
            case 25 : task = new Task_25();break;
            case 26 : task = new Task_26();break;
            case 27 : task = new Task_27();break;
            case 28 : task = new Task_28();break;
            case 29 : task = new Task_29();break;
            case 30 : task = new Task_30();break;
            case 31 : task = new Task_31();break;
            case 32 : task = new Task_32();break;
            case 33 : task = new Task_33();break;
            case 34 : task = new Task_34();break;
            case 35 : task = new Task_35();break;
            case 36 : task = new Task_36();break;
            case 37 : task = new Task_37();break;
            case 38 : task = new Task_38();break;
            case 39 : task = new Task_39();break;
            case 40 : task = new Task_40();break;
            case 41 : task = new Task_41();break;
            case 42 : task = new Task_42();break;
            case 43 : task = new Task_43();break;
            case 44 : task = new Task_44();break;
            case 45 : task = new Task_45();break;

            default : System.out.println("Cannot Find Specified Task (Didn't Code)");return;
        }

        //Abstract Class Methods
        task.execute();
        System.out.println("\n"+"-".repeat(80));
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int getTask(Scanner input){
        int selection;
        System.out.println("=".repeat(80));
        while(true) {
            System.out.print("Please Enter The Task Number [0 to Exit] : ");
            try {
                selection=Integer.parseInt(input.nextLine());
                break;
            } catch (Exception e){
                System.out.print("Invalid Character Entered, Enter 0 to Exit");
            }
        }
        System.out.println("-".repeat(80));
        return selection;
    }


    public static void main(String args[]){
        clearScreen();
        Scanner input=TASK.input;
        int choice;

        //Loops Till User Enters 'n'
        do {
            choice = getTask(input);
            clearScreen();
            doTask(choice);
            
            if(choice!=0) {
                System.out.println("Press ENTER to Continue");
                input.nextLine();
                clearScreen();
            }
            

        } while(choice!=0);
        input.close();
    }
}
