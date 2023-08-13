package tasks.programs;

import tasks.interfaces.TASK;

public class Task_27 implements TASK {
    public Task_27(){
        showDetails(27,"Find Whether N is the power of K");
    }

    public boolean isaPowerOf(int N,int K){
        if (N==1){
            System.out.print("The Exponent Is : 0\n");
            return true;
        }
        if (K==1)
            return false;

        int exponent=1;
        while(N!=K){
            N/=K;
            exponent++;            
            if (N==0)
                return false;
        }
        System.out.print("The Exponent is : "+exponent+"\n");
        return true;
    }

    public void execute(){
        int n,k;
        System.out.print("Enter N and K : ");
        n=input.nextInt();
        k=input.nextInt();input.nextLine();
        System.out.print("N is a Power Of K ? : "+isaPowerOf(n, k));
    }

    public static void main(String args[]){
        new Task_27().execute();
    }
}
