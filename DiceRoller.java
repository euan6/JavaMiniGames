package GamePlayer;

public class DiceRoller extends GameSuperclass {

	public DiceRoller(String gameName) {
		super(gameName);
	}

	@Override
	public void printGameIntro() {
		System.out.println("Welcome to " + getGameName());
		System.out.println("Please input how mny D6s you want to roll:");
	}

	@Override
	public boolean processInput(int value) {
		int min = 1, max = 6;
		System.out.println("Dice rolled:");
		for (int i = 0; i < value; i++) {
			System.out.print((i==0 ? "" : " | ") + "Die " + (i + 1) + " rolled " + (int)(Math.random() * (max - min + 1) + min));
		}
		System.out.println();
		System.out.println("All dice rolled!");
		return false;
	}

	@Override
	public boolean processInput(String value) {
		return false;
	}
	
}