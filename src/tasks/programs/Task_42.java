package tasks.programs;

import java.util.LinkedList;

import tasks.interfaces.TASK;
import tasks.library.Helper;

public class Task_42 implements TASK{

    public Task_42() {
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 42;
    }

    public String getDescription() {
          return "Sort Array of Elements which includes only 0,1,2";
    }

    @Override
    public void execute() {
        int[] array = Helper.toIntArray(input("Enter The Integers : ").split(" "));
     
        int o = 0;

        LinkedList<Integer> sorted = new LinkedList<Integer>();

        for(int i:array) {
            switch(i) {
                case 0 : 
                    sorted.addFirst(i);
                    break;
                case 1 :
                    sorted.add(o++,i);
                    break;
                case 2:
                    sorted.addLast(i);
                    break;
                default:
                    print("Invalid Element Found : "+i+", Exiting\n");
                    return;
            }
        }

        print("Sorted Array : "+sorted.toString()+"\n");
    }
    
    public static void main(String[] args) {
        new Task_42().execute();
    }
}
