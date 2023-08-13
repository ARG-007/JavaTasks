package tasks.library;

public class Numbers {
	//Checking Pallindrome using Strings and their Build-in Functions
	public static boolean isPallindrome(int number){
		String stringNumber=String.valueOf(number);
		/*Alternate :
		String stringNumber=Integer.tostring(this.number);
		String stringNumber=""+number;
		*/
		int revNumber=Integer.parseInt( new StringBuilder(stringNumber).reverse().toString());
		return (number==revNumber)?true:false;
	}



	//While loop alternative for pallindrome :
	public static boolean isPallindromeWhile(int number){
		int rev=0,tempnum=number,rem;
		while (tempnum>0){
			rem=tempnum%10;
			rev=rev*10+rem;
			tempnum/=10;
		}
		return (rev==number)?true:false;
	}



	//Calculator Class is used for this (to get squareroot)
	public static boolean isPrime(int number){

		switch(number){
			case 0 :
			case 1 : return false;
			case 2 :
			case 3 : return true;
			default : if (number%2==0) return false;
		}

		int end=(int) Calculator.squareroot(number);//Calculator squareroot method call

		for (int i=3;i<=end;i++)
			if (number%i==0)
				return false;

		return true;
	}




	public static int countDigits(int number){

		//Converting to String and returning its length to get number of Digits
		return String.valueOf(number).length();
	}

	public static int countDigitsWhile(int number){
		int noOfDigits=0;
		while (number>0){
			number/=10;
			noOfDigits++;
		}
		return noOfDigits;
	}
	
	//Sum Of Square Of The Digits Of The Number
	public static int sumOfSquare(long number){
		int sum=0,rem;
		while(number>0){
			rem=Math.toIntExact(number%10);
			sum+=rem*rem;
			number/=10;
		}
		return sum;
	}

	public static int[] evensBetween(int a,int b){
		int start=(a%2==0)?a+2:a+1;
		int k=0;
		int evens[]=new int[(((a%2==0)?b:b+1)-a-1)/2];
		for(int i=start;i<b;i+=2){
			evens[k]=i;k++;
		}
		return evens;
	}

}

