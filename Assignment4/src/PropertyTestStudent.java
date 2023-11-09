/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Student Property Junit test  
 * Due: MM/DD/YYYY 
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fatima Mbodji
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
	
	Property property_A = new Property("Property A","Silver Spring",2245.0,"Fatima");  
	/**
	 * Test method for {@link Property#getPropertyName()}.
	 */
	@Test
	void testGetPropertyName() {
		String propertyName = property_A.getPropertyName();
		assertEquals("Property A", propertyName ); 
	}

	/** 
	 * Test method for {@link Property#getRentAmount}.
	 */
	@Test
	void testGetRentAmount() {
		double rent = property_A.getRentAmount();
		assertEquals(2245.00, rent);
	}
	
	/**
	 * Test method for {@link Property#toString()}. 
	 */
	@Test
	void testToString() {
		assertEquals("Property A,Silver Spring,Fatima,2245.0",property_A.toString());		}
	
}
