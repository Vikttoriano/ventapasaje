package general;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

public class cargoTestListar {

	@Test
	/*listar*/
	
	public void test() {
		cargo c = new cargo();
		ResultSet resp= c.listarCargo();
		assertNotNull(resp);
	}

}
