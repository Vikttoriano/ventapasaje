package general;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

public class estado_cargoTestListar {

	@Test
	public void test() {
		estado_cargo ec = new estado_cargo();
		ResultSet resp= ec.listarEstadoCargo();
		assertNotNull(resp);
	}
}
