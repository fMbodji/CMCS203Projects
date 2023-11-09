/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Student Management Company Junit test  
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

class ManagementCompanyTestStudent{

	ManagementCompany myManagementCo = new ManagementCompany("ABC","MG123",46.98); 
 
	/**
	 * Test method for {@link ManagementCompany#getName()}.
	 */
	@Test
	void testGetName() {
		String name = myManagementCo.getName() ;
		assertEquals("ABC", name ); 
	}
	
	/**
	 * Test method for {@link ManagementCompany#getMgmFeePer()}.
	 */
	@Test
	void testGetMgmFeePer() {
		double mgmFeepercentage = myManagementCo.getMgmFeePer() ;
		assertEquals(46.98, mgmFeepercentage); 
	}
	
	/**
	 * Test method for {@link ManagementCompany#isPropertiesFull()}.
	 */
	@Test
	void testIsPropertiesFull() {
		boolean full = myManagementCo.isPropertiesFull();
		assertEquals(false, full); 
	}
	
	/**
	 * Test method for {@link ManagementCompany#addProperty()}.
	 */
//	@Test
//	void testAddProperty() {
//		Property sampleProperty = new Property("Property_A", "Germantown", 2335.87, "Fatima");
//		int result = myManagementCo.addProperty(sampleProperty);
//		assertEquals(result, -1);
//	}
	
	



	



}


