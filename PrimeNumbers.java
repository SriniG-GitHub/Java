package coreJavaPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
//Generate the list of prime numbers within the given range n.
		
		//Prime numbers from 1 to 100
		 int n=100;
		 boolean flag = false;
		 
		for(int i=0;i<=n;i++) {
			flag = displayPrime(i);
			if(flag) {
				System.out.println(i + "is Prime Number");
			}else {
				System.out.println(i + "is Not a Prime Number");
			}
		}
	}
	
	public static boolean displayPrime(int numb) {
		boolean flag = false;
		if(numb==0 || numb==1) {
			return false;
		}
		if(numb==2) {
			return true;
		}else {
			for(int y=2;y<numb;y++) {
				if((numb%y)==0) {
					flag = false;
					break;
				}else {
					flag = true;
				}	
			}
		}
	return flag;
	}
}
