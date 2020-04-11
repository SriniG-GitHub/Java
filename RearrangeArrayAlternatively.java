package coreJava;

import java.util.Arrays;

public class RearrangeArrayAlternatively {

	public static void main(String[] args) {
 //Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on...
 //Eg: Input1: [1 2 3 4 5 6] , output1: [6 1 5 2 4 3]
 //Eg: Input2: [10 20 30 40 50 60 70 80 90 100 110] , output2: [110 10 100 20 90 30 80 40 70 50 60]		

		int inputArr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};  //sorted array of positive integers
		int temp[] = new int[inputArr.length];
		
		int counter=0;
		for(int y=(inputArr.length-1);y>=0;y=y-1) {
			temp[counter] = inputArr[y];
			counter=counter+2;
			if((inputArr.length % 2) == 0) {
				if(counter == (inputArr.length)) {
					break;
				}
			}else {
				if((counter-1) == (inputArr.length)) {
					break;
				}
			}
		}
		
		int counter1=1;
		for(int y=0;y<inputArr.length;y++) {
			temp[counter1] = inputArr[y];
			counter1=counter1+2;
			if((inputArr.length % 2) == 0) {
				if((counter1-1) == (inputArr.length)) {
					break;
				}
			}else {
				if((counter1) == (inputArr.length)) {
					break;
				}
			}
		}
		
System.out.println(Arrays.toString(temp));
	
	}

}
