package coreJavaPrograms;

public class HackerRank_SaveThePrisoner {

	public static void main(String[] args) {
        int n=3,m=7,s=3,result=0;
        
        result = saveThePrisoner(n, m, s);
        System.out.println(result);
	}
	
	 public static int saveThePrisoner(int n, int m, int s) {
		 int seat=s;
         for(int i=m-1;i>=1;i--) {
        	 if(seat>=n) {
        		 seat = 1;
        		 continue;
        	 }
        	 seat++;
         }
     return seat;
         
         
//Both above and below code works. Above code complexity is higher and below code is much efficient without loops.    
//			int r = m % n;
//			if ((r + s - 1) % n == 0) {
//				return n;
//			} else {
//				return ((r + s - 1) % n);
//			}

    }
}
