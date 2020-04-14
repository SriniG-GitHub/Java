package coreJavaPrograms;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
//Given an unsorted array of nonnegative integers, find a continuous subarray which adds to a given number.
//Eg: Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33 ==> Output: 2 and 4. (Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33.)
//	  Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7 ==> Output: 1 and 4. (Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7.)
//    Input: arr[] = {1, 4}, sum = 0 ===> Output: No subarray found. (There is no subarray with 0 sum.)
		
		int arr[] = {1, 4};
		int sum=0;
		
		int tempSum=0;
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			tempSum = tempSum+arr[i];
			for(int j=(i+1);j<arr.length;j++) {
				tempSum = tempSum+arr[j];
				if(tempSum == sum && tempSum<=sum) {
					System.out.println("Sum of elements between indices : " + i +" - " + j);
					flag = true;
					break;
				}
			}
			tempSum=0;
		}
		if(!flag) {
			System.out.println("No subarray found.");
		}
	}

}
