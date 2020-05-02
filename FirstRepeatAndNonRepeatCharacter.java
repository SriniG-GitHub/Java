package coreJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatAndNonRepeatCharacter {
//How To Find First Repeated And Non-Repeated Character In A String?
//Given a string, your code must find out the first repeated as well as non-repeated character in that string. For example, if “JavaConceptOfTheDay” is the given string, then ‘J’ is a first non-repeated character and ‘a’ is a first repeated character.

public static void main(String[] args) {

    String input = "JavaConceptOfTheDay";
	
	char firstRep=' ';
	char firstNonRep=' ';
	
	Map<Character,Integer> map = new HashMap<Character, Integer>();
	for(int i=0;i<input.length();i++) {
		if(map.containsKey(input.charAt(i))) {
			map.put(input.charAt(i), map.get(input.charAt(i))+1);
		}else {
			map.put(input.charAt(i), 1);
		}
	}
	
	for(int i=0;i<input.length();i++) {
		if(map.get(input.charAt(i)) == 1) {
			firstNonRep = input.charAt(i);
			break;
		}
	}
	for(int i=0;i<input.length();i++) {
		if(map.get(input.charAt(i)) > 1) {
			firstRep = input.charAt(i);
			break;
		}
	}
	System.out.println(firstRep);
	System.out.println(firstNonRep);
	
	}
}
