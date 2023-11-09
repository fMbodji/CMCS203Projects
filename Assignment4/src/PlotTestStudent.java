/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Student Plot Junit test  
 * Due: MM/DD/YYYY 
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fatima Mbodji
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlotTestStudent {

	Plot plot1 = new Plot(0,0,1,1); 
	Plot plot2 = new Plot(2,6,1,8); 
	/**
	 * Test method for {@link Plot#encompasses()}.
	 */
	@Test
	void testEncompasses() {
		Boolean encompassing = plot1.encompasses(plot2);
		assertEquals(false, encompassing ); 
	}

	/**
	 * Test method for {@link Plot#overlaps()}.
	 */
	@Test
	void testOverlaps() {
		Boolean overlaping = plot1.overlaps(plot2);
		assertEquals(false, overlaping );
	}
	
	/**
	 * Test method for {@link Plot#toString()}. 
	 */
	@Test
	void testToString() {
		String plotToString = plot1.toString();
		assertEquals("0,0,1,1", plotToString );
	}
	



}
