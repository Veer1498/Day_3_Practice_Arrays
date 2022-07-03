package practiceprblms;
import java.util.Arrays;

public class SmallestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] array = new int [] {10,30,20,40,60,50}; 
		 // Using Array By Sorting function
		 Arrays.sort(array);
		 System.out.println("Sorted Array is "+Arrays.toString(array));
		 int small = array[0];
		 System.out.println("The Largest Number is "+small);

	}

}
