package project.io;

import org.junit.Test;

import io.naztech.multi;
import junit.framework.TestCase;

public class test_max extends TestCase {
	
	@Test
	public void testCompare() {
		multi a=new multi();
		int g=a.max_mult();
		int f=20;
		assertEquals(f,g);
	}

}
