package tasks.library;
import java.math.BigInteger;

public class Calculator {
    public static int addition(int a,int b){
        return a+b;
    }
    public static int subraction(int a,int b){
        return a-b;
    }
    public static int multiplication(int a,int b){
        return a*b;
    }
    public static float division(int a,int b){
        return (float) a/b;
    }
    public static int modulo(int a,int b){
        return a%b;
    }
    public static BigInteger power(int a,int b){    //previously had return type : long
        BigInteger result = BigInteger.valueOf(a);  //long result=a;
        result=result.pow(b);                       //long overflows with very big values, so jumped to BigInteger
        /*for (int i=2;i<=b;i++)                    //Previous method to calculate power (uses long)
            result*=a;*/
        return result;
    }
    public static float average(int a,int b){
        return (float) (a+b)/2;
    }
    public static double squareroot(double value) {
    	double currentsqrt,sqroot=value/2;
    	do {
    		currentsqrt=sqroot;
    		sqroot=(currentsqrt+(value/currentsqrt))/2;
    	} while ((currentsqrt-sqroot)!=0);
    	return currentsqrt;
    }
}
