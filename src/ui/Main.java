package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) throws IOException{
		
		double[] sortedNums = getNumbersFromCase();
		System.out.println(Arrays.toString(sortedNums));
		bubbleSort(sortedNums);
		
		//double a = 0.8;
		
	}
	
	
	//Read one line of the console and returns an array of double numbers from the input separated by an space
	public static double[] getNumbersFromCase() throws IOException {
		String[] caseX = br.readLine().split(" ");
		double[] caseXNumbers = new double[caseX.length];
		
		for (double i = 0; i < caseXNumbers.length; i++) {
			caseXNumbers[(int)i] = Double.parseDouble(caseX[(int) i]);
		}
		
		return caseXNumbers;
	}//end getNumbersFromCase
	
	//Sort an array of double numbers
	public static double[] bubbleSort(double[] array) {
		
		boolean changed = true;
		for (int i = 1; i < array.length && changed; i++) {
			changed = false;
			for (int j = 0; j < array.length-i; j++) {
				if(array[j]>array[j+1]) {
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					changed = true;
				}	
			}
		}
		return array;
	}//end bubbleSort
}
