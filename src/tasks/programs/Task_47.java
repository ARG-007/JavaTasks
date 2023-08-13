package tasks.programs;

import java.util.Arrays;

import tasks.interfaces.TASK;
import tasks.library.Array;
import tasks.library.Helper;

public class Task_47 implements TASK {
    public Task_47() {
        showDetails(47, "Rotate an Array");
    }

    @Override
    public void execute() {
        int[] s = Helper.toIntArray(input("Enter an Array : ").split(" "));

        int key = toInt(input("Enter The key : "));

        Array.rotate(s, key);

        System.out.println("The Rotated Array: "+Arrays.toString(s));
    }

    public static void main(String[] args) {
        new Task_47().execute();
    }

    
}
