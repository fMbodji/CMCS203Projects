/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: JUnit Test Student for beverageShop data manager class
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

class BevShopTestStudent {
	
	BevShop beverageShop  = new BevShop();

	@Test
	public void testValidTime()
	{
		assertTrue(beverageShop.validTime(8));
		assertTrue(beverageShop.validTime(23));
		assertFalse(beverageShop.validTime(7));
		assertFalse(beverageShop.validTime(24));
	}
	 
	@Test
	public void testValidAge()
	{
		assertFalse(beverageShop.validAge(21));
		assertTrue(beverageShop.validAge(27));
	}
	
	@Test
	public void testStartNewOrder()
	{
		beverageShop.startNewOrder(12,Day.TUESDAY,"Fatima", 22);
		assertEquals(12, beverageShop.getCurrentOrder().getOrderTime());
		assertEquals(Day.TUESDAY, beverageShop.getCurrentOrder().getOrderDay());
		assertEquals("Fatima", beverageShop.getCurrentOrder().getCustomer().getName());
		assertEquals(22, beverageShop.getCurrentOrder().getCustomer().getAge());
		assertEquals(0,beverageShop.getNumOfAlcoholDrink());
		assertTrue(beverageShop.getCurrentOrder().getTotalItems() == 0);
	
	}
	
	@Test
	public void testProcessAlcoholOrder()
	{
		beverageShop.startNewOrder(12,Day.FRIDAY,"Fatima", 22);
		beverageShop.processAlcoholOrder("Beer", Size.MEDIUM);
		assertTrue(beverageShop.getCurrentOrder().getTotalItems() == 1);
		assertTrue(beverageShop.getCurrentOrder().getBeverage(0).getBevName().equals("Beer"));
		assertTrue(beverageShop.getCurrentOrder().getBeverage(0).getSize().equals(Size.MEDIUM));
		assertTrue(beverageShop.getCurrentOrder().getBeverage(0).getType().equals(Type.ALCOHOL));	
		assertTrue(beverageShop.eligibleForMore());
		
		beverageShop.processAlcoholOrder("Wine", Size.LARGE);
		assertTrue(beverageShop.getCurrentOrder().getTotalItems() == 2);
		assertTrue(beverageShop.getCurrentOrder().getBeverage(1).getBevName().equals("Wine"));
		assertTrue(beverageShop.getCurrentOrder().getBeverage(1).getSize().equals(Size.LARGE));
		assertTrue(beverageShop.getCurrentOrder().getBeverage(1).getType().equals(Type.ALCOHOL));	
		assertTrue(beverageShop.eligibleForMore());
		
		beverageShop.processAlcoholOrder("Cider", Size.SMALL);
		assertTrue(beverageShop.getCurrentOrder().getTotalItems() == 3);
		assertTrue(beverageShop.getCurrentOrder().getBeverage(2).getBevName().equals("Cider"));
		assertTrue(beverageShop.getCurrentOrder().getBeverage(2).getSize().equals(Size.SMALL));
		assertTrue(beverageShop.getCurrentOrder().getBeverage(2).getType().equals(Type.ALCOHOL));	
		assertEquals(1,beverageShop.totalNumOfMonthlyOrders());
		
	}
	
	@Test
	public void testProcessSmoothieOrder()
	{
		beverageShop.startNewOrder(12,Day.FRIDAY,"Fatima", 22);
		assertTrue ( beverageShop.isMaxFruit(8) );
		assertFalse ( beverageShop.isMaxFruit(5) );
		beverageShop.processSmoothieOrder("Strawberry", Size.MEDIUM, 1, false);
		assertTrue(beverageShop.getCurrentOrder().getTotalItems() == 1);
		
		Smoothie sm = (Smoothie) beverageShop.getCurrentOrder().getBeverage(0);
		
		assertTrue(beverageShop.getCurrentOrder().getBeverage(0).getBevName().equals("Strawberry"));
		assertTrue(beverageShop.getCurrentOrder().getBeverage(0).getSize().equals(Size.MEDIUM));
		assertTrue(beverageShop.getCurrentOrder().getBeverage(0).getType().equals(Type.SMOOTHIE));
		
	}
	
	@Test
	public void testProcessCoffeeOrder()
	{
		Coffee cf;
		beverageShop.startNewOrder(9,Day.MONDAY,"Fatima", 22);
		beverageShop.processCoffeeOrder("americano", Size.LARGE, true, false);
		assertTrue(beverageShop.getCurrentOrder().getTotalItems() == 1);
		
		cf = (Coffee) beverageShop.getCurrentOrder().getBeverage(0);
		assertTrue(beverageShop.getCurrentOrder().getBeverage(0).getBevName().equals("americano"));
		assertTrue(beverageShop.getCurrentOrder().getBeverage(0).getSize().equals(Size.LARGE));
		assertTrue(beverageShop.getCurrentOrder().getBeverage(0).getType().equals(Type.COFFEE));
		assertTrue(cf.getExtraShot()); 
		assertFalse(cf.getExtraSyrup()); 		
	}
	
