/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Project number: 01
 * Description: Learning Computer SCience I using Java
 * Due: 09/12/2023
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Fatima MBODJI
*/

package Assignment1;
import java.util.*;

public class ESPGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String name, description, dueDate;
		String COLOR_RED= "Red";
		String COLOR_BLUE= "Blue";
		String COLOR_ORANGE= "Orange";
		String COLOR_PURPLE= "Purple";
		String COLOR_YELLOW= "Yellow";
		String COLOR_WHITE= "White";
		String COLOR_BLACK= "Black";
		int correctResponse=0;
		String selectedColor="";
		String guess;
		System.out.println("Hello, please enter your name: ");
		name = keyboard.nextLine();
		System.out.println("Describe yourself");
		description = keyboard.nextLine();
		System.out.println("Enter the due date: ");
		dueDate = keyboard.nextLine();
		System.out.println("CMSC 203 Assignment 1: Test your ESP Skilss ");
		System.out.println("********Starting the Game********");
		for (int i=1; i<=11; i++)
		{
			System.out.println("Round " + i);
			int randomIndex = new Random().nextInt(7);
			switch(randomIndex)
			{
			case 0: 
				selectedColor= COLOR_RED;
				break;
			case 1: 
				selectedColor= COLOR_BLUE;
				break;
			case 2: 
				selectedColor= COLOR_ORANGE;
				break;
			case 3: 
				selectedColor= COLOR_PURPLE;
				break;
			case 4: 
				selectedColor= COLOR_YELLOW;
				break;
			case 5: 
				selectedColor= COLOR_WHITE;
				break;
			case 6: 
				selectedColor= COLOR_BLACK;
				break;
			}
			//System.out.println("The selected color is:" + selectedColor);
			System.out.println("Guess which color I am thinking about?");
			System.out.println("Is it Red, Blue, Orange, Purple, Yellow, White, or Black?");
			System.out.println("Please enter your guess: ");
			guess = keyboard.next();
			while(!(guess.equalsIgnoreCase(COLOR_RED) || guess.equalsIgnoreCase(COLOR_BLUE)  || guess.equalsIgnoreCase(COLOR_ORANGE) || guess.equalsIgnoreCase(COLOR_PURPLE) || guess.equalsIgnoreCase(COLOR_YELLOW) || guess.equalsIgnoreCase(COLOR_WHITE) || guess.equalsIgnoreCase(COLOR_BLACK)))
			{
				System.out.println("Invalid color entry! Please try again: ");
				guess = keyboard.next();			}
			if(guess.equalsIgnoreCase(selectedColor))
			{
				System.out.println("Correct! I was thinking of: " + selectedColor + "\n");
				System.out.println(" ");
				correctResponse++;
			}
			else
			{
				System.out.println("Incorrect! I was thinking of: " + selectedColor);	
			}
		}
		System.out.println("********The Game is over********");
		System.out.println("You have " + correctResponse + " correct responses ");
		System.out.println("User name: " +name);
		System.out.println("User description: " +description);
		System.out.println("Due date: " +dueDate);
	}
}
