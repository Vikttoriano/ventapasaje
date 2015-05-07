package general;

import static org.junit.Assert.*;

import org.junit.Test;

public class cargoTestEliminar {

	@Test
	public void test() {
		cargo c = new cargo();
		boolean resp= c.eliminarCargo();
		assertNotNull(resp);
	}

}
