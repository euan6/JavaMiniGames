package GamePlayer;
import java.util.Scanner;

public class MainClass {

	private static Scanner scan = new Scanner(System.in);
	private static int chosenGame;

	public static void main(String[] args) {

		// Choose which game the user wants to play
		choseGame();

		// Initialise chosen game
		if (chosenGame == 1) {
			startDiceRoller();
		} else if (chosenGame == 2) { 
			startHigherOrLower();
		} else if (chosenGame == 3) { 
			startRPS();
		}
	}

	private static void choseGame() {
		System.out.println("Welcome to the game lounge! Please pick your game:");
		System.out.println("1. Dice Roller");
		System.out.println("2. Higher or Lower");
		System.out.println("3. Rock Paper Scissors");
		chosenGame = scan.nextInt();
		while (chosenGame < 1 || chosenGame > 3) {
			System.out.println("Game not found please chose from 1, 2 or 3: ");
			chosenGame = scan.nextInt();
		}
	}
	
	private static void startDiceRoller() {
		GameSuperclass diceRoller = new DiceRoller("Dice Roller");
		diceRoller.setGameName("Dice Roller");
		diceRoller.printGameIntro();
		int value = scan.nextInt();
		// Input validation
		while (value < 1 || value > 10) {
			System.out.println("Please enter a valid number: ");
			value = scan.nextInt();
		}
		diceRoller.processInput(value);
		System.out.println("Thank you for playing " + diceRoller.getGameName() + ", goodbye!");
	}
	
	private static void startHigherOrLower() {
		GameSuperclass higherOrLower = new HigherOrLower("Higher or Lower");
		higherOrLower.setGameName("Higher or Lower");
		higherOrLower.printGameIntro();
		int value = scan.nextInt();
		// Input validation
		while (value < 0 || value > 100) {
			System.out.println("Please enter a number in range (0 - 100): ");
			value = scan.nextInt();
		}
		int numGuesses = 1;
		while (!higherOrLower.processInput(value)) {
			value = scan.nextInt();
			numGuesses++;
		}
		System.out.println("You got it correct in " + numGuesses + " guesses!");
		System.out.println("Thank you for playing " + higherOrLower.getGameName() + ", goodbye!");
	}
	
	private static void startRPS() {
		GameSuperclass rps = new RockPaperScissors("Rock Paper Scissors"); 
		rps.setGameName("Rock Paper Scissors");
		rps.printGameIntro();
		String playerMove = scan.next();
		while (!(playerMove.equals("r")) && !(playerMove.equals("p")) && !(playerMove.equals("s"))) {
			System.out.println(playerMove + " is not a valid move");
			System.out.println("Please enter your move (r, p or s): ");
			playerMove = scan.next();
		} 
		rps.processInput(playerMove);	
		System.out.println("Thank you for playing " + rps.getGameName() + ", goodbye!");
	}
}