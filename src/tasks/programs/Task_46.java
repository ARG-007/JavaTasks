package tasks.programs;

import tasks.interfaces.TASK;



public class Task_46 implements TASK{
    public Task_46(){
        showDetails(46, "Reversing Vowels In a String");
    }

    public static boolean isVowel(char c) {
        switch(c) {
            case 'A': case 'E': case 'I': case 'O': case 'U':
            case 'a': case 'e': case 'i': case 'o': case 'u':
            return true;
        }
        return false;
    }

    @Override
    public void execute() {
        char[] s = input("Enter The String Whose Vowels To Be Reversed : ").toCharArray();

        int i=0, j=s.length-1;

        while(i!=j) {
            if(!isVowel(s[i])) {
                i++;
                continue;
            }
            if(!isVowel(s[j])) {
                j--;
                continue;
            }

            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];

            i++;
            j--;
        }

        print(String.valueOf(s));
    }

    public static void main(String[] args) {
        new Task_46().execute();
    }
    
}
