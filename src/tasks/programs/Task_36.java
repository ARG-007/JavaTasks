package tasks.programs;

import tasks.interfaces.TASK;

public class Task_36 implements TASK{
    public Task_36(){
        showDetails(36,"\n\t1.First Occurence\n\t2.Last Occurence");
    }

    public static int firstOccOwn(String string,char target){
        for(int i=0;i<string.length();i++)
            if (string.charAt(i)==target)
                return i;
        return -1;
    }
    
    public static int lastOccOwn(String string,char target){
        for(int i=string.length()-1;i>=0;i--){
            if (string.charAt(i)==target)
                return i;
        }
        return -1;
    }

    public void execute(){
        String string = input("Enter A String : ");
        char target = input("Enter The Character To Be Searched : ").charAt(0);
        switch(input("Choose [1/2] : ")){
            case "1" : System.out.println(target +" Found At Index : "+firstOccOwn(string, target));break;
            case "2" : System.out.println("The Last Index Of "+target+" : " +lastOccOwn(string, target));break;
            default : System.out.println("Invalid Choice ");
        }
    }
    
    public static void main(String args[]){
        System.out.println(firstOccOwn("Omaiveiwa Sinderinu", 'i'));
        System.out.println("Nani?".indexOf("i"));
        System.out.println(lastOccOwn("Nani?", 'i'));
        System.out.println("Omaiveiwa Sinderinu".lastIndexOf("i"));
    }
}
