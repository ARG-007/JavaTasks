package tasks.programs;

import java.util.Arrays;
import java.util.HashSet;

import tasks.interfaces.TASK;
import tasks.library.Helper;

public class Task_40 implements TASK{
    public Task_40(){
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 40;
    }

    public String getDescription() {
          return "Finding Triplets";
    }


    @Override
    public void execute() {
        int nums[] = Helper.toIntArray(input("Enter The Numbers : ").split(" "));

        HashSet<Integer> set = new HashSet<Integer>();
        Arrays.stream(nums).boxed().forEach(num -> {set.add(num);});

        print("Triplets : \n");
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1; j<nums.length;j++) {
                if(set.contains(nums[i]+nums[j])) {
                    print(nums[i]+" "+nums[j]+" "+(nums[i]+nums[j])+"\n");
                }
            }
        }

    }
    

    public static void main(String[] args) {
        new Task_40().execute();
    }
}
