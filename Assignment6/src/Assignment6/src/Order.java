/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Order data element class
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

public class Order implements OrderInterface, Comparable<Order>{
	
	private int orderNo;
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	private ArrayList <Beverage> beverages ;
	
	public Order(int orderTime, Day orderDay, Customer cust) {
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = cust;
		this.beverages=new ArrayList<>();
		this.orderNo = generateOrder();
	}
	 
	public int generateOrder() {
		Random rd = new Random();
		return rd.nextInt(10000, 90000);
	}
	public int getOrderNo() {
        return this.orderNo;
    }

    public int getOrderTime() {
        return this.orderTime;
    }

    public Day getOrderDay() {
        return this.orderDay;
    }

    public Customer getCustomer() {
        return new Customer (this.cust);
    }

    @Override
	public Beverage getBeverage(int itemNo) {
    	if (itemNo >= 0 && itemNo < beverages.size()) {
            return beverages.get(itemNo);
        } else {
            return null;
        }
	} 
    
	@Override
	public boolean isWeekend() {
		if (this.orderDay==Day.SATURDAY || this.orderDay==Day.SUNDAY)
			return true;
		return false;
	}

	@Override
	public void addNewBeverage(String bevName, Size size) {
		Beverage newAlcohol = new Alcohol(bevName,size,isWeekend());
		this.beverages.add(newAlcohol);
	}

	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		Beverage newSmoothie= new Smoothie(bevName, size, numOfFruits, addProtein);
		this.beverages.add(newSmoothie);
	}
	
	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		Beverage newCoffee = new Coffee(bevName, size, extraShot, extraSyrup );
		this.beverages.add(newCoffee);
	}
	
	public int getTotalItems() {
		return this.beverages.size();
	}

	@Override
	public double calcOrderTotal() {
		double orderTotal=0.0;
		for(int i=0; i<getTotalItems(); i++)
		{
			orderTotal+=this.beverages.get(i).calcPrice();
		}
		return orderTotal;
	}

	@Override
	public int findNumOfBeveType(Type type) {
	    int numOfBevType = 0;
	    for (Beverage beverage : this.beverages) 
	    {
	        if (beverage.getType() != null && beverage.getType().equals(type)) {
	            numOfBevType++;
	        }
	    }
	    return numOfBevType;
	}

	@Override
	public int compareTo(Order o) {
		int orderNumComparison = Integer.compare(this.getOrderNo(), o.getOrderNo());
		if (orderNumComparison == 0)	
			return Integer.compare(this.getOrderTime(), o.getOrderTime());
		return orderNumComparison;
	}

	public String getBeverageDetails() {
	    StringBuilder beverageDetails = new StringBuilder();
	    for (int i = 0; i < getTotalItems(); i++) {
	        Beverage beverage = getBeverage(i);
	        beverageDetails.append("Beverage ").append(i + 1).append(": ")
	                .append("Name: ").append(beverage.getBevName()).append(", ")
	                .append("Size: ").append(beverage.getSize()).append(", ")
	                .append("Price: ").append(beverage.calcPrice()).append("\n");
	    }
	    return beverageDetails.toString();
	}
	
	public String toString() {
	    return this.orderNo + " " + this.orderTime + " " +
	            this.orderDay + "\n" +
	            "Customer: " + this.cust.getName() + ", Age: " + this.cust.getAge() + "\n" +
	            getBeverageDetails() +
	            "Order Total: " + calcOrderTotal();
	}
}
