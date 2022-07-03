package practiceprblms;
import java.util.*;
public class FindFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] array = new int [] {1,2,1,1,4,3,2,6,5};  
	        int [] frequency = new int [array.length];  
	        int repeat = -1;  

	        for(int i = 0; i < array.length; i++){  
	                int count = 1;  

	                for(int j = i+1; j < array.length; j++){  

	                    if(array[i] == array[j]){  
	                        count++;  
	                        //To avoid counting same element again  
	                        frequency[j] = repeat;  
	                    }  
	                }  
	                if(frequency[i] != repeat)  
	                    frequency[i] = count;  
	            }  

	        for(int i = 0; i < frequency.length; i++)
	            {  
	                if(frequency[i] != repeat)  
	                System.out.println( array[i] + " is repeated for " + frequency[i]+" times");              
	             }  

	}

}
