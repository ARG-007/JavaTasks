package tasks.programs;


import tasks.interfaces.TASK;

/**
 * TASK ID : 17
 * Description : Sum Of Elements In An Array Upto 'K' Elements
 */

public class Task_0 implements TASK{
	public Task_0(){
        /**
         * Sends Task ID and Description to base class constructor to print these as
         * details
         */
		showDetails(getID(), getDescription());
	}

    public int getID() {
        return 0;
    }

    public String getDescription() {
          return "A Sacrifice for greater good";
    }

	@Override
	public void execute() {

	}


	public static void main(String agrs[]) {
		Task_0 test=new Task_0();
		test.execute();
	}

}

