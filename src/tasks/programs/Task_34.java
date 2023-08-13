package tasks.programs;


import tasks.interfaces.TASK;

public class Task_34 implements TASK{
    public Task_34(){
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 34;
    }

    public String getDescription() {
          return "\n\t1.Count Of Vowel and Consonent\n\t2.Number Of Words";
    }

    public static int[] countVowelConsonent(String string){
        int[] count = {0,0};

        for (Character c:string.toCharArray())
            if (c == 'A' || c=='E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count[0]++;
            else if (Character.isLetter(c))
                count[1]++;
            else
                continue;
        return count;
    } 

    public void execute(){
        String string = input("Enter A String : ");
        switch(input("Enter Your Choice : ")){
            case "1" : {
                int[] counts = countVowelConsonent(string);
                System.out.println("Vowels : "+counts[0]+" Consonents : "+counts[1]);
                break;
            }

            case "2" : System.out.println("Number Of Words : "+Task_33.wordCount(string));break;
            default : System.out.println("Invalid Choice");
        }
    }

    public static void main(String args[]){
        int[] counts = countVowelConsonent("aeioucnstnt;;;;");
        System.out.println(counts[0]+" "+counts[1]);
    }
}
