/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Property class 
 * Due: MM/DD/YYYY 
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fatima Mbodji
*/

public class Property {

	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	public Property() { 
		this.propertyName="";
		this.city="";
		this.owner="";
		this.plot= new Plot(0,0,1,1);
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName= propertyName;
		this.city= city;
		this.rentAmount= rentAmount;
		this.owner= owner;
	} 
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName= propertyName;
		this.city= city;
		this.rentAmount= rentAmount;
		this.owner= owner;
		this.plot= new Plot(x,y,width,depth);
	}
	
	public Property (Property otherProperty){
		this.propertyName= otherProperty.propertyName;
		this.city= otherProperty.city;
		this.rentAmount= otherProperty.rentAmount;
		this.owner= otherProperty.owner;
		this.plot= new Plot(otherProperty.plot);
	} 
	
	public String getPropertyName() {
		return propertyName;
	}	
	public void setPropertyName(String propertyName) {
		this.propertyName=propertyName;
	}
	
	public String getCity() {
		return city;
	}	
	public void setCity(String city) {
		this.city=city;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}	
	public void setRentAmount(double rentAmount) {
		this.rentAmount=rentAmount;
	}
	
	public String getOwner() {
		return owner;
	}	
	public void setOwner(String owner) {
		this.owner=owner;
	}
	
	public Plot getPlot() {
		return this.plot;
	}
	
	public String toString() {
		return  propertyName + "," + city + "," + owner + "," + rentAmount  ;
		//return "Name of the property: " + propertyName + ", " + "City: " + city + ", " + "Amount of the rent= " + rentAmount + ", and " + "Owner: " + owner + "." + plot.toString() ;
	}
	
	
}
