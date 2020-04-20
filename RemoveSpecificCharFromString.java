package coreJavaPrograms;

public class RemoveSpecificCharFromString {

	public static void main(String[] args) {
//To remove specific characters in the String .For example,
//	Input:  "Alive is awesome"     and string to Remove: "alwsr"  then Output:  "ive i eome".
//  Input:  "Learning never stops" and string to Remove: "estp"   then Output:  "Larning nvr o" as output".
		
		String input = "AliveR isL awesomeWS";
		String remove = "alwsr";
		
		for(int i=0;i<remove.length();i++) {
			if(Character.isLetter(input.charAt(i)) || input.charAt(i)==' ') {
				input = ReplaceTheChar(input,remove,remove.charAt(i));
			}else {
				System.out.println("Not a Alphabetic Character");
				break;
			}
		}
		
		System.out.println("Final Result is: " + input);
	}
	
	
	public static String ReplaceTheChar(String input,String remove, char i) {  //Method to replace the character in input string (Both LowerCase and UpperCase).
		char ch = Character.toUpperCase(i);  //To UpperCase
		input = input.replace(ch, '.');
		input = input.replaceAll("\\.", "");
    	ch = Character.toLowerCase(i);      //To LowerCase
		input = input.replace(ch, '.');
		input = input.replaceAll("\\.", "");
		return input;
	}

}
