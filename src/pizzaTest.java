import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class pizzaTest {


	@Test
	public void testGetName() {
		pizza p1=new pizza("corn star",300,"veg");
		assertEquals("corn star",p1.getName());
	}

	@Test
	public void testGetPrice() {
		pizza p1=new pizza("corn star",300,"veg");
		assertEquals(300,p1.getPrice());
	}

	@Test
	public void testGetPtype() {
		pizza p1=new pizza("corn star",300,"veg");
		assertEquals("veg",p1.getPtype());
	}

}
