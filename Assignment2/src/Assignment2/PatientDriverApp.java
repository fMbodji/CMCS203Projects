/*
 * Class: CMSC203 CRN 23103
 * Instructor: Ahmed Tarek
 * Description: Patient Driver App that contains the main method
 * Due: 09/26/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fatima Mbodji
*/

package Assignment2;
import java.text.*;

public class PatientDriverApp {
	
	/**
     * Main method to run the application.
     * @param args Command-line arguments (not used in this application).
     */
	public static void main(String[] args) {
		
		//Creating and initializing a Patient object 
		Patient patient = new Patient();
		patient.setFirstName("Fatima");
		patient.setMiddleName("Zahra");
		patient.setLastName("Mbodji");
		patient.setStreetAddress("123 St Denis");
		patient.setCity("Paris");
		patient.setState("France");
		patient.setZipCode(12467);
		patient.setEmergencyContactName("Papa Latyr ");
		patient.setEmergencyContactPhone("+2217723456783");
		
		//Creating and initializing the first procedure object
		Procedure p1 = new Procedure();
		p1.setNameProcedure("Eye Exam");
		p1.setDateProcedue("2023-10-04");
		p1.setNamePractitionner("Dr. Konate");
		p1.setChargesProcedure(185.68);
		
		//Creating and initializing the second procedure object
		Procedure p2 = new Procedure();
		p2.setNameProcedure("Dental Exam");
		p2.setDateProcedue("04/10/2023");
		p2.setNamePractitionner("Dr. Diagne");
		p2.setChargesProcedure(245.05);
		
		//Creating and initializing the third procedure object
		Procedure p3 = new Procedure();
		p3.setNameProcedure("Physical Exam");
		p3.setDateProcedue("04/10/2023");
		p3.setNamePractitionner("Dr. Wade");
		p3.setChargesProcedure(441.9);
		
		//Calculating and formating the total charges
		double totalCharges = calculateTotalCharges(p1, p2, p3);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String Total = fmt.format(totalCharges);
		
		//Displaying the Patient Information
		System.out.println("Patient Info: ");
		System.out.println(displayPatient(patient));
		System.out.println("");
		System.out.println(displayProcedure(p1));
		System.out.println("");
		System.out.println(displayProcedure(p2));
		System.out.println("");
		System.out.println(displayProcedure(p3));
		System.out.println("");
		System.out.println("Total charges: " + Total);
		System.out.println("");
		System.out.println("Student Name: Fatima Mbodji");
		System.out.println("MC#: MC21147087");
		System.out.println("Due Date: 26/09/2023");
		
	}
	
	/**
	 * Method for displaying the Patient information
	 * @param patient : The patient object to display information for.
	 * @return A String containing all the patient information.
	 */
	public static String displayPatient(Patient patient) {
		return patient.toString();
	}
	
	/**
	 * Method for displaying a Procedure information
	 * @param p : The procedure object to display information for.
	 * @return A String containing all the patient information.
	 */
	public static String  displayProcedure(Procedure p) {
		return p.toString();
	}
	 
	/**
	 * Method for calculating the total charges of the three procedures
	 * @param p1 : First procedure object.
     * @param p2 : Second procedure object.
     * @param p3 : Third procedure object.
     * @return The total charges of the three procedures.
	 */
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		double totalCharges= p1.getChargesProcedure() + p2.getChargesProcedure() + p3.getChargesProcedure();
		return totalCharges;
	}
		
}
