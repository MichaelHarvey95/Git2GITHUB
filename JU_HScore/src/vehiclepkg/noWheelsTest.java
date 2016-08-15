package vehiclepkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class noWheelsTest {

	@Test
	public void noWheelsCarTest() {
		car nuCar = new car();
		nuCar.setNoWheels(5);
		assertEquals(5, nuCar.getNoWheels());
	}

}
