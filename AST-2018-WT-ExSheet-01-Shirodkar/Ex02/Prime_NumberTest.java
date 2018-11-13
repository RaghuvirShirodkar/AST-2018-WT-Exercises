import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class Prime_NumberTest {

	@Test
	public void testPrime() {
		Prime_Number list = new Prime_Number();
		list.prime(101);
		list.prime(20);
		
		do {
			list.prime(1234123123);
			System.out.println("Not yet implemented");
			
			list.prime(-2);
			System.out.println("Not yet implemented");
		}while(1+1 == 2);
	}
}