package nav;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ageTest {
	age a;
	@Before
	public void init()
	{
		a=new age();
	}

	@Test
	public void test() {
		age a = new age();
		assertEquals("eligible to vote",a.election(20));
	}
	@Test
	public void test1() {
		age a = new age();
		assertEquals("eligible to vote",a.election(21));
	}

}
