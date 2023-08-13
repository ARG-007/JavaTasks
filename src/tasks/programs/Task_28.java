package tasks.programs;

import tasks.interfaces.TASK;
import tasks.library.Array;

public class Task_28 implements TASK{
    public Task_28(){
        showDetails(28,"Find The Second Smallest In An Array");
    }

    public void execute(){
        System.out.print("Enter The Size Of The Array : ");
        Array list =new Array(Integer.parseInt(input.nextLine()));
        list.getArray();
        System.out.print("Second Smallest Element : "+ list.secSmallestElement());
    }

    public static void main(String  args[]){
        new Task_28().execute();
    }
}
