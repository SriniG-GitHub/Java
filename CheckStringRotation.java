package coreJavaPrograms;

public class CheckStringRotation {
//Check Whether One String Is Rotation Of Another? If s1 and s2 are two given strings, then write a java program to check whether s2 is a rotated version of s1?
//Eg: Input: JavaJ2eeStrutsHibernate , Output: StrutsHibernateJavaJ2ee  (Actually output can be any of the three: StrutsHibernateJavaJ2ee (or) J2eeStrutsHibernateJava (or) HibernateJavaJ2eeStruts")
	
	public static void main(String[] args) {
String input = "JavaJ2eeStrutsHibernate";
String output = "StrutsHibernateJavaJ2ee";
boolean flag = false;

String temp = input + input;
if(input.length() == output.length() && temp.indexOf(output)>=0) {
	if(temp.indexOf(output)>=0) {
		flag = true;
	}
}
if(flag) {
	System.out.println("Yes, given string is an string rotation");
}else {
	System.out.println("No, given string is an string rotation");
}
	}

}
