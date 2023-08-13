package tasks.programs;

import tasks.interfaces.TASK;

/**
 * TASK ID : 26
 * DESCRIPTION : Finding The Number That Is Divisible By The Two Given Numbers
 */

public class Task_26 implements TASK{
    public Task_26(){
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 26;
    }

    public String getDescription() {
          return "Finding The Number That Is Divisible By The Two Given Numbers";
    }

    public int dividedByNumbers(int L,int R){
        if (L%R==0)
            return L;
        if (R%L==0)
            return R;
        return L*R;
    }

    public void execute(){
        int n,m;
        System.out.print("Enter The Two Numbers : ");
        n=input.nextInt();m=input.nextInt();
        input.nextLine();
        System.out.println("The Smallest Number Divided By "+n+" and "+m+" : "+dividedByNumbers(n,m));
    }

    public static void main(String args[]){
        new Task_26().execute();
    }
}
