package tdd.training.bsk;

import static org.junit.Assert.*;

import org.junit.Test;


public class FrameTest {

	@Test
	public void testGetFirtsThrow() throws Exception{
		Frame frame = new Frame(7, 2);
		assertEquals(7, frame.getFirstThrow());
	}
	
	@Test
	public void testGetSecondThrow() throws Exception{
		Frame frame = new Frame(7, 2);
		assertEquals(2, frame.getSecondThrow());
	}

}
