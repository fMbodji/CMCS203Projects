/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Beverage data element class
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

public abstract class Beverage {
	private String bevName;
	private Type bevType;
	private Size bevSize;
	private double BASE_PRICE=2.0;
	private double SIZE_PRICE=1.0;
	
	public Beverage(String bevName, Type bevType, Size bevSize) {
		this.bevName= bevName;
		this.bevType = bevType;
		this.bevSize = bevSize;
	}
	
	public String getBevName() {
		return this.bevName;
	}
	
	public Type getType() {
		return this.bevType;
	}
	
	public Size getSize() {
		return this.bevSize;
	}
	
	public double getBasePrice() {
		return this.BASE_PRICE;
	}
	
	public double addSizePrice() {
		double newPrice=this.BASE_PRICE;
		if(this.bevSize==Size.MEDIUM)
			newPrice+=this.SIZE_PRICE;
		else if(this.bevSize==Size.LARGE)	
			newPrice+= (2*this.SIZE_PRICE);
		return newPrice;
	}
	
	public boolean equals(Object anotherBev) {
		Beverage otherBev = (Beverage)(anotherBev);
		if( (this.bevName.equals(otherBev.bevName)) && (this.bevType.equals(otherBev.bevType)) && (this.bevSize.equals(otherBev.bevSize)) )
			return true;
		return false;
	}
	
	public abstract double calcPrice() ;
	
	public String toString() {
		return this.bevName + " " + this.bevSize;
	}
}
