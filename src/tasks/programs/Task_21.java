package tasks.programs;


import tasks.interfaces.TASK;
import tasks.library.Calculator;

/**
 * TASK ID : 21
 * Description : Calculate The Power Of The Number
 */

public class Task_21 implements TASK{

    public Task_21(){
        /**
         * Sends Task ID and Description to base class constructor to print these as
         * details
         */
        showDetails(21,"Calculate The Power Of The Number");
    }

    @Override
	public void execute() {
        //Get Base And Exponential
        int base,expo;
        System.out.print("Enter The Base And Exponent : ");
        base=input.nextInt();
        expo=input.nextInt();

        //Scanner nextLine to consume leftovers
        input.nextLine();

        //Uses Calculator Class power method (Returns BigInteger) to calculate
        System.out.print("Power : "+Calculator.power(base, expo));
    }

    public static void main(String args[]) {
        //To Run Task Without Calling From another method
        Task_21 test=new Task_21();
        test.execute();
    }
}
