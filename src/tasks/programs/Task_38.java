package tasks.programs;

import java.util.Arrays;

import tasks.interfaces.TASK;
import tasks.library.Helper;

public class Task_38 implements TASK{
    public Task_38() {
        showDetails(38,"Finding The First Missing Integer In The Array");
    }

    @Override
    public void execute() {
        int[] nums = Helper.toIntArray(input("Enter The Elements : ").split(" "));
        Arrays.sort(nums);
        
        int start = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i] != start+1) {
                print("First Missing Integer : "+(start+1)+'\n');
                return;
            }
            start = nums[i];
        }
        print("No Missing Integer Found\n");
    }

    public static void main(String[] args) {
        new Task_38().execute();
    }
    
}
