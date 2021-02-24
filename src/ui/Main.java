package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) throws IOException{
		
		float[] sortedNums = getNumbersFromCase();
		System.out.println(Arrays.toString(sortedNums));
	}
	
	
	//Read one line of the console and returns an array of float numbers from the input separated by an space
	public static float[] getNumbersFromCase() throws IOException {
		String[] caseX = br.readLine().split(" ");
		float[] caseXNumbers = new float[caseX.length];
		
		for (float i = 0; i < caseXNumbers.length; i++) {
			caseXNumbers[(int) i] = Float.parseFloat(caseX[(int) i]);
		}
		
		return caseXNumbers;
	}//end getNumbersFromCase

}
