package tdd.training.bsk;

public class Frame {
	
	private int firstThrow;
	private int secondThrow;
	private int bonus;

	/**
	 * It initializes a frame given the pins knocked down in the first and second
	 * throws, respectively.
	 * 
	 * @param firstThrow  The pins knocked down in the first throw.
	 * @param secondThrow The pins knocked down in the second throw.
	 * @throws BowlingException
	 */
	public Frame(int firstThrow, int secondThrow) throws BowlingException {
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}

	/**
	 * It returns the pins knocked down in the first throw of this frame.
	 * 
	 * @return The pins knocked down in the first throw.
	 */
	public int getFirstThrow() {
		return firstThrow;
	}

	/**
	 * It returns the pins knocked down in the second throw of this frame.
	 * 
	 * @return The pins knocked down in the second throw.
	 */
	public int getSecondThrow() {
		return secondThrow;
	}

	/**
	 * It sets the bonus of this frame.
	 *
	 * @param bonus The bonus.
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	/**
	 * It returns the bonus of this frame.
	 *
	 * @return The bonus.
	 */
	public int getBonus() {
		return bonus;
	}

	/**
	 * It returns the score of this frame (including the bonus).
	 * 
	 * @return The score
	 */
	public int getScore() {
		if(this.isSpare() || this.isStrike()) {
			return firstThrow+secondThrow+bonus;
		}else
		return firstThrow+secondThrow;
	}

	/**
	 * It returns whether, or not, this frame is strike.
	 * 
	 * @return <true> if strike, <false> otherwise.
	 */
	public boolean isStrike() {
		if(firstThrow == 10) {
			return true;
		}
		return false;
	}

	/**
	 * It returns whether, or not, this frame is spare.
	 * 
	 * @return <true> if spare, <false> otherwise.
	 */
	public boolean isSpare() {
		if(firstThrow+secondThrow == 10 && firstThrow!=10) {
			return true;
		}
		return false;
	}
	

}
