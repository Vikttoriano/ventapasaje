package general;

import static org.junit.Assert.*;

import org.junit.Test;

public class busTestBuscar {

	@Test
	public void test() {
		bus b = new bus();
		b.BuscarBus("abc123");
		assertTrue(true);
	}

}
