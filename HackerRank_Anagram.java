package coreJavaPrograms;

import java.util.Arrays;

public class HackerRank_Anagram {

	public static void main(String[] args) {
    String s = "dnqaurlplofnrtmh";
    int result=0;
    result = anagram(s);
    System.out.println(result);
	}
	
	static int anagram(String s) {
    int result=0;
    int len = s.length()%2;
    if(len==0) {
    	String temp1 = s.substring(0,s.length()/2);
    	String temp2 = s.substring(s.length()/2);
    	//System.out.println(temp1 + "--------------" + temp2);
    	char[] arr1 = temp1.toCharArray();
    	char[] arr2 = temp2.toCharArray();
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	//System.out.println(Arrays.toString(arr1) + "--------------" + Arrays.toString(arr2));
    	for(int i=0;i<arr1.length;i++) {
    		Arrays.sort(arr2);
    		int val = Arrays.binarySearch(arr2, arr1[i]);
    		if(val<0) {
    			result++;
    		}else {
    			arr1[i] =0;
    			arr2[val]=0;
    		}
    	}
    }else {
    	result = -1;
    }
    return result;
    }
}
