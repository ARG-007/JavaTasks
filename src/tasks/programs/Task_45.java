package tasks.programs;

import tasks.interfaces.TASK;

public class Task_45 implements TASK{

    public Task_45(){
        showDetails(45, "Duck Number [If Number starts with 0 it is not a Duck]");
    }

    @Override
    public void execute() {
        String str = input("Enter the Number: ");
        if(str.charAt(0) == '0') 
            System.out.println("Number is not duck");
        else
            System.out.println("Number is a Duck");
    }
    
}

