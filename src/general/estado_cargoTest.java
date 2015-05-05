package general;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class estado_cargoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		estado_cargo ec = new estado_cargo();
		boolean resp = ec.insertar_cargo("Nuevo Estado");
		assertTrue(resp);
	}

}
