package coreJavaPrograms;


import java.util.Arrays;

public class SortedStringWithSum2 {

	public static void main(String[] args) {
		//Given a string containing uppercase alphabets and integer digits (from 0 to 9), the task is to print the alphabets in the order followed by the sum of digits.
		//Input1 : AC2BEW3             Output1 : ABCEW5  (Alphabets in the lexicographic order  followed by the sum of integers(2 and 3).
		//Input2 : ACCBA10D2EW30       Output2 : AABCCDEW42  (Alphabets in the lexicographic order  followed by the sum of integers(10,2 and 30).
				
						String str = "ACCBA10D2EW30";
						
						int sum=0;String val="";
						String temp=" ";
						for(int i=0;i<str.length();i++) {
							if(Character.isDigit(str.charAt(i))) {
								val = findNumbers(str,i);
								sum = Integer.parseInt(val)+sum;
								if (val.length() == 1)
								i=i+val.length()-1;
							}else {
								temp = temp+str.charAt(i);
							}
						}
						char[] arr = temp.toCharArray();
						Arrays.sort(arr);
					System.out.println(sum);
					System.out.println(Arrays.toString(arr));
					}
	public static String findNumbers(String str, int i) {
		String val="";
			while (Character.isDigit(str.charAt(i))) {
			val = val+String.valueOf(str.charAt(i));
			if(i<str.length()-1)
			i++;
			else
				break;
		  }
		return val;
	}
}
