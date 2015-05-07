package general;

import static org.junit.Assert.*;

import org.junit.Test;

public class tarifarioTest {

	@Test
	public void test() {
		tarifario t = new tarifario();
		assertTrue(t.calcvalor(2000,32.5,30)==1950000);
	}
}
