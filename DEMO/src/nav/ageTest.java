package nav;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ageTest 
{
	private int input;
	private String output;
	public ageTest(int input,String output)
	{
		this.input=input;
		this.output=output;
	}
	age a;
	@Before
	public void init()
	{
		a=new age();
	}
	@Parameterized.Parameters
	public static Collection aget() 
	{
		return Arrays.asList(new Object [][]{
				{14,"not eligible to vote"},
				{20,"eligible to vote"}
		}
		);
	}
	@Test
	public void address()
	{
	assertEquals(output,a.election(input));
	
	}	}


