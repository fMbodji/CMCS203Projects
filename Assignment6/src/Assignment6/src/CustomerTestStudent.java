/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: JUnit test Student for Customer data element class
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {
	
	private Customer cust1,cust2;
	
	@Test
	public void testCopyConstructor() {
		cust1 = new Customer("name1", 10);
		Customer cust2  = new Customer(cust1);
		
		assertFalse(cust1 == cust2);
		cust2.setName("name2");
		cust2.setAge(20);
		assertFalse(cust2.getName().equals(cust1.getName()));
		assertFalse(cust2.getAge() == cust1.getAge());
		 
	}

}
