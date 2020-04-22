package coreJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerRank_ServiceLane {

	public static void main(String[] args) {

	int n=8;
	int cases[][]= {{0,3},{4,6},{6,7},{3,5},{0,7}};
	int width[] = {2, 3, 1, 2, 3, 2, 3, 3};
	int result[];
	result = serviceLane(n, cases, width);
	System.out.println(Arrays.toString(result));
	
	}
	public static int[] serviceLane(int n, int[][] cases, int[] width) {
		int result[] = new int[cases.length];
		List<Integer> al;
		List<Integer> al1;
		for(int i=0;i<cases.length;i++) {
			al = new ArrayList<Integer>();
			al1 = new ArrayList<Integer>();
			for(int j=0;j<cases[i].length;j++) {
			al.add(cases[i][j]);
		}
			for(int h=al.get(0);h<=al.get(1);h++) {
				al1.add(width[h]);
			}
			Collections.sort(al1);
			result[i] = al1.get(0);
	  }
      return result;
    }
}
