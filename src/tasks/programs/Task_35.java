package tasks.programs;

import tasks.interfaces.TASK;

public class Task_35 implements TASK{
    public Task_35(){
        showDetails(35,"\n\t1.Reverse Of A String\n\t2.Pallindrome");
    }

    public static String reverseString(String string){
        char[] letters=new char[string.length()];
        for (int i = string.length()-1;i>=0;i--){
            letters[string.length()-1-i] = string.charAt(i);
        }
        return String.valueOf(letters);
    }

    public static boolean isPallindrome(String string){
        return (string.equals(reverseString(string)))?true:false;
    }

    public void execute(){
        String string = input("Enter The String : ");
        switch(input("Choose The Operation [1/2] :")){
            case "1" : System.out.println("Reversed String : "+reverseString(string));break;
            case "2" : System.out.println("Pallindrome : "+isPallindrome(string));break;
            default : System.out.println("Invalid Choice");
        }
    }

    public static void main(String args[]){
        System.out.println(reverseString("Baba Black Sheep"));
        System.out.println(isPallindrome("AMA"));
    }
}