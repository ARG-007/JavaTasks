package tasks.programs;



import tasks.interfaces.TASK;
import tasks.library.Array;

/**
 * TASK ID : 22
 * Description : Print The Given Array With Their Index
 */

public class Task_22 implements TASK{

    public Task_22(){
        /**
         * Sends Task ID and Description to base class constructor to print these as
         * details
         */
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 22;
    }

    public String getDescription() {
          return "Print The Given Array With Their Index";
    }

    @Override
	public void execute() {
        System.out.print("Enter The Size Of The Array : ");
        int n=Integer.parseInt(input.nextLine());

        //Uses Array Class to get array and print its element with index
        Array array=new Array(n);
        array.getArray();
        System.out.println("Elements With Their Index :\n");
        array.printWithIndex("\n");
    }

    public static void main(String args[]) {

        //To Run Task Without Calling From another method
        Task_22 test=new Task_22();
        test.execute();
    }
}
