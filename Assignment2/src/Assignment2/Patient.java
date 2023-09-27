/*
 * Class: CMSC203 CRN 23103
 * Instructor: Ahmed Tarek
 * Description: Data Element Class Patient with its attributes and methods
 * Due: 09/26/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fatima Mbodji
*/

package Assignment2;

public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state; 
	private int zipCode;
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhone;

	//no-arg constructor
	public Patient(){
		
	}
	
	//parameterized constructors
	public Patient(String firstName, String middleName, String lastName){
		this.firstName= firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state,int zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone){
		this.firstName= firstName;
		this.middleName = middleName;
		this.lastName= lastName;
		this.streetAddress = streetAddress; 
		this.city = city; 
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhone = emergencyContactPhone;
	}
	
	//Getters and Setters
	 public void setFirstName(String firstName) {
		 this.firstName = firstName ;
	 }
	 public String getFirstName() {
		 return firstName ;
	 }
	
	 public void setMiddleName(String middleName) {
		    this.middleName = middleName;
	 }
	 public String getMiddleName() {
		 return middleName ;
	 }
	 
	 public void setLastName(String lastName) {
		 this.lastName = lastName;
	 }
	 public String getLastName() {
		 return lastName ;
	 }
	 
	 public void setStreetAddress(String streetAddress) {
		 this.streetAddress = streetAddress;
	 }
	 public String getStreetAddress() {
		 return streetAddress ;
	 }
	 
	 public void setCity(String city) {
		 this.city = city;
	 }
	 public String getCity() {
		    return city;
	 }

	 public void setState(String state) {
		 this.state = state;
	 }
	 public String getState() {
		 return state ;
	 }
	 
	 public void setZipCode(int zipCode) {
		 this.zipCode = zipCode;
	 }
	 public int getZipCode() {
		 return zipCode ;
	 }
	 
	 public void setPhoneNumber(String phoneNumber) {
		 this.phoneNumber = phoneNumber;
	 }
	 public String getPhoneNumber() {
		 return phoneNumber ;
	 }
	 
	 public void setEmergencyContactName(String emergencyContactName) {
		 this.emergencyContactName = emergencyContactName;
	 }
	 public String getEmergencyContactName() {
		 return emergencyContactName ;
	 }
	 
	 public void setEmergencyContactPhone(String emergencyContactPhone) {
		 this.emergencyContactPhone = emergencyContactPhone;
	 }
	 public String getEmergencyContactPhone() {
		 return emergencyContactPhone ;
	 }
	 
	 //Other Methods
	 public String buildFullName() {
		 return "   Name: " + firstName + " " + middleName + " " + lastName;
	 }
	 
	 public String buildAddress() {
		return "   Address: " + streetAddress + ", " + city + ", " + state  + ", " + zipCode;
	 }
	 
	 public String buildEmergencyContact() {
		 return "   Emergency Contact: " + emergencyContactName + " " + emergencyContactPhone;
	 }
	 
	 public String toString() {
		 return buildFullName() + "\n" + buildAddress() + "\n" + buildEmergencyContact();
	 }

	
}
