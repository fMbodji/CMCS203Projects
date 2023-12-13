/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: JUnit test Student for Order data element class
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class OrderTestStudent {

	Order order1,order2,order3,order4;
	
	@Test 
	public void testGetBeverage( )
	{
		Coffee cf = new Coffee("regular Coffee", Size.SMALL, false,false);
		Alcohol al = new Alcohol ("Mohito", Size.SMALL, false);
		Smoothie sm1 = new Smoothie("Detox", Size.MEDIUM,1,false);
		Smoothie sm2 = new Smoothie("Detox", Size.LARGE,1,false);
		
		order1 = new Order (8, Day.MONDAY, new Customer ("Mary", 22));
		order2 = new Order (12, Day.SATURDAY, new Customer ("John", 45));
		order3 = new Order (10, Day.SUNDAY, new Customer ("Kate", 21));
		
		order1.addNewBeverage("regular Coffee", Size.SMALL, false,false);
		order1.addNewBeverage("Mohito", Size.SMALL); 
		order1.addNewBeverage("Detox", Size.MEDIUM,1,false); 
		assertTrue(order1.getBeverage(0).equals(cf) );
		assertTrue(order1.getBeverage(1).equals(al) );
		assertTrue(order1.getBeverage(2).equals(sm1) );
		assertFalse(order1.getBeverage(2).equals(sm2) );
	}

	@Test
	public void testAddNewBeverage() throws NullPointerException   {
		
		order1 = new Order (8, Day.MONDAY, new Customer ("Mary", 22));
		order2 = new Order (12, Day.SATURDAY, new Customer ("John", 45));
		order3 = new Order (10, Day.SUNDAY, new Customer ("Kate", 21));
		
		assertTrue(order1.getTotalItems() == 0);
		order1.addNewBeverage("regular Coffee", Size.SMALL, false,false);
	 	assertTrue(order1.getBeverage(0).getType().equals(Type.COFFEE));
		order1.addNewBeverage("Mohito", Size.SMALL); 
		assertTrue(order1.getBeverage(1).getType().equals(Type.ALCOHOL));
		order1.addNewBeverage("Detox", Size.MEDIUM,1,false); 
		assertTrue(order1.getBeverage(2).getType().equals(Type.SMOOTHIE));
		assertTrue(order1.getTotalItems() == 3);
		
		order2.addNewBeverage("Detox", Size.MEDIUM,4,true); 
		assertTrue(order2.getBeverage(0).getType().equals(Type.SMOOTHIE));
		order2.addNewBeverage("Mohito", Size.SMALL); 
		assertTrue(order2.getBeverage(1).getType().equals(Type.ALCOHOL));
		order2.addNewBeverage("regular Coffee", Size.MEDIUM, true,false);
		assertTrue(order2.getBeverage(2).getType().equals(Type.COFFEE));
		assertTrue(order2.getTotalItems() == 3);
		 
	}
	 
	 
	@Test
	public void testCalcOrderTotal()   {
		order1 = new Order (8, Day.MONDAY, new Customer ("Mary", 22));
		order2 = new Order (12, Day.SATURDAY, new Customer ("John", 45));
		order3 = new Order (10, Day.SUNDAY, new Customer ("Kate", 21));
		
		order1.addNewBeverage("regular Coffee", Size.SMALL, false,false);
	 	order1.addNewBeverage("Mohito", Size.SMALL); 
		order1.addNewBeverage("Detox", Size.MEDIUM,1,false); 
	 
		assertEquals(7.5,order1.calcOrderTotal(),.01);
		
		order2.addNewBeverage("regular Coffee", Size.MEDIUM, true,false);
	 	order2.addNewBeverage("Mohito", Size.SMALL); 
		order2.addNewBeverage("Detox", Size.MEDIUM,4,true); 
		
		assertEquals(12.6,order2.calcOrderTotal(),.01);
		 
	}

}
