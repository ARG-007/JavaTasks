package tasks.programs;

import java.util.Arrays;

import tasks.interfaces.TASK;

public class Task_49 implements TASK{
    public Task_49(){
        showDetails(49, "Reverse Number Using Abstracting Digit");
    }
    @Override
    public void execute() {
        char[] number = input("Enter The Number: ").toCharArray();
        
        int l = number.length-1, pivotIndex = l;

        while(number[pivotIndex--] <= number[pivotIndex]);
        
        number[pivotIndex] ^= number[l];
        number[l] ^= number[pivotIndex];
        number[pivotIndex] ^= number[l];
        
        Arrays.sort(number, pivotIndex+1, l+1);

        System.out.println(String.valueOf(number));
    }

    public static void main(String[] args) {
        new Task_49().execute();
    }
    
}
