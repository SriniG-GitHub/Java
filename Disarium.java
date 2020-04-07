package coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Disarium {

	public static void main(String[] args) throws NumberFormatException, IOException {

//A number is said to be Disarium if it is equal to sum of its digits raised to the power of their respective position in the number. For example, 135 = 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135. Similarly 175.
		
		System.out.println("Welcome to Disarium program: ");
		System.out.print("Please enter a integer number:: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int temp = n;
		int sum=0;
		String hil = String.valueOf(n);
		
		for(int i=hil.length();i>0;i--) {
			int uou = n%10;
			sum = sum + (int)(Math.pow(uou, i));
			n=n/10;
		}
		
		System.out.println("The resultant value of computation: " + sum);
		
		if(temp == sum) {
			System.out.println("The given number is a \"Disarium Number\" ");
		}else {
			System.out.println("The given number is \"NOT\" a \"Disarium Number\" ");
		}
	}

}
