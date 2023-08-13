package tasks.programs;

import java.util.Arrays;

import tasks.interfaces.TASK;
import tasks.library.Helper;

public class Task_41 implements TASK{
    public Task_41(){
        showDetails(41, "Merge Two Sorted Array");
    }

    @Override
    public void execute() {
        int nums1[] = Helper.toIntArray(input("Enter Array 1 : ").split(" "));
        int nums2[] = Helper.toIntArray(input("Enter Array 2 : ").split(" "));

        int sorted[] = new int[nums1.length+nums2.length];

        int i, j, k; i=j=k=0;

        while(k<sorted.length) {
            if((i<nums1.length && nums1[i] <= nums2[j]) || j>=nums2.length) {
                sorted[k++] = nums1[i++];
            }
            else {
                sorted[k++] = nums2[j++];
            }
        }

        System.out.println(Arrays.toString(sorted));
    }

    public static void main(String[] args) {
        new Task_41().execute();
    }
    
}
