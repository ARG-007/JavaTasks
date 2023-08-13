package tasks.programs;

import tasks.interfaces.TASK;
import tasks.library.Helper;

public class Task_50 implements TASK{

    public Task_50(){
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 50;
    }

    public String getDescription() {
          return "Find Number Of Elements Greater Than Its Prior Numbers";
    }

    @Override
    public void execute() {
        int[] arr = Helper.toIntArray(input("Enter the Elements: ").split(" "));

        int max = Integer.MIN_VALUE , count=0;

        for(int i:arr) {
            if(max<i) {
                max = i;
                count++;
            }
        }

        print("Elements That Are Greater Than All its Numbers: "+count);
    }

    public static void main(String[] args) {
        new Task_50().execute();
    }
    
}
