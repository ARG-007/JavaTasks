package tasks.programs;


import tasks.interfaces.TASK;
import tasks.library.Numbers;

/**
 * TASK ID : 23
 * Description : Print The Even Numbers Between The Given Range
 */

public class Task_23 implements TASK{

    public Task_23(){
        /**
         * Sends Task ID and Description to base class constructor to print these as
         * details
         */
        showDetails(23,"Print The Even Numbers Between The Given Range");
    }

    @Override
	public void execute() {
        int m,n;
        System.out.print("Enter The Range : ");
        m=input.nextInt();
        n=input.nextInt();
        input.nextLine();//To consume leftovers

        //Uses Numbers class method to generate even numbers between the two numbers
        int[] evennums=Numbers.evensBetween(m,n);

        System.out.print("Even Numbers Between "+m+" And "+n+" : ");
        for (int i:evennums)
            System.out.print(i+" ");
    }

    public static void main(String args[]) {

        //To Run Task Without Calling From another method
        Task_23 test=new Task_23();
        test.execute();
    }
}
