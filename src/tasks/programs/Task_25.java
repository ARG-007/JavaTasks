package tasks.programs;

import tasks.interfaces.TASK;
import tasks.library.Numbers;

public class Task_25 implements TASK{
    public Task_25(){
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 25;
    }

    public String getDescription() {
          return "Sum Of Square Of The Digits Of The Number";
    }

    public void execute(){
        long n;
        System.out.print("Enter The Number : ");
        n=Long.parseLong(input.nextLine());
        System.out.print("Sum Of Square Of Digits Of "+n+" : "+Numbers.sumOfSquare(n));
    }

    public static void main(String args[]){
        new Task_25().execute();
    }
}
