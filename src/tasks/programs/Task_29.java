package tasks.programs;

import java.util.ArrayList;

import tasks.library.Array;

class RemoveDub extends Array{
    ArrayList<Integer> refinedArray;

    RemoveDub(int n){
        super(n);
        getArray();
        refineArray();
    }

    public void refineArray(){
        refinedArray=new ArrayList<>();
        for (int i=0;i<n;i++){
            if (!refinedArray.contains(numarray[i]))
                refinedArray.add(numarray[i]);
        }
    }
}

public class Task_29 implements tasks.interfaces.TASK{
    public Task_29(){
        showDetails(29,"Remove Duplicate Elements From The Given Array");
    }

    public void execute(){
        System.out.print("Enter The Lenght Of The Array : ");
        System.out.print("The Refined Array is : "+new RemoveDub(Integer.parseInt(input.nextLine())).refinedArray);

    }

    public static void main(String args[]){
        new Task_29().execute();
    }
}
