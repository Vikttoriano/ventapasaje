package general;

import static org.junit.Assert.*;

import org.junit.Test;

public class pasajeTest {

	@Test
	public void test() {
		pasaje p = new pasaje();
		boolean resp = p.agregarPasaje("Valdivia", "Puerto Mont","2015-05-19", 4900, 23, 3, 23, "12567432-2", 4);
		assertTrue(resp);
	}

	
}
