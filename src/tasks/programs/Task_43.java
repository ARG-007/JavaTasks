package tasks.programs;

import java.util.HashMap;

import tasks.interfaces.TASK;
import tasks.library.Helper;

public class Task_43 implements TASK{
    public Task_43() {
        showDetails(43, "Count The Number of Digits");
    }

    @Override
    public void execute() {
        int numbers[] = Helper.toIntArray(input("Enter The Elements : ").split(" "));

        HashMap<Integer, Integer> digitCount = new HashMap<>();
        int cdc;
        for(int i:numbers) {
            cdc=0;
            while(i!=0) {
                cdc++;
                i/=10;
            }
            digitCount.put(cdc, digitCount.getOrDefault(cdc,0)+1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(31));
        sb.append(String.format("%n|%14s|%14s|%n","Digit","Count"));
        sb.append("-".repeat(31));
        
        digitCount.entrySet().forEach( entry -> {
            sb.append(String.format("%n|%14s|%14s|",entry.getKey(), entry.getValue()));
        });
        sb.append("\n"+"-".repeat(31));

        print(sb.toString());
    }

    public static void main(String[] args) {
        new Task_43().execute();
    }
    
}
