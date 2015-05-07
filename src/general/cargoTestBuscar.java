package general;

import static org.junit.Assert.*;

import org.junit.Test;

public class cargoTestBuscar {

	@Test
	public void test() {
		cargo c = new cargo();
		boolean resp= c.BuscarCargo(1);
		assertNotNull(resp);
	}

}
