package general;
import java.sql.ResultSet;
import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

public class ciudadTest2 {

	@Test
	public void test() {
		ciudad c = new ciudad();
		ResultSet resp =  c.listarCiudad();
		assertNotNull(resp);
		
	}
	
	

}
