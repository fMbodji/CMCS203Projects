/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Alcohol data element class
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/
public class Alcohol extends Beverage {
	
	private boolean isWeekend;
	
	Alcohol(String bevName, Size size, boolean isWeekend){
		super(bevName,Type.ALCOHOL, size);
		this.isWeekend=isWeekend;
	}

	
	public boolean isWeekend() {
		return this.isWeekend;
	}
	
	public boolean equals(Object anotherBev) {
		Alcohol otherBev = (Alcohol)(anotherBev);
		if( (this.getBevName().equals(otherBev.getBevName())) 
				&& (this.getType().equals(otherBev.getType())) 
				&& (this.getSize().equals(otherBev.getSize())) 
				&& (this.getBasePrice()==otherBev.getBasePrice())
				&& (this.isWeekend==otherBev.isWeekend)
			)
			return true;
		return false;
	}
	
	public double calcPrice() {
		double priceAlcohol = this.addSizePrice();
		if(this.isWeekend==true)
			priceAlcohol+=0.6;
		return priceAlcohol;
	}

	public String toString() {
		return this.getBevName() + " " + this.getSize() + " " + this.calcPrice() ;
	}

}
