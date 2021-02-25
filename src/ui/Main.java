package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
	
	//Atributes
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static double iterations = 0; 
	public static double changesPerIteration = 0;
	public static DecimalFormat df = new DecimalFormat("###.##");


	public static void main(String[] args) throws IOException{
		
		int numberOfCases = Integer.parseInt(br.readLine());
		System.out.println("\n");
		int i = 0;
		
		while(i<numberOfCases) {
						
			double[] sortedNums = getNumbersFromCase();
			sortedNums = bubbleSort(sortedNums);
			printOutput(sortedNums);
			
			iterations = 0;
			changesPerIteration = 0;

			i++;
		}
		br.close();
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
		
		for (int i = 1; i < array.length ; i++) {
			for (int j = 0; j < array.length-i; j++) {
				if(array[j]>array[j+1]) {
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					changesPerIteration++;
				}
				
			}
			iterations++;
		}
		return array;
	}//end bubbleSort
	
	public static void printOutput(double[] sortedNums) {
		double avearage = changesPerIteration/iterations;
		df.setRoundingMode(RoundingMode.DOWN);
		System.out.print(df.format(avearage).replace(",", ".")+"-");
		for (int i = 0; i < sortedNums.length; i++) {
			if(i!=sortedNums.length-1) {
				System.out.print(sortedNums[i]+" ");
			}else {
				System.out.println(sortedNums[i]);
			}
			
		}
	}// end printOutput
	
}
