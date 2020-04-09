package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CommonCharBetweenTwoStrings {

	public static void main(String[] args) {
    //which takes two strings as input and print common characters between them in alphabetical order. For example, if "thin sticks" and "thick bricks" are two given input strings then common characters between them in alphabetical order are [c, h, i, k, s, t].
		
	String s1 = "thin sticks";
	String s2 = "thick bricks";
	
	String comm="";   //Holds common characters between 2 strings
	for(int i=0;i<s1.length();i++) {
		for(int j=0;j<s2.length();j++) {
			if(s1.charAt(i)==s2.charAt(j)) {
				comm = comm+s1.charAt(i);
			}
		}
	}
	
Set <Character> set = new HashSet<Character>(); //Create set to remove duplicates from common string
for(int i=0;i<comm.length();i++) {
	if(comm.charAt(i)!=' ') {
		set.add(comm.charAt(i));	
	}
}


List<Character> list = new ArrayList<Character>();   //Convert set to list to sort it
Iterator<Character> it = set.iterator();
while(it.hasNext()) {
	list.add(it.next());
}


    Collections.sort(list);  //Sort the list in Ascending order
	System.out.println(list);

	

	}
}
