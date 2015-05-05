package general;

import static org.junit.Assert.*;

import org.junit.Test;

public class pasajeTest2 {

	@Test
	public void test() {
		pasaje p = new pasaje();
		boolean res = p.modificarPasaje(8,"Arica", "Valdivia", "2016-08-12", 10900, 12, 5, 34, "12537432-2", 8);
		assertTrue(res);
	
	}

}
