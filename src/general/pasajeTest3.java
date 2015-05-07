package general;

import static org.junit.Assert.*;

import org.junit.Test;

public class pasajeTest3 {

	@Test
	public void test() {
		pasaje p = new pasaje();
		boolean res = p.EliminarPasaje();
		assertNotNull(res);
	}

}
