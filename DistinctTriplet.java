package coreJavaPrograms;

public class DistinctTriplet {

	public static void main(String[] args) {
//Given an integer X, the task is to find the three distinct integers greater than 1 i.e. A, B and C such that (A * B * C) = X. If no such triplet exists then print -1.
//Eg: Input: X = 64 	Output: 2 4 8 	(2 * 4 * 8 = 64).  Input: X = 32    Output: -1  (No such triplet exists).  Input: X = 105 	Output: 3 5 7 	(3 * 5 * 7 = 105). 
	
		
int x = 105;
		
		boolean flag = false;
		String res="";
		l1:
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				for(int z=0;z<x;z++) {
					if((i*j*z) == x && (i>1) && (j>1) &&(z>1) && (i!=j) && (i!=z) && (j!=z)) {
						res = res+String.valueOf(i)+" "+String.valueOf(j)+" "+String.valueOf(z);
						flag = true;
						break l1;
					}
				}	
			}
		}
		
		if(flag) {
			System.out.println(res);
		}else {
			System.out.println("-1");
		}
	
	}

}
