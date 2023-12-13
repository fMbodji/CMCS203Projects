/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: JUnit test Student for Coffee data element class
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

class CoffeeTestStudent {

	private Coffee coffee1,coffee2,coffee3,coffee4;
	
	
//	@Before 
//	public void setUp() throws Exception {
//		coffee1 = new  Coffee ("Coffee 1", Size.SMALL, false,false );
//		coffee2 = new  Coffee ("Coffee 2", Size.MEDIUM, true,true );
//		coffee3 = new  Coffee ("Coffee 3", Size.LARGE, false, true );
//		coffee3 = new  Coffee ("coffee 4", Size.SMALL, true, false );
//		
//	}
//
////	@After
////	public void tearDown() throws Exception {
////		coffee1=coffee2=coffee3=coffee4=null; 
////	}
	
	@Test
	public void testGetBasePrice()
	{
		coffee1 = new  Coffee ("Coffee 1", Size.SMALL, false,false );
		coffee2 = new  Coffee ("Coffee 2", Size.MEDIUM, true,true );
		coffee3 = new  Coffee ("Coffee 3", Size.LARGE, false, true );
		coffee3 = new  Coffee ("coffee 4", Size.SMALL, true, false );
		
		assertEquals(2.0,coffee1.getBasePrice(), .01);
		assertEquals(2.0,coffee2.getBasePrice(), .01);
		assertEquals(2.0,coffee3.getBasePrice(), .01);
	}

	@Test
	public void testCalPrice() {
		coffee1 = new  Coffee ("Coffee 1", Size.SMALL, false,false );
		coffee2 = new  Coffee ("Coffee 2", Size.MEDIUM, true,true );
		coffee3 = new  Coffee ("Coffee 3", Size.LARGE, false, true );
		
		assertEquals(2,coffee1.calcPrice(), .01 );
		assertEquals(4,coffee2.calcPrice(), .01 );
		assertEquals(4.5,coffee3.calcPrice(), .01 );
		 
	}
	
	@Test
	public void testToString() {
		coffee1 = new  Coffee ("Coffee 1", Size.SMALL, false,false );
		
		assertTrue(coffee1.toString().contains(coffee1.getBevName()));
		assertTrue(coffee1.toString().contains(String.valueOf(coffee1.calcPrice()) ));
		assertTrue(coffee1.toString().contains(coffee1.getSize().toString() ));
	 
	}
	

}
