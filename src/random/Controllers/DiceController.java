package random.Controllers;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import random.Model.DiceAction;

public class DiceController extends ServerResource{

	
	DiceAction diceRoll;
	//roll devuelve un numero aleatorio representativo de un dado de 6 caras
	@Get("application/json")
	public int roll(){ 
		 diceRoll = new DiceAction();
		return diceRoll.roll(); 
	}	
	
//rolls() devuelve x = amount, numeros aleatorios representativos de un dado de 6 caras
	@Post("application/json")
	public int[] rolls(int amount){ 
		diceRoll = new DiceAction(amount);
		return diceRoll.rolls(); 
	}

}
