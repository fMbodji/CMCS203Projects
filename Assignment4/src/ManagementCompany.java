/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Management Company class 
 * Due: MM/DD/YYYY 
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fatima Mbodji
*/

import java.util.*;

public class ManagementCompany {

	static final int MAX_PROPERTY=5;
	static final int MGMT_DEPTH=10;
	static final int MGMT_WIDTH=10;
	private String name;
	private String taxID;
	private double mgmFee;
	private ArrayList <Property> properties ;
	private Plot plot;
	private int numberOfProperties;
	
	
	public ManagementCompany() {
		name="";
		taxID="";
		this.plot= new Plot(0,0,MGMT_DEPTH,MGMT_WIDTH);
		properties = new ArrayList<>() ;
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name= name;
		this.taxID= taxID;
		this.mgmFee= mgmFee;
		this.plot= new Plot(0,0,MGMT_DEPTH,MGMT_WIDTH);
		properties = new ArrayList<>() ;
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name= name;
		this.taxID= taxID;
		this.mgmFee= mgmFee;
		this.plot= new Plot(x,y,width,depth);
		properties = new ArrayList<>() ;
	}
	
	public ManagementCompany (ManagementCompany otherManagementCompany) {
		this.name = otherManagementCompany.name;
		this.taxID = otherManagementCompany.taxID;
		this.mgmFee = otherManagementCompany.mgmFee; 
		this.plot= otherManagementCompany.plot;
		this.properties = new ArrayList<>(otherManagementCompany.properties) ;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getTaxID() {
		return this.taxID;
	}
	
	public double getMgmFeePer() {
		 double mgmFeePer = (this.mgmFee/100) * 100;
		 return mgmFeePer;
	}
	
	public Plot getPlot() {
		return this.plot;
	}
	
	public Property[] getProperties() {
		Property [] propertiesArray = new Property [properties.size()];
		propertiesArray=properties.toArray(propertiesArray);
		return propertiesArray;
	} 
	
	public int getPropertiesCount() {
		this.numberOfProperties = properties.size();
;		return this.numberOfProperties;
	}
	
	public double getTotalRent() { 
		double totalRent=0;
		for(int i=0; i<properties.size(); i++)
		{
			totalRent+= properties.get(i).getRentAmount();
		}
		return totalRent;
	}
	
	public Property getHighestRentProperty() {
		Property highestRentProperty = properties.get(0) ;
		for(int i=1; i<properties.size(); i++)
		{  
			if (highestRentProperty.getRentAmount() < properties.get(i).getRentAmount())
				highestRentProperty = properties.get(i); 
		}
		return highestRentProperty; 
	}
	
	public int addProperty(String propertyName, String city, double rentAmount, String owner) {
		Property property = new Property(propertyName, city, rentAmount, owner); //using the first Property constructor
		properties.add(property);
		 
		if(properties.size()>=MAX_PROPERTY)
			return -1;
		if(property==null)
			return -2;
		
		if(this.plot.encompasses(property.getPlot())==false) 
			return -3;

		 for (Property existingProperty : properties) 
		 {
		       if (existingProperty.getPlot().overlaps(property.getPlot())) 
		       {
		            return -4;
		       }
		 }
		 
		 return properties.size()-1;
	}
	
	public int addProperty(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		Property property = new Property(propertyName, city, rentAmount, owner, x, y, width, depth); //using the second Property constructor
		properties.add(property);
		
		if(properties.size()>=MAX_PROPERTY)
			return -1;
			 
		if(property==null)
			return -2;
		
		if(this.plot.encompasses(property.getPlot())==false) 
			return -3;
		
		
		for (Property existingProperty : properties) 
		{
		       if (existingProperty.getPlot().overlaps(property.getPlot()))
		       {
		            return -4;
		       }
		}
		
		return properties.size()-1;
	}
	
	public int addProperty(Property property) {
		Property anotherProperty = new Property(property); //using the Property Copy constructor
		properties.add(anotherProperty);
		
		if(properties.size()>=MAX_PROPERTY)
		{
			return -1;
		}
			 
		if(property==null)
			return -2;
		
		if(this.plot.encompasses(property.getPlot())==false) 
		{
			return -3;
		}
		
		for (Property existingProperty : properties) 
		{
		       if (existingProperty.getPlot().overlaps(property.getPlot())) 
		       {
		            return -4;
		       }
		}

		return  properties.size()-1;
	}
	
	public void removeLastProperty() {
		properties.remove(properties.size()-1);
	}
	
	public boolean isPropertiesFull() {
		if(properties.size() == MAX_PROPERTY)
			return true;
		else
			return false;
	}
	
	public boolean isManagementFeeValid() {
		if(mgmFee>=0 && mgmFee<=100)
			return true;
		else
			return false;
	}
	
	public String toString() {
	    StringBuilder str = new StringBuilder();
	    // Management Company information
	    str.append("Management Company: ").append("Name: ").append(name)
	       .append(", Tax ID: ").append(taxID)
	       .append(", Management Fee: ").append(mgmFee)
	       .append("\n");
	    // Property information
	    for (Property property : properties) {
	    	str.append("Property: ").append("Name: ").append(property.getPropertyName())
	    	   .append(", City: ").append(property.getCity())
	           .append(", Owner: ").append(property.getOwner())
	           .append(", Rent Amount: ").append(property.getRentAmount())
	           .append("\n");
	    }
	    return str.toString();
	}

	
	
	
	


}
