import static org.junit.Assert.*;

import org.junit.Test;

public class functionEvaluationTest {

	@Test
	public void testFunctionType1() {

		int testResult1a = functionEvaluation.functionType1(3);
		int testResult1b = functionEvaluation.functionType1(4);

		assertEquals(6, testResult1a);
		assertEquals(8, testResult1b);
	}

	@Test
	public void testFunctionType2() {

		float testResult2a = functionEvaluation.functionType2(10);
		float testResult2b = functionEvaluation.functionType2(20);

		assertEquals(3.1622777, testResult2a, 1.0E-5);
		assertEquals(4.472136, testResult2b, 1.0E-5);
	}

	@Test
	public void testFunctionType3() {

		double testResult3a = functionEvaluation.functionType3(6);
		double testResult3b = functionEvaluation.functionType3(7);

		assertEquals(1.0E6, testResult3a, 1.0E-5);
		assertEquals(1.0E7, testResult3b, 1.0E-5);
	}

	@Test
	public void testFunctionType4() {

		int testResult4a = functionEvaluation.functionType4(13);
		int testResult4b = functionEvaluation.functionType4(14);

		assertEquals(2197, testResult4a);
		assertEquals(2744, testResult4b);
	}

	@Test
	public void testFunctionType5() {

		float testResult5a = functionEvaluation.functionType5(33);
		float testResult5b = functionEvaluation.functionType5(34);

		assertEquals(1.0212266, testResult5a, 1.0E-5);
		assertEquals(1.0205959, testResult5b, 1.0E-5);
	}

	@Test
	public void testFunctionType6() {

		double testResult6a = functionEvaluation.functionType6(21);
		double testResult6b = functionEvaluation.functionType6(22);

		assertEquals(1.3188157344832132E9, testResult6a, 1.0E-5);
		assertEquals(3.5849128461315875E9, testResult6b, 1.0E-5);
	}
}