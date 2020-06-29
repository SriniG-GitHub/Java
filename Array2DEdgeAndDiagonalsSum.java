package coreJavaPrograms;

public class Array2DEdgeAndDiagonalsSum {

	
	public static void main(String[] args) {

// Take 2-D array and compute sum of all its Boundary values and sum of both forward and backward diagonals.
//Eg: Input Array = 1 2 3 4  Output : 30 (Boundary : 1+2+3+4+4+4+4+3+2+1+1+1 = 20 && Diagonals : 2+3+2+3=10). Input Array: 1 2 3 Output : 18 (Boundary : 1+2+3+3+3+2+1+1 = 16 && Diagonals :2 =2).
//		            1 2 3 4                                                                                                1 2 3
//		            1 2 3 4                                                                                                1 2 3
//		            1 2 3 4                                                                                                
		      
		int arr[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
		
		//Logic to display given matrix 2-D
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
		
		int temp =0, diag=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==0 || i==(arr.length-1) || j==0 || j==(arr.length-1)) {   //Logic to get sum of boundary values.
					temp = temp + arr[i][j];
				}
				
				else {
					if(i==j || i==(arr.length-1-j)) {   //Logic to get sum of both Forward Diagonal and Backward Diagonal values.
						diag = diag + arr[i][j];
					}
				}
			}
		}
		
	System.out.println("Final Result : " + (temp+diag));
	}

}
