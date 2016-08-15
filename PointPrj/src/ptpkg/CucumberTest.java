package ptpkg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CucumberTest {
	private int[] m;
	
	@Before
	public void executedBeforeEach()
	{
		m = new int[5];//set up or reinitialize test array
		for (int i = 0; i < m.length; i++)
		{
			m[i] = i;
		}
	}

	@Test
	public void testCucumber() 
	{
		int j = CucumberLet.cucumber(m); //Static method for class!
		assertEquals(10, j);
	}
	
	
	@Test
	public void testLettuce() 
	{
		int j = CucumberLet.lettuce(m, 2); //Static method for class!
		assertEquals(1, j);
	}
	
	
	
	@Test
	public void testTomato() 
	{
		int j = CucumberLet.tomato(m, 2); //Static method for class!
		assertEquals(2, j);
	}
		
}


