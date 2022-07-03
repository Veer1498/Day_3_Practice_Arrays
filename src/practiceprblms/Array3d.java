package practiceprblms;

import java.util.Scanner;

public class Array3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("3D Array");
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.println("Please provide number of rows => x");
	        int x = scanner.nextInt();
	        System.out.println("Please provide number of columns => y");
	        int y = scanner.nextInt();
	        System.out.println("Please provide number of z axis elements => z");
	        int z = scanner.nextInt();
	       
	        int arr[][][] = new int[x][y][z];
	        System.out.println("Please provide elements");
	        for(int i=0;i<x;i++) {
	            for(int j=0;j<y;j++) {
		            for(int k=0;k<z;k++) {
		            	arr[i][j][z] = scanner.nextInt();
		            }
	            }
	        }
	       
	       
	        for(int i=0;i<x;i++) {
	            for(int j=0;j<y;j++) {
		            for(int k=0;j<z;k++) {
	                System.out.print(arr[i][j][z]+" ");
		            }
		            System.out.println();
	            }
	            System.out.println();
	        }
	        scanner.close();

	}

}
