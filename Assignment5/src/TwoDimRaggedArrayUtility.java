/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Project 5
 * Due: 02/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

import java.io.*;
import java.util.*;

public class TwoDimRaggedArrayUtility {
	private double [][] twoDimRaggedArray = new double[10][10];

	public static void writeToFile(double[][] data,File outputFile) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(outputFile);
		for(int row=0; row<data.length; row++)
		{
			for(int col=0; col<data[row].length; col++)
			{
				pw.print(data[row][col] + " ");
			}
			pw.println();
		}
		pw.close();
	}
	 
	public static double[][] readFile(File file) throws FileNotFoundException{
		Scanner inputFile = new Scanner(file);
		String [][] tempArray = new String[10][10];
		int numRows=0;
		while(inputFile.hasNext() && numRows<10)
		{
			String [] elements = inputFile.nextLine().split(" ");
			tempArray[numRows] = elements;
			numRows++;
		}
		inputFile.close();
		
		//Finding out the actual number of rows
		int actualRows = 0;
        while (actualRows < numRows && tempArray[actualRows][0] != null) {
            actualRows++;
        } 
        double [][] raggedArray = new double [actualRows][];
        
        for (int row = 0; row < actualRows; row++) 
        {
            int actualColumns = 0;
            //Finding the number of column for each row
            while (actualColumns < tempArray[row].length && tempArray[row][actualColumns] != null) {
                actualColumns++;
            }
            //Creating the row i knowing the number of colum
            raggedArray[row] = new double[actualColumns];
            
            for (int col = 0; col < actualColumns; col++) {
                raggedArray[row][col] = Double.parseDouble(tempArray[row][col]);
            }
        }		
		return raggedArray;
	}
	
	public static double getTotal(double[][] data) {
		double total=0;
		for (int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				total+=data[row][col];
			}
		}
		return total;
	}
	
	public static double getAverage(double[][] data) {
		int numElements=0;
		for (int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				numElements++;
			}
		}
		double sum=getTotal(data);
		double average=sum/numElements;
		return average;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		double rowTotal=0;
		for(int col = 0; col < data[row].length; col++)
		{
			rowTotal+=data[row][col];
		}
		return rowTotal;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		double colTotal=0.0;
		for(int row = 0; row < data.length; row++)
		{
			try {
				if (col < data[row].length) {
		            colTotal += data[row][col];
				}
			}catch(Exception e) {
				System.out.println(e.getMessage()); 
			}
		}
		return colTotal;
	}
	
	public static double getHighestInRow(double[][] data,int row) {
		double highestInRow=data[row][0];
		for(int col = 0; col < data[row].length; col++)
		{
			if(highestInRow<data[row][col])
				highestInRow=data[row][col];
		}
		return highestInRow;
	} 
	
	public static int getHighestInRowIndex(double[][] data,int row) {
		double highestInRow=data[row][0];
		int highestInRowIndex=0;
		for(int col = 0; col < data[row].length; col++)
		{
			if(highestInRow<data[row][col])
			{
				highestInRow=data[row][col];
				highestInRowIndex=col;
			}	
		}
		return highestInRowIndex;
	} 
	
	public static double getLowestInRow(double[][] data,int row) {
		double lowestInRow=data[row][0];
		for(int col = 0; col < data[row].length; col++)
		{
			if(lowestInRow>data[row][col])
				lowestInRow=data[row][col];
		}
		return lowestInRow;
	} 
	
	public static int getLowestInRowIndex(double[][] data,int row) {
		double lowestInRow=data[row][0];
		int lowestInRowIndex=0;
		for(int col = 0; col < data[row].length; col++)
		{
			if(lowestInRow>data[row][col])
			{
				lowestInRow=data[row][col];
				lowestInRowIndex=col;
			}	
		}
		return lowestInRowIndex;
	} 
	
	public static double getHighestInColumn(double[][] data,int col) {
		double highestInColumn=data[0][col];
		for(int row = 0; row < data.length; row++)
		{
			if(col<data[row].length && data[row][col]>highestInColumn )
			{
				highestInColumn=data[row][col];
			}	
		}
		return highestInColumn;		
	}

	public static int getHighestInColumnIndex(double[][] data,int col) {
		double highestInColumn=data[0][col];
		int highestInColumnIndex=0;
		for(int row = 0; row < data.length; row++)
		{
			if(col<data[row].length && data[row][col]>highestInColumn )
			{
				highestInColumn=data[row][col];
				highestInColumnIndex=row;
			}	
		}
		return highestInColumnIndex;
	}	
	
	public static double getLowestInColumn(double[][] data,int col) {
		double lowestInColumn=data[0][col];
		for(int row = 0; row < data.length; row++)
		{
			if(col<data[row].length && data[row][col]<lowestInColumn )
			{
				lowestInColumn=data[row][col];
			}	
		}
		return lowestInColumn;		
	}

	public static int getLowestInColumnIndex(double[][] data,int col) {
		double lowestInColumn=data[0][col];
		int lowestInColumnIndex=0;
		for(int row = 0; row < data.length; row++)
		{
			if(col<data[row].length && data[row][col]<lowestInColumn )
			{
				lowestInColumn=data[row][col];
				lowestInColumnIndex=row;
			}	
		}
		return lowestInColumnIndex;
	}
	
	public static double getHighestInArray(double[][] data) {
		double highestInArray=data[0][0];
		for (int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				if(highestInArray<data[row][col])
					highestInArray=data[row][col];	
			}
		}	
		return highestInArray;
	}
	
	public static double getLowestInArray(double[][] data) {
		double lowestInArray=data[0][0];
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				if(lowestInArray>data[row][col])
					lowestInArray=data[row][col];
			}		
		}
		return lowestInArray;		
	}
	
}

