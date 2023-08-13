package tasks.interfaces;
import java.util.Scanner;

public interface TASK {
    Scanner input = new Scanner(System.in);

    default String input(String prompt){
        print(prompt);
        return input.nextLine().strip();
    }

    default Integer toInt(String string){
        return Integer.parseInt(string);
    }
    
    default Double toDouble(String string){
        return Double.parseDouble(string);
    }

    default public void showDetails(int TASK_ID,String TASK_DESCRIPTION){
        System.out.println("-".repeat(80));
        System.out.println("TASK ID : "+TASK_ID);
        System.out.println("TASK DESCRIPTION : "+TASK_DESCRIPTION);
        System.out.println("-".repeat(80));
    }
    
    default void print(String prompt) {
        System.out.print(prompt);
    }

    @Deprecated
    default public String getString(String message){
        System.out.print(message);
        return input.nextLine().strip();
    }
    
    public void execute();
}
