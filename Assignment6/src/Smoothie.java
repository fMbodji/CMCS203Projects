/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Smoothie data element class
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/
public class Smoothie extends Beverage{
	
	private int numFruits;
	private boolean addProtein;
	
	Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein){
		super(bevName,Type.SMOOTHIE, size);
		this.numFruits=numOfFruits;
		this.addProtein=addProtein;
	}

	public int getNumOfFruits() {
		return this.numFruits;
	}
	
	public boolean getAddProtein() {
		return this.addProtein;
	} 
	
	public boolean equals(Object anotherBev) {
		Smoothie otherBev = (Smoothie)(anotherBev);
		if( (this.getBevName().equals(otherBev.getBevName())) 
				&& (this.getType().equals(otherBev.getType())) 
				&& (this.getSize().equals(otherBev.getSize())) 
				&& (this.getBasePrice()==otherBev.getBasePrice())
				&& ( this.numFruits==otherBev.numFruits)
				&& (this.addProtein==otherBev.addProtein)
			)
			return true;
		return false;
	}
	
	public double calcPrice() {
		double priceSmoothie = this.addSizePrice();
		if(this.addProtein==true)
			priceSmoothie+=1.5;
		for(int i=0; i<this.numFruits;i++)
			priceSmoothie+=0.5;
		return priceSmoothie;
	}

	public String toString() {
		return this.getBevName() + " " + this.getSize() + " " + this.getAddProtein() + " " + this.getNumOfFruits() + " " + this.calcPrice()  ;
	}


}
