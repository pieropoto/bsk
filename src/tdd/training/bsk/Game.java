package tdd.training.bsk;

public class Game {

	/**
	 * It initializes an empty bowling game.
	 */
	public Game() {
		// To be implemented
	}

	/**
	 * It adds a frame to this game.
	 * 
	 * @param frame The frame.
	 * @throws BowlingException
	 */
	public void addFrame(Frame frame) throws BowlingException {
		// To be implemented
	}

	/**
	 * It return the i-th frame of this game.
	 * 
	 * @param index The index (ranging from 0 to 9) of the frame.
	 * @return The i-th frame.
	 * @throws BowlingException
	 */
	public Frame getFrameAt(int index) throws BowlingException {
		// To be implemented
		return null;	
	}

	/**
	 * It sets the first bonus throw of this game.
	 * 
	 * @param firstBonusThrow The first bonus throw.
	 * @throws BowlingException
	 */
	public void setFirstBonusThrow(int firstBonusThrow) throws BowlingException {
		// To be implemented
	}

	/**
	 * It sets the second bonus throw of this game.
	 * 
	 * @param secondBonusThrow The second bonus throw.
	 * @throws BowlingException
	 */
	public void setSecondBonusThrow(int secondBonusThrow) throws BowlingException {
		// To be implemented
	}

	/**
	 * It returns the first bonus throw of this game.
	 * 
	 * @return The first bonus throw.
	 */
	public int getFirstBonusThrow() {
		// To be implemented
		return 0;
	}

	/**
	 * It returns the second bonus throw of this game.
	 * 
	 * @return The second bonus throw.
	 */
	public int getSecondBonusThrow() {
		// To be implemented
		return 0;
	}

	/**
	 * It returns the score of this game.
	 * 
	 * @return The score of this game.
	 * @throws BowlingException
	 */
	public int calculateScore() throws BowlingException {
		// To be implemented
		return 0;	
	}

}
