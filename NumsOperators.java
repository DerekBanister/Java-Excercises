package main;
import java.util.Scanner;

public class NumsOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("Enter a number to convert it to a binary: ");
	        Scanner scanner = new Scanner(System.in);
	        int getIntNum = scanner.nextInt();

	        String getConvertedResult = convertIntToBinary(getIntNum);
	        System.out.println("Converted Binary: " + getConvertedResult);

	    }

	    static String convertIntToBinary(int numInt) {
	        if (numInt == 0)
	            return "0";

	        StringBuilder stringBuilder = new StringBuilder();

	        while (numInt > 0) {
	            int remainder = numInt % 2;
	            stringBuilder.append(remainder);
	            numInt /= 2;
	        }

	        stringBuilder = stringBuilder.reverse();
	        return stringBuilder.toString();
		
		
	}
	
}
