package tasks.programs;

import tasks.interfaces.TASK;
import tasks.library.Numbers;

/**
 * TASK ID : 19
 * Description : Check Whether A Number Is Prime Or Not
 */

public class Task_19 implements TASK{

    public Task_19(){
        /**
         * Sends Task ID and Description to base class constructor to print these as
         * details
         */
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 19;
    }

    public String getDescription() {
          return "Check Whether A Number Is Prime Or Not";
    }

    @Override
	public void execute(){
        int number;
        System.out.print("Enter The Number : ");
        number=Integer.parseInt(input.nextLine());

        //Uses Numbers Class Method to check "Primeness" of the number
        System.out.print("Prime : "+Numbers.isPrime(number));
    }

    public static void main(String args[]){

        //To Run Task Without Calling From another method
        Task_19 test=new Task_19();
        test.execute();
    }
}
