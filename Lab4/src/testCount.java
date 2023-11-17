import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testCount {
	TwoDimArrayPractice practice = new TwoDimArrayPractice();
	int [] [] twoDArray = new int[2][3]; 

	@BeforeEach
	void setUp() throws Exception {
		twoDArray[0][0]=2;
		twoDArray[0][1]=3;
		twoDArray[0][2]=2;
		twoDArray[1][0]=4;
		twoDArray[1][1]=2;
		twoDArray[1][2]=2;
	}

	@AfterEach
	void tearDown() throws Exception {
		twoDArray = null;
	}

	@Test
	void testCount() {
		int num=0;
		for(int row=0; row<twoDArray.length; row++)
		{
		   for (int column=0; column<twoDArray[row].length; column++)
		   {
			   if(twoDArray[row][column]==2)
				   num++;
		   }
		 }
		assertEquals(num,4);
	}

}
