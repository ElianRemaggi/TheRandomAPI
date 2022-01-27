package random.Controllers;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import random.Model.RockPaperScissorsAction;

public class RockPaperScissorsController extends ServerResource{

	RockPaperScissorsAction rpsa;
	@Get("application/json")
	public String playRockPaperScissorsAction(){
	System.out.println("playRockpappersu()");
		rpsa = new RockPaperScissorsAction();
		return rpsa.playRockPaperScissorsAction(); 
	}
	
}
