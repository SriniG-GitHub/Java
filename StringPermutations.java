package coreJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

	public static void main(String[] args) {
//Input1 : String: "abc", Output: character combinations of given string (3!) = 3*2=6combinations. [acb, bca, abc, cba, bac, cab].
//Input2 : String: "abb", Output: contains duplicate combinations of given string. Hence using set to get unique [abb, bba, bab]
		
		String input = "abb";
		String result="";
		Set<String> set = new HashSet<String>();    //Create a set for removing duplicates
		set = combinations(input,result,set);
		System.out.println(set);		
	}
	
	public static Set<String> combinations(String input,String result,Set<String> set){
		if(input.length()==0) {
			set.add(result);
			return set;
		}
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			String temp = input.substring(0,i) + input.substring(i+1);
			combinations(temp , result+c, set);
		}
		return set;
	}
}
