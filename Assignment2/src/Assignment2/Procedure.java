/*
 * Class: CMSC203 CRN 23103
 * Instructor: Ahmed Tarek
 * Description: Data Element Class Procedure with its attributes and methods
 * Due: 09/26/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fatima Mbodji
*/

package Assignment2;

public class Procedure {
	private String nameProcedure;
	private String dateProcedure;
	private String namePractitionner;
	private double chargesProcedure;
	
	//no-arg constructor
	public Procedure(){
		
	}
	
	//parameterized constructors
	public Procedure(String nameProcedure, String dateProcedure){
		this.nameProcedure= nameProcedure;
		this.dateProcedure = dateProcedure;
	}
	
	public Procedure(String nameProcedure, String dateProcedure, String namePractitionner, double chargesProcedure){
		this.nameProcedure= nameProcedure;
		this.dateProcedure = dateProcedure;
		this.namePractitionner= namePractitionner;
		this.chargesProcedure = chargesProcedure; 
	}
	
	//Getters and Setters
	 public void setNameProcedure(String nameProcedure) {
		 this.nameProcedure = nameProcedure ;
	 }
	 public String getNameProcedure() {
		 return nameProcedure ;
	 }
	
	 public void setDateProcedue(String dateProcedure) {
		    this.dateProcedure = dateProcedure;
	 }
	 public String getDateProcedure() {
		 return dateProcedure ;
	 }
	 
	 public void setNamePractitionner(String namePractitionner) {
		 this.namePractitionner = namePractitionner;
	 }
	 public String getNamePractitionner() {
		 return namePractitionner ;
	 }
	 
	 public void setChargesProcedure(double chargesProcedure) {
		 this.chargesProcedure = chargesProcedure;
	 }
	 public double getChargesProcedure() {
		 return chargesProcedure ;
	 }
	
	//Other Methods
	 public String toString() {
		 return "\t Procedure: " + nameProcedure + "\n" + "\t ProcedureDate: " + dateProcedure + "\n" + "\t Practitionner: " +namePractitionner  + "\n" + "\t Charge: " + chargesProcedure ;
	 }
	
	
}
