package practiceprblms;
import java.util.*;
public class LargestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] array = new int [] {10,30,20,40,60,50}; 
		//	Using For Loops 	 
		 /* int temp =0; 
		 * for( int i = 0; i < array.length; i++){  
              for( int j = i+1; j < array.length; j++){  

                  if(array[i] > array[j]){
                	  temp = array[i];
                	  array[i] = array[j];
                	  array[j] = temp;
                  }  
              }         
          }  
    	  System.out.println("The Largest Element "+array[array.lengh-1]); */
		 
		 // Using Array By Sorting function
		 Arrays.sort(array);
		 System.out.println("Sorted Array is "+Arrays.toString(array));
		 int large = array[array.length-1];
		 System.out.println("The Largest Number is "+large);
	}

}
