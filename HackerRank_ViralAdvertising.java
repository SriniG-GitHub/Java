package coreJavaPrograms;

public class HackerRank_ViralAdvertising {

	public static void main(String[] args) {
     int n=5, result=0;
     result = viralAdvertising(n);
     System.out.println(result);
	}
	 public static int viralAdvertising(int n) {
      int liked=0,shred=5,cummu=0;
      for(int i=1;i<=n;i++) {
    	  liked = (int) Math.floor(shred/2);
    	  shred = liked * 3;
    	  cummu = cummu+liked;
      }
      return cummu;
  }
}
