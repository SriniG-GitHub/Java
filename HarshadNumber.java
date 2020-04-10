package coreJava;

public class HarshadNumber {

	public static void main(String[] args) {
//Harshad number is also known as the Niven number. In mathematics, a Harshad number or Niven number is an integer (in base 10 or any given number base) that is divisible by the sum of its digits when written in that base.
//Eg: 200 = 2+0+0 = 2, 200/2=0.(Yes Harshad Numb).Similarly 60. 205 = 2+0+5 = 7, 205/7!=0.(Not a Harshad Numb).Similarly 85.

		int inptNumb = 205;
		int copy = inptNumb;
		int temp=0, sum=0;
		
		while(inptNumb!=0) {
			 temp=inptNumb%10;
			 sum= sum+temp;
			 inptNumb = inptNumb/10;
		}
		
		
		if((copy%sum)==0) {
			System.out.println("Yes, Given number is a Harshad Number " + copy);
		}else {
			System.out.println("No, Given number is NOT a Harshad Number " + copy);
		}
	}

}
