package GamePlayer;
import java.util.Random;

public class RockPaperScissors extends GameSuperclass {
	
	private String[] rps = {"r", "p", "s"};
	private String computerMove = rps[new Random().nextInt(rps.length)];
	
	public RockPaperScissors(String gameName) {
		super(gameName);
	}

	@Override
	public void printGameIntro() {
		System.out.println("Welcome to " + getGameName());
		System.out.println("I am thinking of either rock, paper or scissors");
		System.out.println("Please enter your first move (r, p or s): ");
	}
	
	public boolean processInput(String playerMove) {
		System.out.println("Computer played: " + computerMove);
		if (playerMove.equals(computerMove)) {
			System.out.println("The game was a tie");
		} else if (playerMove.equals("r")) {
			if (computerMove.equals("p")) {
				System.out.println("You lose!");
			} else if (computerMove.equals("s")) {
				System.out.println("You win!");
			}
		} else if (playerMove.equals("p")) {
			if (computerMove.equals("r")) {
				System.out.println("You win!");
			} else if (computerMove.equals("s")) {
				System.out.println("You lose!");
			}
		} else if (playerMove.equals("s")) {
			if (computerMove.equals("p")) {
				System.out.println("You win!");
			} else if (computerMove.equals("r")) {
				System.out.println("You lose!");
			}
		}
		return false;
	}

	@Override
	public boolean processInput(int value) {
		return false;
	}

}