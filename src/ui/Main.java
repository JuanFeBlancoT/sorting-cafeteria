package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	//Atributes
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static double iterations = 0; 
	public static double changesPerIteration = 0;
	
	public static void main(String[] args) throws IOException{
		
		double[] sortedNums = getNumbersFromCase();
		
		System.out.println(Arrays.toString(sortedNums));
		
		sortedNums = bubbleSort(sortedNums);
		
		printOutput(sortedNums);
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
					changesPerIteration++;
				}
			}
		iterations++;
		}
		return array;
	}//end bubbleSort
	
	public static void printOutput(double[] sortedNums) {
		double avearage = Math.round((changesPerIteration/iterations) * 100) / 100d;
		System.out.print(avearage+"-");
		for (int i = 0; i < sortedNums.length; i++) {
			if(i!=sortedNums.length-1) {
				System.out.print(sortedNums[i]+" ");
			}else {
				System.out.print(sortedNums[i]);
			}
			
		}
		iterations = 0;
		changesPerIteration = 0;
	}// end printOutput
	
}
