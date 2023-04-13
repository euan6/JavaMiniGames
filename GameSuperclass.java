package GamePlayer;

public abstract class GameSuperclass
{
	private String gameName;
	
	public GameSuperclass(String gameName)
	{
		this.gameName = gameName;
	}
	
	abstract void printGameIntro();
	abstract public boolean processInput(int value);
	abstract public boolean processInput(String value);

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public boolean processInput(char value) {
		return false;
	}
}
