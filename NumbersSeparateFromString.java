package coreJava;

public class NumbersSeparateFromString {

	public static void main(String[] args) {
//Extract Numbers from the given String
//Input String: 6666666666Hello55World888IamNew7Here300015
//Output: 6666666666, 55, 888, 7, 300015

		   String str = "6666666666Hello55World888IamNew7Here300015";
		   String tempNumb="", tempChar="";
		   int counter=0;
		    
			for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				tempNumb = tempNumb+String.valueOf(str.charAt(i));
				counter++;
			}else {
				tempChar = tempChar + String.valueOf(str.charAt(i));
				if(counter >= 1) {
					tempNumb = tempNumb + ", ";
					counter=0;
				}
			}
		  }
			System.out.println(tempNumb);
			
	}
}
