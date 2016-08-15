package vehiclepkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class noDoorsTest {

	@Test
	public void getNoDoorstest() {
		int j = car.getNoDoors();//static method for class!
		assertEquals(1, j);
	}
	
	@Test
	public void setNoDoorstest()
	{
		car.setNoDoors(2);
		int j = car.getNoDoors();//static method for class!
		assertEquals(2, j);
		//remember that we don't normally write tests for getters and setters
	}

}
