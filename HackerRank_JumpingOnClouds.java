package coreJavaPrograms;

public class HackerRank_JumpingOnClouds {

	public static void main(String[] args) {
    int[] c = {0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0,1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
    int result=0;
    
    result = jumpingOnClouds(c);
    System.out.println(result);
    
	}

    public static int jumpingOnClouds(int[] c) {
     int result=0;
     
     for(int i=0;i<c.length;i=i+2) {
    	 if(c[i] == 1 && i!=0) {
    		 i = i-1;
    		 if(c[i] == 0) {
        		 result++;
        	 }
    	 }
    	 else if(c[i] == 0 && i!=0) {
    		 result++;
    	 }
     }
     if((c.length%2)==0 && (c[1]!=1)) {
    	 result = result+1;
    	 return result;
     }else {
    	 return result;
     }
    }
    
}
