import static org.junit.Assert.*;

import org.junit.Test;

public class piApproximationTest {

	@Test
	public void testGetCircumference() {
		
		double testCircumference1 = piApproximation.getCircumference(10, 3);
		double testCircumference2 = piApproximation.getCircumference(15, 6);

		assertEquals(31.41, testCircumference1, 1.0E-5);
		assertEquals(47.12388, testCircumference2, 1.0E-5);
	}

	@Test
	public void testGetArea() {
		
		double testArea1 = piApproximation.getArea(18, 10);
		double testArea2 = piApproximation.getArea(35, 4);
		
		assertEquals(254.4690049335, testArea1, 1.0E-5);
		assertEquals(962.084375000000000, testArea2, 1.0E-5);
	}
}
