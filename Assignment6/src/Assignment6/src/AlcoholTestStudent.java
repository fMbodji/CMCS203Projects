/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: JUnit Test Student for Alcohol data element class
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlcoholTestStudent {
	Alcohol a1 , a2 ,a3, a4;
 
	@Before
	public void setUp() throws Exception {
		a1 = new  Alcohol ("Alcohol 1", Size.LARGE, true );
		a2 = new  Alcohol ("Alcohol 2", Size.MEDIUM, true );
		a3 = new  Alcohol ("Alcohol 3", Size.SMALL, false );
		
	}

	@After
	public void tearDown() throws Exception {
		a1=a2=a3=null;
	}
	
	@Test
	public void testGetBasePrice()
	{
		assertEquals(2.0,a1.getBasePrice(), .01);
		assertEquals(2.0,a2.getBasePrice(), .01);
		assertEquals(2.0,a3.getBasePrice(), .01);
	}
 
	@Test
	public void testCalPrice() {
		assertEquals(4.6,a1.calcPrice(), .01 );
		assertEquals(3.6,a2.calcPrice(), .01 );
		assertEquals(2,a3.calcPrice(), .01 );
	}
	
	@Test
	public void testEquals() {
		a4 = new  Alcohol ("Alcohol 2", Size.MEDIUM, true );
		assertTrue(a2.equals(a4));
	}
		
	
	@Test
	public void testToString() {
		
		assertTrue(a1.toString().contains(a1.getBevName()));
		assertTrue(a1.toString().contains(String.valueOf(a1.calcPrice()) ));
		assertTrue(a1.toString().contains(a1.getSize().toString() ));	 
	}
	

	

}