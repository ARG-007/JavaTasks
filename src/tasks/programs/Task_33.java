package tasks.programs;

//import java.util.ArrayList;
//import java.lang.StringBuilder;


import tasks.interfaces.TASK;

public class Task_33 implements TASK{
    
    public Task_33(){
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 33;
    }

    public String getDescription() {
          return "\n\t1.Toggle Case\n\t2.Number Of Words";
    }


    public static String toggleCase(String string){
        char[] toggled = new char[string.length()];
        for(int i=0;i<string.length();i++){
            int c = string.charAt(i);
            if (c>=65 & c<=90) 
                toggled[i] = (char) (c+32);
            else if (c>=97 & c<=122) 
                toggled[i] = (char) (c-32);
            else
                toggled[i] = (char) c;               
            }
        return String.valueOf(toggled);
    }
 
    public static int wordCount(String string){
        /*
        ArrayList<String> words = new ArrayList<String>();
        char[] letters = string.toCharArray();
        StringBuilder word = new StringBuilder();
        for(Character c: letters){
            if(c==' ' || c == ',' || c == '.' || c == ';' || c == '@')
                if (word.isEmpty())
                    continue;
                else{
                    words.add(word.toString());
                    word.delete(0, word.length());
                }
            else
                word.append(c);
        }
        if(!word.isEmpty())
            words.add(word.toString());
        return words.size();
        */

        String[] wordList = string.split("[ ,.;@]+");
        return wordList.length;
    }

    public void execute(){
        String string = input("Enter A String : ");
        switch(input("Choose [1/2] :")){
            case "1":System.out.println("Toggled String :"+toggleCase(string));break;
            case "2":System.out.println("Number Of Words : "+wordCount(string));break;
            default : System.out.println("Invalid Choice");
        }
    }

    public static void main(String args[]){
        System.out.println(toggleCase("Arun@Rg"));
        System.out.println(wordCount("I am a Student@College,Programmer; Person.And Human."));
    }
}
