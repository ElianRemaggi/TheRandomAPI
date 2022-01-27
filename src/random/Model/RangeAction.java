package random.Model;

import java.util.Random;

public class RangeAction implements IAction{

	private int min;
	private int max;
	
	public RangeAction() {
		this.min = 1;
		this.max = 100;
	}
	
	public RangeAction(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	
	public int calculateRange() {
		
		Random claseRandom = new Random();
		return min + claseRandom.nextInt(max - min +1); //Se suma 1 al maximo, para contemplar el ultimo valor del rango
	}

}