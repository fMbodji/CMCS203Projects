/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: JUnit Test Student for Type Enumerated type
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
import org.junit.Test;

public class TypeTestStudent {

    @Test
    public void testTypeEnumValues() {
        assertEquals(Type.values().length, 3);
        for (Type type : Type.values()) {
            assertTrue(type.equals(type));
        }
    }


}

 