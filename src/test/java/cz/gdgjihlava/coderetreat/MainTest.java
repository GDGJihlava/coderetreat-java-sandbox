package cz.gdgjihlava.coderetreat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

	private Main object;

	@Before
	public void setUp() throws Exception {
		object = new Main();
	}

	@Test
	public void testMethod() throws Exception {
		assertTrue(object.method());
	}
}