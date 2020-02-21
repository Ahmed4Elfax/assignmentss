import static org.junit.Assert.*;

import org.junit.Test;

public class divide_test {

	@Test
	public void test() {
		calc test = new calc();
		float output;
	try {
		output = test.divide(2, 0) ;
		assertEquals(0, output, 0);
	}
	catch(Exception e) {}
	try {
		output = test.divide(7, 2) ;
		assertEquals(3.5, output, 0);
	}
	catch(Exception e) {}
	try {
		output = test.divide(-5, 2) ;
		assertEquals(-2.5, output, 0);
	}
	catch(Exception e) {}
	try {
		output = test.divide(0, 2) ;
		assertEquals(0, output, 0);
	}
	catch(Exception e) {}
	try {
		output = test.divide(1, 3) ;
		assertEquals(0.333, output, 0.01);
	}
	catch(Exception e) {}	

}}
