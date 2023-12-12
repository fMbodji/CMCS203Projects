/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: TwoDimRaggedArrayUtility JUnit test for testing the methods of the data element class 
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {

	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8}}; 
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	 
	@Test
    public void testReadFile() throws FileNotFoundException {
        // Replace "YourClassName" with the actual name of the class containing the readFile method
		TwoDimRaggedArrayUtility testTwoDim = new TwoDimRaggedArrayUtility();
        File file = new File("dataSet1.txt");
        double[][] result = testTwoDim.readFile(file);
        //double[][] expected = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, }, { 6.0, 7.0, 8.0} } ;
        assertArrayEquals(dataSet1, result);
	}
	
	@Test
	void testgetTotal() {
	    double total = 36.0;
	    assertEquals(total,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
	}
	
	@Test
	void testgetColumnTotal() {
	    double columnTotal = 14;
	    assertEquals(columnTotal,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 1),.001);
	}
	
	@Test
	void testgetHighestInRowIndex() {
	    double highest = 2.0;
	    assertEquals(highest,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,2),.001);
	}
	
	@Test
	void testgetLowestInRowIndex() {
	    double lowest = 0.0;
	    assertEquals(lowest,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1,0),.001);
	}
	

	
}
	




	
	
	
	
	



