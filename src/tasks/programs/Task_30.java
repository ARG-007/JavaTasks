package tasks.programs;

import tasks.interfaces.TASK;


class StringOps{
    String string;

    protected void getString(){
        System.out.print("Enter The String  : ");
        string = TASK.input.nextLine();
    }

    /*
    protected int stringLengthNotGood(){
        int length = 0;
        for (char c:string.toCharArray())
            length++;
        return length;
    }
    */

    protected int stringLengthBad(){ //The method is in realm of arange(Bad,worst,0.1)
        int length = 0;
        while(true){
            try {                     //charAt actually checks if the index excedes length of the byte Array LOL
                string.charAt(length);//checking until this gives out a exception(unchecked-
                length++;             // eventhough I am doing this purposly)
            }
            catch(StringIndexOutOfBoundsException str){//Abusing exceptions
                return length;
            }
        }
    }

    protected int stringLengthGood(){
        return string.length();//returns the byte array length
    }

    protected String stringCopyBad(){ 
        String copy = new String(string); //Inefficient Because It Creates Extra Object in heep
        return copy;//string == copy will return false
    }
}


public class Task_30 extends StringOps implements TASK{
    public Task_30 (){
        showDetails(30,"\n\t1.Length Of The String\n\t2.Copy String");
    }

    public void execute(){
        getString();
        System.out.print("Enter Your Selection [1\\2]: ");
        switch(Integer.parseInt(input.nextLine())){
            case 1 : System.out.println(String.format("Length Of The String : %d",stringLengthGood()));break;
            case 2 : {
                //Simple But Efficient Approach Because Of Immutability
                //When Original Is Changed It(Original) Simply Refers/Points To New Object ("Whatever In this quotes") in String pool
                //Since 'copied' Is still Refering to it(string literal in pool) JVM Garbage Collection Doesn't Destroy the Original Object
                String copied = string;

                System.out.println("Copied String! : "+copied);
                System.out.println("Is it's Refering To Same Instance ? : "+ (string==copied));
                break;}
            default : System.out.println("Wrong Choice !");
        }
    }

    public static void main(String args[]){
        TASK tsk = new Task_30();
        tsk.execute();
    }
}
