import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	//Random rd = new Random();
		Gradebook exam1;
		Gradebook exam2;
		Gradebook finalExam;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		exam1 = new Gradebook(5);
		exam2 = new Gradebook(5);
		finalExam = new Gradebook(5);
		exam1.addScore(78.0);
		exam1.addScore(85.5);
		exam1.addScore(93.0);
		exam2.addScore(67.0);
		exam2.addScore(70.0);
		exam2.addScore(59.0);
		finalExam.addScore(65.0);
		finalExam.addScore(68.0);
		finalExam.addScore(82.0);
//		for(int i=0; i<5; i++)
//		{
//			exam1.addScore(rd.nextDouble(50,101));
//			exam2.addScore(rd.nextDouble(50,101));
//			finalExam.addScore(rd.nextDouble(50,101));
//		}
		
	}

	@AfterEach
	void tearDown() throws Exception {
		 exam1 = exam2 = finalExam = null;
	}

	@Test
	void testAddScore() {
		assertTrue(true,exam1.toString());
		assertEquals(3, exam1.getScore());
	}
	@Test
	void testSum() {
		assertEquals(256.5, exam1.sum());
	}
	
	@Test
	void testMinimum() {
		assertEquals(78.0, exam1.minimum());
	}
	
	@Test
	void testFinalScore() {
		assertEquals(178.5, exam1.finalScore());
	}
	
}
