import static org.junit.Assert.*;

import org.junit.Test;

public class Part_2_DoublesTest {

	@Test
	public void testGet_integers_from_users() {
		
//		fail("Not yet implemented");
	}

	@Test
	public void testSum_number() {
		double[] tester = {1.0,2.0,3.0,4.0,5.0};
		double sum = Part_2_Doubles.sum_number(tester);
		if (sum == 15)
		{
			System.out.println("TestPassing");
		}
		else
		{
		fail("Not yet implemented");
		}
	
		double[] tester_1 = {1.0,2.0,3.2,4.5,-90.5};
		double sum_1 = Part_2_Doubles.sum_number(tester_1);
		if (sum_1 == -79.8)
		{
			System.out.println("TestPassing");
		}
		else
		{
		fail("Not yet implemented");
		}
		}

	@Test
	public void testProduct_number() {
		double[] tester = {1.0,2.0,3.0,4.0,5.0};
		double product = Part_2_Doubles.product_number(tester);
		if (product == 120.0)
		{
			System.out.println("TestPassing");
		}
		else
		{
		fail("Not yet implemented");
		}
		
		double[] tester_1 = {0.0,2.0,3.0,4.0,-105.0};
		double product_1 = Part_2_Doubles.product_number(tester_1);
		if (product_1 == 0.0)
		{
			System.out.println("TestPassing");
		}
			
		}

	@Test
	public void testAverage_number() {
		double[] tester = {1.0,2.0,3.0,4.0,5.0};
		double mean = Part_2_Doubles.average_number(tester);
		if (mean == 3.0)
		{
			System.out.println("TestPassing");
		}
		else
		{
		fail("Not yet implemented");
		}
		
		double[] tester_1 = {0.0,3.0,3.0,4.0,-105.0};
		double average_1 = Part_2_Doubles.average_number(tester_1);
		if (average_1 == -19.0)
		{
			System.out.println("TestPassing");
		}
		else
		{
		fail("Not yet implemented");
		}
		}

	@Test
	public void testMax_number() {
		double[] tester = {0.0,2.0,3.0,4.0,-105.0};
		double max = Part_2_Doubles.max_number(tester);
		if (max == 4.0)
		{
			System.out.println("TestPassing");
		}
		else
		{
		fail("Not yet implemented");
		}
		
		double[] tester_1 = {0.0,2.0,3.0,4.0,105.0};
		double max_1 = Part_2_Doubles.max_number(tester_1);
		if (max_1 == 105.0)
		{
			System.out.println("TestPassing");
		}
		else
		{
		fail("Not yet implemented");
	    }
		}

	@Test
	public void testMin_number() {
		double[] tester = {0.0,2.0,3.0,4.0,-105.0};
		double min = Part_2_Doubles.min_number(tester);
		if (min == -105.0)
		{
			System.out.println("TestPassing");
		}
		else
		{
		fail("Not yet implemented");
		}

		double[] tester_1 = {0.0,2.0,3.0,4.0,-205.0};
		double min_1 = Part_2_Doubles.min_number(tester_1);
		if (min_1 == -205.0)
		{
			System.out.println("TestPassing");
		}
		else
		{
			fail("Not yet implemented");
		}
	}
		
	@Test
	public void testVariance_number() {
		double[] tester = {0.0,0.0,0.0,0.0,0.0};
		double var = Part_2_Doubles.variance_number(tester);
		if (var == 0.0)
		{
			System.out.println("TestPassing");
		}
		else
		{
		fail("Not yet implemented");
		}
		
		
		double[] tester_1 = {2.0,2.0,2.0,2.0,2.0};
		double var_1 = Part_2_Doubles.variance_number(tester_1);
		if (var_1 == 0.0)
		{
			System.out.println("TestPassing");
		}
		else
		{
		fail("Not yet implemented");
	}
	}
//		fail("Not yet implemented");
	
	}

