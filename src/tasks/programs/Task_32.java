package tasks.programs;

import tasks.interfaces.TASK;

public class Task_32 implements TASK{
    public Task_32(){
        showDetails(32,"\n\t1.String Uppercase To Lowercase\n\t2.String Lowercase to Uppercase");
    }
    
    public void execute(){
        String str=input("Enter The String : ");
        switch(input("Enter Your Choice : ")){
            case "1" : System.out.println("LowerCased :"+str.toLowerCase());break;
            case "2" : System.out.println("UpperCased :"+str.toUpperCase());break;
        }
    }

    public static void main(String args[]){
        new Task_32().execute();
    }
}   