	@Test
	public void testFindOrder()
	{
	 
		int orderNum;
		beverageShop.startNewOrder(9,Day.THURSDAY,"Fatima", 22);
		beverageShop.processCoffeeOrder("americano", Size.SMALL, true, false);
		beverageShop.processCoffeeOrder("Cappuccino", Size.LARGE, false, false);
		beverageShop.processSmoothieOrder("Morning SunShine", Size.LARGE, 4, true);
		
		orderNum = beverageShop.getCurrentOrder().getOrderNo(); 
		
		beverageShop.startNewOrder(8,Day.SUNDAY,"John", 30);
		beverageShop.processSmoothieOrder("Detox", Size.SMALL, 1, false);
		
		assertEquals(0,beverageShop.findOrder(orderNum));
		
		orderNum = beverageShop.getCurrentOrder().getOrderNo();
		assertEquals(1,beverageShop.findOrder(orderNum));	
	}
	
	@Test
	public void testTotalOrderPrice()
	{
	 	int orderNum1,orderNum2;
		
		beverageShop.startNewOrder(8,Day.MONDAY,"Kate", 20);
		beverageShop.processCoffeeOrder("americano", Size.SMALL, true, false); 
		beverageShop.processCoffeeOrder("Cappuccino", Size.LARGE, false, false);
		beverageShop.processCoffeeOrder("Latte", Size.LARGE,true, true);
		
		orderNum1 = beverageShop.getCurrentOrder().getOrderNo();
		
		beverageShop.startNewOrder(8,Day.SUNDAY,"John", 30);
		beverageShop.processSmoothieOrder("Detox", Size.SMALL, 1, false);
	
		orderNum2 = beverageShop.getCurrentOrder().getOrderNo();
	 
		assertEquals(11.5,beverageShop.totalOrderPrice(orderNum1),.01);
		assertEquals(2.5,beverageShop.totalOrderPrice(orderNum2),.01 );
		
	}
	@Test
	public void testTotalMonthlySale()
	{
		beverageShop.startNewOrder(8,Day.MONDAY,"Kate", 20);
		beverageShop.processCoffeeOrder("americano", Size.SMALL, true, false); 
		beverageShop.processCoffeeOrder("Cappuccino", Size.LARGE, false, false);
		beverageShop.processCoffeeOrder("Latte", Size.LARGE,true, true);
	
		beverageShop.startNewOrder(8,Day.SUNDAY,"John", 30);
		beverageShop.processSmoothieOrder("Detox", Size.SMALL, 1, false);
		beverageShop.processAlcoholOrder("Mohito", Size.SMALL);
		
		beverageShop.startNewOrder(12,Day.SATURDAY,"Amy", 43);
		beverageShop.processSmoothieOrder("Detox", Size.MEDIUM, 4, true);
		beverageShop.processCoffeeOrder("Latte", Size.SMALL,false, false);		 

	 
		assertEquals(25.1, beverageShop.totalMonthlySale(), .01 );
 
	}
	
	@Test
	public void testSortOrders()
	{
		beverageShop.startNewOrder(8,Day.MONDAY,"Kate", 20);
		beverageShop.startNewOrder(8,Day.SUNDAY,"John", 30);
		beverageShop.startNewOrder(12,Day.SATURDAY,"Amy", 43);
		
		beverageShop.sortOrders();
		assertTrue(beverageShop.getOrderAtIndex(0).getOrderNo()< beverageShop.getOrderAtIndex(1).getOrderNo());	 
		assertTrue(beverageShop.getOrderAtIndex(1).getOrderNo()< beverageShop.getOrderAtIndex(2).getOrderNo());
		
	}@Test
	public void testToString() {
		
		beverageShop.startNewOrder(8,Day.MONDAY,"Kate", 20);
		beverageShop.processCoffeeOrder("americano", Size.SMALL, true, false); 
		beverageShop.processCoffeeOrder("Cappuccino", Size.LARGE, false, false);
		 
	
		beverageShop.startNewOrder(8,Day.SUNDAY,"John", 30);
		beverageShop.processSmoothieOrder("Detox", Size.SMALL, 1, false);
			  
		 
		assertTrue(beverageShop.toString().contains( String.valueOf(beverageShop.getOrderAtIndex(0).getOrderNo()) ));
		assertTrue(beverageShop.toString().contains(beverageShop.getOrderAtIndex(0).getCustomer().getName()) );
		assertTrue(beverageShop.toString().contains(beverageShop.getOrderAtIndex(0).getBeverage(0).getSize().toString()) )  ;
		assertTrue(beverageShop.toString().contains(beverageShop.getOrderAtIndex(0).getBeverage(0).getBevName()) );
		
	 	
		assertTrue(beverageShop.toString().contains( String.valueOf(beverageShop.getOrderAtIndex(1).getOrderNo()) ));
		assertTrue(beverageShop.toString().contains(beverageShop.getOrderAtIndex(1).getCustomer().getName()) );
		assertTrue(beverageShop.toString().contains(beverageShop.getOrderAtIndex(1).getBeverage(0).getSize().toString()) )  ;
		assertTrue(beverageShop.toString().contains(beverageShop.getOrderAtIndex(1).getBeverage(0).getBevName()) );
		
		assertTrue(beverageShop.toString().contains( String.valueOf(beverageShop.totalMonthlySale() )  ));
		
 
	}

}
