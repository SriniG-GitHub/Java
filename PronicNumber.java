package coreJava;

public class PronicNumber {

	public static void main(String[] args) {

//Pronic number is a number which is the product of two consecutive integers i.e n(n+1).They are also called Oblong numbers or Heteromecic numbers.
//Eg: 2 = 1 x 2
//    6 = 2 x 3
//	  12 = 3 x 4
//    20 = 4 x 5
//	  30 = 5 x 6
//	  42 = 6 x 7
//	  56 = 7 x 8
//	  72 = 8 x 9
//	  90 = 9 x 10
			
		int num = 10;
		boolean flag = false;
		
			for(int i=0;i<num;i++) {
				int res = i * (i+1);
				if(res == num) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println(num + " is a pronic number");
			}else {
				System.out.println(num + " is NOT a pronic number");
			}
	}

}
