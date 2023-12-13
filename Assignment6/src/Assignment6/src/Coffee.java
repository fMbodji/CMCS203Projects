/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Coffee data element class
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

public class Coffee extends Beverage {
	
	private boolean extraShot;
	private boolean extraSyrup;
	
	Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup){
		super(bevName,Type.COFFEE,size);
		this.extraShot=extraShot;
		this.extraSyrup=extraSyrup;
	}

	public boolean getExtraShot() {
		return this.extraShot;
	}
	
	public boolean getExtraSyrup() {
		return this.extraSyrup; 
	}
	
	
	public boolean equals(Object anotherBev) {
		Coffee otherBev = (Coffee)(anotherBev);
		if( (this.getBevName().equals(otherBev.getBevName())) 
				&& (this.getType().equals(otherBev.getType())) 
				&& (this.getSize().equals(otherBev.getSize())) 
				&& (this.getBasePrice()==otherBev.getBasePrice())
				&& ( this.extraShot==otherBev.extraShot)
				&& (this.extraSyrup==otherBev.extraSyrup)
			)
			return true;
		return false;
	}
	
	public double calcPrice() {
		double priceCoffee = this.addSizePrice();
		if(this.extraShot==true)
			priceCoffee+=0.5;
		if(this.extraSyrup==true)
			priceCoffee+=0.5;
		return priceCoffee;
	}

	public String toString() {
		return this.getBevName() + " " + this.getSize() + " " + this.getExtraShot()+ " " + this.getExtraSyrup() + " " + this.calcPrice()  ;
	}



}
