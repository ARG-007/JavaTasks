package tasks.programs;


import tasks.interfaces.TASK;
import tasks.library.Array;

/**
 * TASK ID : 17
 * Description : Sum Of Elements In An Array Upto 'K' Elements
 */

public class Task_17 implements TASK{
	public Task_17(){
        /**
         * Sends Task ID and Description to base class constructor to print these as
         * details
         */
		showDetails(17,"Sum Of Elements In An Array Upto 'K' Elements");
	}

	@Override
	public void execute() {
		System.out.print("Enter The Size and 'K' : ");
		int n=input.nextInt();
		int k=input.nextInt();
		input.nextLine();

		//If Size is less than 'K' return
		if (n<k) {
			System.out.print("Size is Smaller than K !!!!");
			return;
		}

		//Uses Array Class to get array and calculate its sum upto 'K' elements
		Array nums=new Array(n);
		nums.getArray();
		System.out.print("Sum Upto "+k+" Element(s) : "+nums.sumupto(k));
	}


	public static void main(String agrs[]) {

		//To Run Task Without Calling From another method
		System.out.print("I Got Executed !!!!! Probably shouldn't be happy though");
		Task_17 test=new Task_17();
		test.execute();
	}

}
