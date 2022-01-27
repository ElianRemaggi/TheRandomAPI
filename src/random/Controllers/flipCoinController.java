package random.Controllers;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import random.Model.FlipCoinAction;

public class flipCoinController extends ServerResource{
	
	FlipCoinAction fpa;
	
	@Get("application/json")
	public String playFlipCoinAction() {
		fpa = new FlipCoinAction();
		return fpa.flipCoinOperate();
	}
	
}
