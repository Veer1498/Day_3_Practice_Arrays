package practiceprblms;
import java.util.*;
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        System.out.println("2D Array");
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.println("Please provide number of rows => x");
	        int x = scanner.nextInt();
	        System.out.println("Please provide number of columns => y");
	        int y = scanner.nextInt();
	       
	        int arr[][] = new int[x][y];
	        System.out.println("Please provide elements");
	        for(int i=0;i<x;i++) {
	            for(int j=0;j<y;j++) {
	                arr[i][j] = scanner.nextInt();
	            }
	        }
	       
	       
	        for(int i=0;i<x;i++) {
	            for(int j=0;j<y;j++) {
	                System.out.print(arr[i][j]+" ");
	            }
	            System.out.println();
	        }
	        scanner.close();
	}

}
