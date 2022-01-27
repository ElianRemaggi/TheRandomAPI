package random.Model;

public class RockPaperScissorsAction implements IAction{
	
	private String[] options;
	
	public RockPaperScissorsAction() {
		this.options = new String[] { "Rock","Paper","Scissors"};
	}
	
	public String playRockPaperScissorsAction() {
		return options[(int) (Math.random()*(3))];
	}
	
}
