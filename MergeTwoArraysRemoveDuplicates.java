package coreJava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeTwoArraysRemoveDuplicates {

	public static void main(String[] args) {
//Program or function which takes two integer arrays (Sorted or Unsorted) as input and merge them into single sorted array without duplicates.
//Eg : {7, -5, 3, 8, -4, 11, -19, 21} and {6, 13, -7, 0, 11, -4, 3, -5} are two unsorted integer arrays then sorted merged array without duplicates will be {-19, -7, -5, -4, 0, 3, 6, 7, 8, 11, 13, 21}.
		
		int[] arr1 = {7, -5, 3, 8, -4, 11, -19, 21};
		int[] arr2 = {6, 13, -7, 0, 11, -4, 3, -5};
		
		
		int[] result = new int[arr1.length+arr2.length];  //Combined array
		int counter=0;
		
		for(int i=0;i<arr1.length;i++) {   //First Array
			result[i] = arr1[i];
			counter++;
		}
		
		for(int i=0;i<arr2.length;i++) {  //Second Array
			result[counter] = arr2[i];
			counter++;
		}
		
		Arrays.sort(result);    //Sort the resultant array
	
		
		Set<Integer> set = new LinkedHashSet<Integer>();  //Add all the integers in resultant array to Hashset to remove duplicate items from it.
		for(int m=0;m<result.length;m++) {
			set.add(result[m]);
		}
		
		System.out.println(set);
		
	}

}
