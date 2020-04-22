package coreJavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HackerRank_DesignerPDFViewer {

	public static void main(String[] args) {
		int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		String word = "abc";
		int result=0;
		result = designerPdfViewer(h , word);
	    System.out.println(result);
	}
	
	static int designerPdfViewer(int[] h, String word) {		//Ascci Value : 'a'-97 --> 'b-'122
		int result=0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int[] remp = new int[word.length()];
		int counter = 0;
		int key=0;
		for(int i=97;i<=122;i++)
			map.put(i,h[counter++]);
		for(int i=0;i<word.length();i++) {
			 key = (int)(word.charAt(i));
		     remp[i]=map.get(key);}
		Arrays.sort(remp);
		result = result + (remp[remp.length-1] * word.length());
		return result;
    }

}
