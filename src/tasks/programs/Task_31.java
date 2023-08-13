package tasks.programs;


import tasks.interfaces.TASK;

public class Task_31 implements TASK{
    public Task_31(){
        showDetails(31,"\n\t1.String Concatenation\n\t2.Lexographically Equal");
    }


    protected static String stringConCat(String baseString,String someString){
        return baseString.concat(" "+someString);
        //return baseString+" "+someString;
    }

    protected static int lexOrd(String baseString,String someString){
        //return baseString.compareTo(someString);

        int min = Math.min(baseString.length(), someString.length());
        for (int i=0;i<min;i++)
            if (baseString.charAt(i)!=someString.charAt(i))
                return baseString.charAt(i)-someString.charAt(i);
        return baseString.length()-someString.length();

    }

    public void execute(){
        String base=input("Enter The Base String : ");
        String some=input("Enter Another String : ");
        switch(input("Enter Your Choice [1/2] : ")){
            case "1" : {
                System.out.print("Concatenated String : "+stringConCat(base,some));
                break;
            }
            case "2" : {
                System.out.print("Lexographical Order : "+lexOrd(base, some));
                break;
            }
        }
    }

    public static void main(String args[]){
        new Task_31().execute();
    }
}
