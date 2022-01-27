package random.Model;

public class FlipCoinAction implements IAction{
	
	private String[] options;
	
	public FlipCoinAction()
	{
		this.options = new String[]{"Heads","Tails"};
	}
	public String flipCoinOperate(){
		return this.options[(int)(Math.random()*2)];
	}
	
}
