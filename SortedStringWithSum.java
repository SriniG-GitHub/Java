package coreJavaPrograms;

import java.util.Arrays;

public class SortedStringWithSum {

	public static void main(String[] args) {
//Given a string containing uppercase alphabets and integer digits (from 0 to 9), the task is to print the alphabets in the order followed by the sum of digits.
//Input1 : AC2BEW3             Output1 : ABCEW5  (Alphabets in the lexicographic order  followed by the sum of integers(2 and 3).
//Input2 : ACCBA10D2EW30       Output2 : AABCCDEW6  (Alphabets in the lexicographic order  followed by the sum of integers(1,0,2,3 and 0).
		
				String str = "ACCBA10D2EW30";
				
				int sum=0;
				String temp=" ";
				for(int i=0;i<str.length();i++) {
					if(Character.isDigit(str.charAt(i))) {
						sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
					}else {
						temp = temp+str.charAt(i);
					}
				}
				char[] arr = temp.toCharArray();
				Arrays.sort(arr);
			System.out.println(sum);
			System.out.println(Arrays.toString(arr));
			}
}
