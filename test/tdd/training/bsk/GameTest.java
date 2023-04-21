package tdd.training.bsk;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

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
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(5, 3));
		game.addFrame(new Frame(8, 2));
		
		assertEquals(86, game.calculateScore());
	}

}
