package general;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

public class estado_pasajeTest {

	@Test
	public void test() {
		estado_pasaje ep = new estado_pasaje();
		ResultSet resp =  ep.listarEstadoPasaje();
		assertNotNull(resp);
		
		
	}

}
