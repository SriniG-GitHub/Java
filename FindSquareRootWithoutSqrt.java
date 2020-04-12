package coreJavaPrograms;

public class FindSquareRootWithoutSqrt {

	public static void main(String[] args) {
//Find SquareRoot of a number without using Math.Sqrt() Method
		
		int numb = 625;
		
		
		//Method - 1   --> For Some reason count of odd numbers sum is equal to sqrt of given numb. Eg: 25 = 1+3+5+7+9 = (5 Odd numbers) = 25.
		int temp=0,counter=0;
		for(int i=1;i<numb;i=i+2) {
			temp = temp+i;
			counter++;
			if(temp==numb) {
				break;
			}
		}
	System.out.println("Square root of given number is : " + counter);
		
		
		
		//Method - 2
		
		for(int i=0;(i*i)<=numb;i++) {
			if((i*i) == numb) {
			  System.out.println("Square root of given number is : " + i);
			  break;
			}
		}

		
	}//End of Main
}//End of class
