package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArrayElementsByFrequency {

	public static void main(String[] args) {

		//integer array as input and sort array elements in descending order of their frequency. [ 1 1 1 1 7 7 7 3 3 4 4 5 9 ]
	int arr[] = {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};
	
//Create a Map to calculate frequency	
Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for(int i=0;i<arr.length;i++) {
	if(map.containsKey(arr[i])) {
		map.put(arr[i], map.get(arr[i])+1);
	}
	else {
		map.put(arr[i], 1);
	}
}

List<Integer> lis1 = new ArrayList<Integer>();  //List to add frequencies/values
List<Integer> lis2 = new ArrayList<Integer>();  //List to add its corresponding keys

for(Map.Entry<Integer, Integer> set : map.entrySet()) {
	int val = set.getValue();
    lis1.add(val);	
}

Collections.sort(lis1, Collections.reverseOrder());   //Sort and Reverse the frequencies/values list in descending order


int i=0;
while(arr.length != lis2.size()) {
	for(Map.Entry<Integer, Integer> set : map.entrySet()) {
		int key = set.getKey();
		int val = set.getValue();
		if(lis1.size()!=0) {
			if(lis1.get(i) == val) {
		    	lis1.remove(i);
		    	for(int y=0;y<val;y++) {
		    		lis2.add(key);
		    	}
		    i=0;
		    }
		}
	}	
}


System.out.println("Resultant Sorted array elements in descending order of their frequency: " + lis2);
	}

}
