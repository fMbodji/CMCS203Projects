/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: BevShop data manager class
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

import java.util.*;

public class BevShop implements BevShopInterface{
	private int numOfAlcoholicDrinksOrdered;
	private ArrayList<Order> orders;

	
	public BevShop() {
		this.numOfAlcoholicDrinksOrdered=0;
		this.orders = new ArrayList<>();
	}
	
	public int getNumOfAlcoholDrink() {
		return this.numOfAlcoholicDrinksOrdered;
	}
	
	public int getMaxNumOfFruits() {
		return BevShopInterface.MAX_FRUIT;
	} 
	
	public int getMaxOrderForAlcohol() {
		return BevShopInterface.MAX_ORDER_FOR_ALCOHOL;
	}
	
	public int getMinAgeForAlcohol() {
		return BevShopInterface.MIN_AGE_FOR_ALCOHOL;
	}
	
	public boolean isMaxFruit(int numOfFruits) {
		if(numOfFruits > getMaxNumOfFruits())
			return true;
		return false;
	}
	
	public Order getCurrentOrder() {
		int index = this.orders.size()-1;
		if(!(this.orders.isEmpty()))
			return this.orders.get(index);
		else
			return null;
	}
	
	@Override
	public int findOrder(int orderNo) {
		for(int i=0; i<this.orders.size();i++)
		{
			if(this.orders.get(i).getOrderNo() == orderNo)
				return i;
		}
		return -1;
	}
	
	@Override
	public Order getOrderAtIndex(int index) {
	    if (index >= 0 && index < orders.size()) {
	        return this.orders.get(index);
	    } else {
	        return null; //if the index is out of bounds
	    }
	}

	
	@Override
	public boolean validTime(int time) {
		if(time >= BevShopInterface.MIN_TIME &&  time <= BevShopInterface.MAX_TIME )
			return true;
		return false;
	}
	

	@Override
	public boolean eligibleForMore() {
		if(this.numOfAlcoholicDrinksOrdered < getMaxOrderForAlcohol())
			return true;
		return false;
	}

	@Override
	public boolean validAge(int age) {
		if( age > getMinAgeForAlcohol() )
			return true;
		return false;
	}

	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		Order newOrder = new Order(time, day, new Customer(customerName, customerAge));
		this.orders.add(newOrder);
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		getCurrentOrder().addNewBeverage(bevName, size, extraShot, extraSyrup);
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		getCurrentOrder().addNewBeverage(bevName,size);
	}

	@Override
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        getCurrentOrder().addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	@Override
	public double totalOrderPrice(int orderNo) {
		int index  = findOrder(orderNo);
		double totalPrice = 0.0;
		if (index!=-1)
			totalPrice= this.orders.get(index).calcOrderTotal();
		return totalPrice;
	}

	@Override
	public double totalMonthlySale() {
		double totalSale=0.0;
		for(int i=0; i<this.orders.size();i++)
			totalSale+=this.orders.get(i).calcOrderTotal();
		return totalSale;
	}

	public int totalNumOfMonthlyOrders(){
		int totalNum=0;
		for(int i=0; i<this.orders.size();i++)
			totalNum++;
		return totalNum;
	}
	
	@Override
	public void sortOrders() {
		Collections.sort(this.orders);
	}
	
	public String toString() {
	    StringBuilder str = new StringBuilder();
	    for (Order order : this.orders) 
	    {
	        str.append(order.toString()).append("\n");
	    }
	    str.append("Total Monthly Sale: ").append(totalMonthlySale());
	    return str.toString();
	}
	
}
