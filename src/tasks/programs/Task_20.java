package tasks.programs;


import tasks.interfaces.TASK;
import tasks.library.Numbers;

/**
 * TASK ID : 20
 * Description : Count The Number Of Digits In The Given Number
 */

public class Task_20 implements TASK {

    public Task_20(){
        /**
         * Sends Task ID and Description to base class constructor to print these as
         * details
         */
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 20;
    }

    public String getDescription() {
          return "Count The Number Of Digits In The Given Number";
    }

    @Override
	public void execute() {
        int number;
        System.out.print("Enter The Number : ");
        number=input.nextInt();
        input.nextLine();

        //Uses Numbers Class Method to calculate digits
        System.out.print("Number Of Digits : "+Numbers.countDigits(number));
    }

    public static void main(String args[]) {

        //To Run Task Without Calling From another method
        Task_20 test=new Task_20();
        test.execute();
    }
}
