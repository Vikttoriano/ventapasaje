package general;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

public class ciudadTest3 {

	@Test
	public void test() {
		ciudad c = new ciudad();
		ResultSet resp = c.BuscarCiudadPorID(0);
		assertNotNull(resp);
	}

}
