package coreJavaPrograms;

import java.util.Arrays;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
//Reverse the given array in place. That means without any temporary array.
//Input: array = {1,2,3,4,5,6,7,8,9,10}.   Output: array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}.
		
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
	    
		for(int i=0;i<(arr.length/2);i++) {
			int temp = arr[(arr.length-1)-i];
			arr[(arr.length-1)-i] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
