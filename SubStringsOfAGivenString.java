package coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubStringsOfAGivenString {

	public static void main(String[] args) throws IOException {

		//SubString: Your program should take input string from the user and print it’s all possible substrings. For example, if “Java” is the input string then its all possible substrings are, 
		//J
		//Ja
		//Jav
		//Java
	    //a
		//av
		//ava
		//v
		//va
		//a
		
		System.out.println("Welcome to SubString program: ");
		System.out.print("Please enter a String to get substrings of it:: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println("The following are the substrings of the entered string: ");
		for(int j=0;j<str.length();j++) {
			for(int i=1;i<=sb.length();) {
				String subSt = sb.substring(0, i);
				System.out.println(subSt);
				i++;
			}
			sb.deleteCharAt(0);	
		}
		
	}

}
