package coreJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class HackerRank_BirthdayChocolate {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		
		int d =3 , m=2 ;
		int result=0;
		
		result = birthday(s,d,m);
	    System.out.println(result);
	}
    static int birthday(List<Integer> s, int d, int m) {
     int result = 0;
     int sum=0,counter=0;
     
     for(int k=0;k<s.size();k++) {
    	 int i=k;
    	 counter=0;
    	 sum=0;
     while(counter<m) {
    	 if(i<s.size())
    	 sum = sum + s.get(i);
    	 counter++;
    	 i++;
       if(sum == d && counter==m) {
    	   result = result+1;
       }
     }
    }
     return result;

    }
}
