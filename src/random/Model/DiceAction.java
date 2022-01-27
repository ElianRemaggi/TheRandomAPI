package random.Model;

public class DiceAction implements IAction{
	
	private int diceAmount;
	
	public DiceAction() {
		this.diceAmount = 1;
	}
	
	public DiceAction(int amount) {
		this.diceAmount = amount;
	}
	
	public int roll() {
		return (int) (Math.random()*(6))+1;
	}
	
	public int[] rolls() {
		
		int diceResult[];
		diceResult = new int[diceAmount];
		
		for(int i=0 ; i<diceAmount; i++) {
			diceResult[i] = this.roll();
		}
		
		return diceResult;
	}
	
}