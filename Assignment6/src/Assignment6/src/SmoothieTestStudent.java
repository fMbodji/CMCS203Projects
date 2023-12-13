/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: JUnit test Student for Smoothie data element class
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {

	private Smoothie s1,s2,s3,s4;
	
	@Test
	public void testGetBasePrice()
	{
		s1 = new  Smoothie ("s1Name", Size.SMALL, 1,false );
		s2 = new  Smoothie ("s2NAme", Size.MEDIUM, 2,true );
		s3 = new  Smoothie ("s3NAme", Size.LARGE, 3, true );
		s4 = new  Smoothie ("s4NAme", Size.SMALL, 4, false );
		
		assertEquals(2.0,s1.getBasePrice(), .01);
		assertEquals(2.0,s2.getBasePrice(), .01);
		assertEquals(2,s3.getBasePrice(), .01);
		assertEquals(2,s4.getBasePrice(), .01);
	}
 
	@Test
	public void testCalPrice() {
		s1 = new  Smoothie ("s1Name", Size.SMALL, 1,false );
		s2 = new  Smoothie ("s2NAme", Size.MEDIUM, 2,true );
		s3 = new  Smoothie ("s3NAme", Size.LARGE, 3, true );
		s4 = new  Smoothie ("s4NAme", Size.SMALL, 4, false );
		
		assertEquals(2.5,s1.calcPrice(), .01 );
		assertEquals(5.5,s2.calcPrice(), .01 );
		assertEquals(7,s3.calcPrice(), .01 );
		assertEquals(4,s4.calcPrice(), .01 );
		 
	}
	@Test
	public void testToString() {
		s1 = new  Smoothie ("s1Name", Size.SMALL, 1,false );
		
		assertTrue(s1.toString().contains(s1.getBevName()));
		assertTrue(s1.toString().contains(String.valueOf(s1.calcPrice()) ));
		assertTrue(s1.toString().contains(s1.getSize().toString() ));
		assertTrue(s1.toString().contains( String.valueOf(s1.getNumOfFruits()) ));
  
	}

}
