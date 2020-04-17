package coreJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class WordBreakProblem {

	public static void main(String[] args) {

	//Word Break Problem: Given a string and a dictionary of words, determine if string can be segmented into a space-separated sequence of one or more dictionary words.
		
	String[] dictionary = {"this", "th", "is", "famous", "Word", "break", "b", "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem"};
	String input = "Wordbreakproblem";
	String result = "";
	
	Set<String> set = new HashSet<String>();
	for(int i=0;i<dictionary.length;i++) {
		set.add(dictionary[i]);
	}
	WordBreakProblem.wordBreak(set, input, result);
	}
	
	public static void wordBreak(Set<String> set, String input, String result) {
		if(input.length() == 0) {
			System.out.println(result);
			return;
		}
		
		for(int i=1;i<=input.length();i++) {
			String prefix = input.substring(0, i);
			if(set.contains(prefix)) {
				wordBreak(set, input.substring(i), result + " " + prefix);   //Using Recursion
			}
		}
	}
	
}
