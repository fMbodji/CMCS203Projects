/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: JUnit Test Student for Day Enumerated type
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DayTestStudent {

	@Test
    public void testDayEnumValues() {
        assertEquals(Day.values().length, 7);
        for (Day day : Day.values()) {
            assertTrue(day.equals(day));
        }
    }


}
