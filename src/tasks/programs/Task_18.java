package tasks.programs;


import tasks.interfaces.TASK;
import tasks.library.Numbers;

/**
 * TASK ID : 18
 * Description : Check Whether A Number Is Pallindrome Or Not
 */

public class Task_18 implements TASK{

    public Task_18(){
        /**
         * Sends Task ID and Description to base class constructor to print these as
         * details
         */
        showDetails(18,"Check Whether A Number Is Pallindrome Or Not");
    }

    @Override
	public void execute(){
        int number;
        System.out.print("Enter The Number : ");
        number=Integer.parseInt(input.nextLine());

        //Numbers.isPallindrome : boolean to check whether it is pallindrome or not
        System.out.print("Pallindrome : "+Numbers.isPallindrome(number));
    }

    public static void main(String args[]){
        //To Run Task Without Calling From another method
        Task_18 test=new Task_18();
        test.execute();
    }

}
