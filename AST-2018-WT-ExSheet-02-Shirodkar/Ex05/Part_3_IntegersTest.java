import static org.junit.Assert.*;

import org.junit.Test;

public class Part_3_IntegersTest {

	@Test
	public void testPrime() {
//		Part_3_Integers list = new Part_3_Integers();
		Part_3_Integers.prime(200);
		Part_3_Integers.prime(20);
		
		do {
			Part_3_Integers.prime(1234123123);
//			System.out.println("Not yet implemented");
			
			Part_3_Integers.prime(-2);
//			System.out.println("Not yet implemented");
		}while(1+1 == 3);
//		fail("Not yet implemented");
	}

	@Test
	public void testTime_calculator() {
//		Part_3_Integers list1 = new Part_3_Integers();
		if (Part_3_Integers.time_calculator(12345)/1000>1000000 && Part_3_Integers.time_calculator(12345)/1000<90000000)
		{
			System.out.println("TestPassing");
		}
		else
		{
			System.out.println("TestFailing");
		}
//		fail("Not yet implemented");
	}


}
