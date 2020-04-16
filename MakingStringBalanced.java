package coreJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class MakingStringBalanced {

	public static void main(String[] args) {
//Minimum number of additons to make the string balanced : Given a string str of lowercase characters, the task is to find the minimum number of characters that need to added to the string in order to make it balanced. A string is said to be balanced if and only if the number of occurrences of each of the characters is equal.
//Eg: Input: str = “geeksforgeeks” .  Output: 15  (Add 2 ‘g’, 2 ‘k’, 2 ‘s’, 3 ‘f’, 3 ‘o’ and 3 ‘r’). Input: str = str = “abcd” .  Output: 0  (The string is already balanced.). 

		String input = "geeksforgeeks";
		boolean flag=false;
		
		Map <Character,Integer> map = new HashMap<Character, Integer>();  //Map to find the frequncies of all the keys intially.
		for(int i=0;i<input.length();i++) {
			if(map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i))+1);
			}else {
				map.put(input.charAt(i), 1);
			}
		}
		
		int maxVal =map.get(input.charAt(0)); 
		Character maxKey=' ';
		for(Map.Entry<Character,Integer> set : map.entrySet()) {      //Loop to find the max frequency key in the map.
			Character key = set.getKey();
			int val = set.getValue();
			if(val>maxVal) {
				flag = true;
				maxKey = key;
				maxVal = val;
			}
		}
		
		map.remove(maxKey);	    //Remove the max frequency key as it is not required.
		
		int counter=0;
		for(Map.Entry<Character,Integer> set : map.entrySet()) {      //Do the sum with remainig values to get the required count.
			int val = set.getValue();
			if(val<maxVal) {
				int temp = maxVal - val;
				counter = counter + temp;
			}
		}
		
		if(flag) {
			System.out.println(counter);	
		}else {
			System.out.println("0 - The string is already balanced. ");
		}
	}
}
