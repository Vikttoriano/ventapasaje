package general;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

public class ciudadTest2 {

	@Test
	public void test() {
		ciudad c = new ciudad();
		boolean res = c.listarCiudad(null);
		assertTrue(res);
		
	}
	
	

}
