package general;

import static org.junit.Assert.*;

import org.junit.Test;

public class busTestListar {

	@Test
	public void test() {
		bus b = new bus();
		b.ListarBus(null);
		assertTrue(true);
	}

}
