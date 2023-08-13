package tasks.programs;

import tasks.interfaces.TASK;
import tasks.library.Helper;

public class Task_39 implements TASK{

    public Task_39(){
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 39;
    }

    public String getDescription() {
          return "Finding Equiblirium Number";
    }

    @Override
    public void execute() {
        int[] nums = Helper.toIntArray(input("Enter the Elements: ").split(" "));

        int totSum = 0;

        for(int i : nums) {
            totSum+=i;
        }

        int leftSum = 0, rightSum = totSum;
        int length = nums.length;
        for(int i=0;i<length;i++) {
            rightSum -= nums[i];

            if(length%2==0) leftSum +=nums[i];

            if(leftSum == rightSum) {
                print("Equiblirium Point: "+(i+1)+"\n");

                print("[ ");
                for(int j=0;j<i+1-length%2;j++)
                    print(nums[j]+" ");
                print("]");
                
                print(" "+(length%2==1?nums[i]:"")+" ");
                
                print("[ ");
                for(int j=i+1;j<length;j++)
                    print(nums[j]+" ");
                print("]");
                
                print("\n");
                return;
            }

            if(length%2==1) leftSum += nums[i];
        }

        print("No Equiblirium Point Found");

    }

    public static void main(String[] args) {
        new Task_39().execute();
    }
    
}
