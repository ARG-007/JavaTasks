package tasks.programs;


import java.util.Stack;
import tasks.interfaces.TASK;


public class Task_37 implements TASK{

    public Task_37() {
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 37;
    }

    public String getDescription() {
          return "Reversing in Groups";
    }

    public void execute() {
        String[] strs = input("Enter The Elements : ").split(" ");
        int n = toInt(input("Enter Group Pivot : "));

        Stack<String> stack = new Stack<String>();

        System.out.println("Group Reversed Array : ");

        for(int i=0; i<strs.length; i++) {
            if((i!=0 && i%n == 0) || i==strs.length-1) {
                while(!stack.empty()) {
                    System.out.print(stack.pop() + " ");
                }
            }
            stack.push(strs[i]);
        }
    }
    public static void main(String[] args) {
        new Task_37().execute();
    }    
}
