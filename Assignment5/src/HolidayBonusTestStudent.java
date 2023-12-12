import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;


class HolidayBonusTestStudent {

private double[][] dataSet1 = {{10,20,30},{40},{60,70,80}}; 
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	 
	
	@Test
	void testCalculateHolidayBonus() {
		double[] bonusesArray = HolidayBonus.calculateHolidayBonus(dataSet1);
		assertEquals(3000.0, bonusesArray[0], .001);
		assertEquals(2000.0, bonusesArray[1], .001);
		assertEquals(15000.0, bonusesArray[2], .001);
	}
	
	@Test
	void testTotalCalculateHolidayBonus() {
		double result = 20000.0;
		assertEquals(result, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
		
	}
}
