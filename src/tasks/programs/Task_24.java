package tasks.programs;


import tasks.library.Array;
import tasks.interfaces.TASK;

/**
 * TASK ID : 24
 * TASK DESCRIPTION : Print Array After Doing K Times Right Shift
 */

public class Task_24 implements TASK{
    public Task_24(){
        showDetails(24,"Print Array After Doing K Times Right Shift");
    }

    @Override
    public void execute(){
        int n,k;

        System.out.print("Enter The Size And K : ");
        n=input.nextInt();
        k=input.nextInt();
        
        Array array=new Array(n);
        array.getArray();
        System.out.print("Right Shifted Array : ");
        for (int i:array.rightShift(k))
            System.out.print(i+" ");
    }

    public static void main(String args[]){
        new Task_24().execute();
    }
}
