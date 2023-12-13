/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: JUnit Test Student for Beverage data element class
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class BeverageTestStudent {

    @Test
    public void testCalcPrice() {
        // Create a sample Beverage for testing
        Beverage beverage = new Coffee("Coffee", Size.SMALL, false,false );
        double result = beverage.calcPrice();
        assertEquals(result, beverage.calcPrice(), 0.01);
    }

    @Test
    public void testEquals() {
        // Create two identical beverages
        Beverage beverage1 = new Alcohol("Alcohol", Size.SMALL, false );
        Beverage beverage2 = new Alcohol("Smoothie", Size.SMALL,false );
        assertFalse(beverage1.equals(beverage2));
    }


}
