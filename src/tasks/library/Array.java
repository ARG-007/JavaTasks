package tasks.library;
import java.util.Scanner;

public class Array {
	static Scanner input=new Scanner(System.in);
	public int numarray[];
	public int n;

	public Array(int n) {
		numarray=new int[n];
		this.n=n;
	}

	public Array(int[] array) {
		numarray=array.clone();
		n=array.length;
	}

	public void getArray() {
		System.out.print("Enter The Elements : ");
		for (int i=0;i<n;i++)
			numarray[i]=input.nextInt();
		input.nextLine();//To consume leftovers
	}

	public void printWithIndex(String Delimiter){
		for (int i=0;i<n;i++){
			System.out.print(numarray[i]+" "+i+Delimiter);
		}
	}
	
	public int sumupto(int upto) {
		if (n<upto)
			return 0;
		int sum=0;
		for (int i=0;i<upto;i++)
			sum+=numarray[i];
		return sum;
	}

	public int[] rightShift(int k){
		int[] rsArray=new int[n];
		//The First 'k' elements of right shifted array is last 'k' elements of original array
		for (int i=0;i<k;i++)
			rsArray[i]=numarray[i+(n-k)];

		//The remaining elements from original array are assigned in order
		for (int i=0;i<n-k;i++)
			rsArray[i+k]=numarray[i];
		return rsArray;
	}

	public int secSmallestElement(){
		if (n<2){
			return numarray[0];
		}
		
		if (n==2){
			return (numarray[0]<numarray[1])?numarray[1]:numarray[0];
		}

		int f=Integer.MAX_VALUE,s=Integer.MAX_VALUE;

		for (int i = 0;i<n;i++){
			
			if (numarray[i]<f){
				s=f;
				f=numarray[i];
			}

			else if (numarray[i]<s && numarray[i]>f)
				s=numarray[i];
		}

		if (s==Integer.MAX_VALUE)
			return f;
			
		return s;
	}

	public static void  rotate(int[] array, int pivot) {
		for(int i=0, l=array.length, j;i<pivot;i++) {

			int carry = array[i], temp;
			j=(i+pivot);
			
			while (j<l) {
				temp = array[j];
				array[j] = carry;
				carry = temp;
				j = (j+pivot);
			}
			
			array[i] = carry;
		}
	}

}
