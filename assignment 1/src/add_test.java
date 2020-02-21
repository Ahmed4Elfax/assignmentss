import static org.junit.Assert.*;

import org.junit.Test;

public class add_test {

	@Test
	public void test() {
		calc test = new calc();
		int output = test.add(1, 3);
		assertEquals(4,output);
		int output2 = test.add(2, 0);
		assertEquals(2,output2);
		int output3 = test.add(-1, 3);
		assertEquals(2,output3);
		int output4 = test.add(-1, -3);
		assertEquals(-4,output4);
	}

}
