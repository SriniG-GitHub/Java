package coreJavaPrograms;

import java.util.Arrays;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
//Find The First Non Repeated Character In A String. Asked in Amazon. 
//Input: "stress". Output: 't'.
//Input: "teeter". Output: 'r'.
		
		String input = "stress";
		char output=' ';
		int[] freq = new int[input.length()];
		
		for(int i=0;i<input.length();i++) { //Calculate Frequency of occurrence of each character in given string.
			char temp = input.charAt(i);
			int count=0;
			for(int j=0;j<input.length();j++) {
				if(temp == input.charAt(j)) {
					count++;
					freq[i] = count;
				}
			}
		}
		
		for(int i=0;i<freq.length;i++) {  //From frequency array find the value whose first value is 1.
			if(freq[i] == 1) {
				output = input.charAt(i);
				break;
			}
		}
		
		System.out.println("Final Result is : " + output);
	}

}
