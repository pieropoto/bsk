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

	@Test
	public void testGetScore() throws Exception{
		Frame frame = new Frame(7, 2);
		assertEquals(9, frame.getScore());
	}
	
	@Test
	public void testGetBonus() throws Exception{
		Frame frame = new Frame(7, 3);
		frame.setBonus(8);
		assertEquals(8, frame.getBonus());
	}
	
	@Test
	public void testIsSpare() throws Exception{
		Frame frame = new Frame(7, 3);
		assertTrue(frame.isSpare());
	}
	
	@Test
	public void testIsNotSpare() throws Exception{
		Frame frame = new Frame(7, 2);
		assertFalse(frame.isSpare());
	}
	
	@Test
	public void testGetScoreSpare() throws Exception{
		Frame frame = new Frame(7, 3);
		frame.setBonus(8);
		assertEquals(18, frame.getScore());
	}
	
	@Test
	public void testIsStrike() throws Exception{
		Frame frame = new Frame(10, 0);
		assertTrue(frame.isStrike());
	}
	
	@Test
	public void testIsNotStrike() throws Exception{
		Frame frame = new Frame(9, 0);
		assertFalse(frame.isStrike());
	}
	
	@Test
	public void testGetScoreStrike() throws Exception{
		Frame frame = new Frame(10, 0);
		frame.setBonus(9);
		assertEquals(19, frame.getScore());
	}
}
