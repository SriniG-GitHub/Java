package coreJavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 
public class HackerRank_EqualizaTheArray {

	public static void main(String[] args) {
		int[] arr = {36, 12, 60, 99, 78, 33, 4, 21, 22, 9, 12, 21, 34, 76, 21, 3, 3, 37, 65, 27, 21, 42, 11, 14, 21, 88, 46, 63, 79, 6, 37, 94, 99, 68, 76, 6, 21, 86, 49, 56, 22, 90, 74, 83, 20, 21, 94, 60, 76, 75, 96, 99, 92, 65, 77, 26, 51, 21, 77, 22, 97, 34, 56};
		
int result=0;
result = equalizeArray(arr);
System.out.println(result);
	}
	
	
	public static int equalizeArray(int[] arr) {
int result = 0;
Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for(int i=0;i<arr.length;i++) {
	if(map.containsKey(arr[i])) {
		map.put(arr[i], map.get(arr[i])+1);	
	}else {
		map.put(arr[i],1);	
	}
}

int maxKey=0;
int maxVal = map.get(arr[0]);
for(Map.Entry<Integer, Integer> set : map.entrySet()) {
	int key = set.getKey();
	int val = set.getValue();
	if(val>=maxVal) {
		maxKey = key;
		maxVal = val;
	}
}

Set<Integer> set = map.keySet();
Iterator<Integer> it = set.iterator();
while(it.hasNext()) {
	int keyo = it.next();
	if(keyo!=maxKey)
	result = result + map.get(keyo);
}
return result;

    }
}
