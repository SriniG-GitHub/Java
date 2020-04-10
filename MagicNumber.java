package coreJava;

public class MagicNumber {

	public static void main(String[] args) {
//Magic Number : Number whose sum of its digits are calculated till a single digit is obtained by recursively adding the sum of its digits. If single digit obtained is 1, then the number is magic number, otherwise not.
//Eg: 19 = 1 + 9 = 10        // 10 is not a single digit number, continue adding digits   
		//1 + 0 = 1         // 19 is a Magic number
//Eg: 1891 = 1 + 8 + 9 + 1 = 19 // 19 is not a single digit number, continue adding digits   
		//1 + 9 = 10         // 10 is not a single digit number, continue adding digits 
		//1 + 0 = 1          // 1891 is a Magic number 
//Eg: 29 =2 + 9 = 11        // 11 is not a single digit number, continue adding digits   
		//1 + 1 = 2         // 29 is NOT a Magic number
//Eg: 2888 = 2 + 8 + 8 + 8 = 26// 26 is not a single digit number, continue adding digits   
		//2 + 6 = 8         // 2888 is NOT a Magic number
//Eg: 999999999 = 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 = 81// 81 is not a single digit number, continue adding digits   
		//8 + 1 = 9         // 999999999 is NOT a Magic number
		
		int inptNum = 999999999;
		int sum11 = inptNum;
		
		boolean flag = false;
		while(!flag) {
		if(String.valueOf(sum11).length()>1) {
			sum11 = MagicNumber.stringLen(sum11);
		}else {
			flag=true;
			break;
		}
	  }
		
	//System.out.println(sum11);
		
		if(sum11 == 1) {
			System.out.println("Yes, The given number is a Magic Number " + inptNum);
		}else {
			System.out.println("NO, The given number is NOT a Magic Number " + inptNum);
		}
		
} //End of Main Method
	
	public static int stringLen (int inptNum) {
		int temp=0,sum=0;
		
		while(inptNum!=0) {
			temp = inptNum%10;
			sum = sum+temp;
			inptNum = inptNum/10;
		}
		return sum;
	}

}//End of class
