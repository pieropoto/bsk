package tdd.training.bsk;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test(expected = BowlingException.class)
	public void testAdd11Frames() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(7, 2));
		game.addFrame(new Frame(3, 5));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(8, 0));
		game.addFrame(new Frame(1, 7));
		game.addFrame(new Frame(0, 8));
		game.addFrame(new Frame(9, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(8, 2));
		game.addFrame(new Frame(8, 2));
		
	}
	
	@Test
	public void testGetFrameAtIndex() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(7, 2));
		game.addFrame(new Frame(3, 5));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(8, 0));
		game.addFrame(new Frame(1, 7));
		game.addFrame(new Frame(0, 8));
		game.addFrame(new Frame(9, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(8, 2));
		
		assertEquals(8, game.getFrameAt(3).getFirstThrow());
		assertEquals(0, game.getFrameAt(3).getSecondThrow());
	}

	@Test
	public void testCalculateScore() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(7, 2));
		game.addFrame(new Frame(3, 5));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(8, 0));
		game.addFrame(new Frame(1, 7));
		game.addFrame(new Frame(0, 8));
		game.addFrame(new Frame(9, 0));
		game.addFrame(new Frame(8, 0));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(7, 2));
		
		assertEquals(83, game.calculateScore());
	}
	
	@Test
	public void testCalculateScoreSpare() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(7, 2));
		game.addFrame(new Frame(3, 5));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(8, 0));
		game.addFrame(new Frame(1, 7));
		game.addFrame(new Frame(0, 8));
		game.addFrame(new Frame(9, 1));
		game.addFrame(new Frame(8, 0));
		game.addFrame(new Frame(7, 3));
		game.addFrame(new Frame(8, 1));
		
		assertEquals(102, game.calculateScore());
	}

	@Test
	public void testCalculateScoreStrike() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(3, 6));
		game.addFrame(new Frame(7, 2));
		game.addFrame(new Frame(3, 6));
		game.addFrame(new Frame(4, 4));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(3, 3));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(8, 1));
		game.addFrame(new Frame(2, 6));
		
		assertEquals(94, game.calculateScore());
	}
	
	@Test
	public void testCalculateScoreStrikeAndSpare() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(4, 6));
		game.addFrame(new Frame(7, 2));
		game.addFrame(new Frame(3, 6));
		game.addFrame(new Frame(4, 4));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(3, 3));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(8, 1));
		game.addFrame(new Frame(2, 6));
		
		assertEquals(103, game.calculateScore());
	}
	
	@Test
	public void testCalculateScoreConsecutiveStrike() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(7, 2));
		game.addFrame(new Frame(3, 6));
		game.addFrame(new Frame(4, 4));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(3, 3));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(8, 1));
		game.addFrame(new Frame(2, 6));
		
		assertEquals(112, game.calculateScore());
	}
	
	@Test
	public void testCalculateScoreConsecutiveSpare() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(8, 2));
		game.addFrame(new Frame(5, 5));
		game.addFrame(new Frame(7, 2));
		game.addFrame(new Frame(3, 6));
		game.addFrame(new Frame(4, 4));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(3, 3));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(8, 1));
		game.addFrame(new Frame(2, 6));
		
		assertEquals(98, game.calculateScore());
	}
	
	@Test
	public void testGetFirstBonusThrow() throws Exception {
		Game game = new Game();
		game.setFirstBonusThrow(8);
		
		assertEquals(8, game.getFirstBonusThrow());
	}
	
	@Test
	public void testCalculateScoreLastFrameSpare() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(1, 5));
		game.addFrame(new Frame(3, 6));
		game.addFrame(new Frame(7, 2));
		game.addFrame(new Frame(3, 6));
		game.addFrame(new Frame(4, 4));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(3, 3));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(8, 1));
		game.addFrame(new Frame(2, 8));
		game.setFirstBonusThrow(7);
		
		assertEquals(90, game.calculateScore());
	}
	
	@Test
	public void testGetSecondBonusThrow() throws Exception {
		Game game = new Game();
		game.setSecondBonusThrow(8);
		
		assertEquals(8, game.getSecondBonusThrow());
	}
	
	@Test
	public void testCalculateScoreLastFrameStrike() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(1, 5));
		game.addFrame(new Frame(3, 6));
		game.addFrame(new Frame(7, 2));
		game.addFrame(new Frame(3, 6));
		game.addFrame(new Frame(4, 4));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(3, 3));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(8, 1));
		game.addFrame(new Frame(10, 0));
		game.setFirstBonusThrow(7);
		game.setSecondBonusThrow(2);
		
		assertEquals(92, game.calculateScore());
	}
	
	@Test
	public void testCalculateBestScore() throws Exception {
		Game game = new Game();
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(10, 0));
		game.setFirstBonusThrow(10);
		game.setSecondBonusThrow(10);
		
		assertEquals(300, game.calculateScore());
	}
}
