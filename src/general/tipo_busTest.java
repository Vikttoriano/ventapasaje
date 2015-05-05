package general;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class tipo_busTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
	@Test
	public void test() {
		tipo_bus tb = new tipo_bus();
		tb.Ingresar("semicama");
		assertTrue(true);
	}
}
