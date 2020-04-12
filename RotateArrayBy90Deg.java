package coreJava;

public class RotateArrayBy90Deg {

	public static void main(String[] args) {
//Given a square matrix[][] of size N x N. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.
//Eg: Input array: 1 2 3         Output array: 3 6 9
//		           4 5 6                       2 5 8 
//		           7 8 9                       1 4 7
		
		
		int[][] inputArray = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] outputArray = new int[inputArray.length][inputArray.length];
		
		System.out.println("Input array is as follows: ");
		for(int i=0;i<inputArray.length;i++) {
			for(int j=0;j<inputArray[i].length;j++) {
				System.out.print(inputArray[i][j] +"\t");
			}
			System.out.println(" ");
		}
		
		System.out.println("Output array after 90Degrees Rotation is as follows: ");
		int counter=0;
	for(int i=0;i<inputArray.length;i++) {
		counter=0;
		for(int j=(inputArray.length-1);j>=0;j--) {
			outputArray[i][counter] = inputArray[i][j];
			System.out.print(outputArray[i][counter] +"\t");
			counter++;
		}
		System.out.println(" ");
	}
	System.out.println(" ");
	
	
	for(int i=0;i<inputArray.length;i++) {
		for(int j=0;j<inputArray[i].length;j++) {
			System.out.print(outputArray[j][i] +"\t");
			//break;
		}
		System.out.println(" ");
	}
	
	}

}
