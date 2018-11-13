import static org.junit.Assert.*;

import org.junit.Test;

public class Input_NumbersTest {

	@Test
	public void testSum_calc() {
		int[] tester = {1,2,3,4,5};
		int sum = Input_Numbers.sum_calc(tester);
		assertEquals(15,sum);
		
		int[] tester_1 = {1,2,3,4,-90};
		int sum_1 = Input_Numbers.sum_calc(tester_1);
		assertEquals(-80,sum_1);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testProd_calc() {
		//fail("Not yet implemented");
		
		int[] tester = {1,2,3,4,5};
		int prod = Input_Numbers.prod_calc(tester);
		assertEquals(120,prod);
		
		int[] tester_1 = {1,2,3,0,12,-98};
		int prod_1 = Input_Numbers.prod_calc(tester_1);
		assertEquals(0,prod_1);
	}

	@Test
	public void testMean_calc() {
		//fail("Not yet implemented");
		int[] tester = {1,2,3,4,5};
		int mean = Input_Numbers.mean_calc(tester,Input_Numbers.sum_calc(tester));
		assertEquals(3,mean);
		
		int[] tester_1 = {-1,-2,0,1,2};
		int mean_1 = Input_Numbers.mean_calc(tester_1,Input_Numbers.sum_calc(tester_1));
		assertEquals(0,mean_1);
	}

	@Test
	public void testMax_calc() {
		//fail("Not yet implemented");
		int[] tester = {1,2,3,4,5};
		int max = Input_Numbers.max_calc(tester);
		assertEquals(5,max);
		
		int[] tester_1 = {-1,-2,0,1,2};
		int max_1 = Input_Numbers.max_calc(tester_1);
		assertEquals(2,max_1);
	}

	@Test
	public void testMin_calc() {
		//fail("Not yet implemented");
		int[] tester = {1,2,3,4,5};
		int min = Input_Numbers.min_calc(tester);
		assertEquals(1,min);
		
		int[] tester_1 = {-1,-2,0,1,2};
		int min_1 = Input_Numbers.min_calc(tester_1);
		assertEquals(-2,min_1);
	}

	@Test
	public void testVar_calc() {
		//fail("Not yet implemented");
		int[] tester = {1,1,1,1,1};
		int var = Input_Numbers.var_calc(tester,Input_Numbers.sum_calc(tester));
		assertEquals(0,var);
		
		int[] tester_1 = {2,2,2,2};
		int var_1 = Input_Numbers.var_calc(tester_1,Input_Numbers.sum_calc(tester_1));
		assertEquals(0,var_1);
	}

}
