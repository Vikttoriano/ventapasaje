package general;

import static org.junit.Assert.*;

import org.junit.Test;

public class ciudadTest {

	 @Test
	public void test() {
		ciudad c = new ciudad();
		boolean resp = c.agregarCiudad("Arica");
		assertTrue(resp);
	}  
	
 

}
