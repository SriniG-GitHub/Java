package coreJavaPrograms;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {

	int decimal = 8;
	StringBuffer sb = new StringBuffer();
	
	while(decimal>=1) {
		sb.append(decimal%2);
	decimal = decimal/2;
	}
	System.out.print("Given Decimal Value: " + decimal + "Equivalent Binary Value: " + sb.reverse());
	}
}
