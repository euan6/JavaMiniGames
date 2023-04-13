package GamePlayer;

public class HigherOrLower extends GameSuperclass {
	
	public int correctNum = (int)(Math.round(Math.random() * 101) - 1);

	public HigherOrLower(String gameName) {
		super(gameName);
	}

	@Override
	public void printGameIntro() {
		System.out.println("Welcome to " + getGameName());
		System.out.println("I am thinking of a number between 0 and 100 (inclusive)");
		System.out.println("Please input your first guess:");
	}

	@Override
	public boolean processInput(int value) {
		do {
			if (value == correctNum) {
				System.out.println("Correct! My number was " + correctNum);
				return true;
			} else if (value > correctNum) {
				System.out.println("Sorry, my number is LOWER than that! Guess again: ");
				return false;
			} else if (value < correctNum) {
				System.out.println("Sorry, my number is HIGHER than that! Guess again: ");
				return false;
			}
		} while (value != correctNum);
		return false;
	}

	@Override
	public boolean processInput(String value) {
		return false;
	}
}