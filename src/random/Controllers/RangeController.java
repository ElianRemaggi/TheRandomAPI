package random.Controllers;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import random.Model.RangeAction;

public class RangeController extends ServerResource{
	
	
	RangeAction rangeAction;
	@Get("application/json")
	public int calculateRange(){ //Funcionando
	System.out.println("calculateRange()");
		rangeAction = new RangeAction();
		return rangeAction.calculateRange(); 
	}

@Post("application/json")
	public int rangeAction(int[] range) { //Error 422
		rangeAction = new RangeAction(range[0],range[1]);
		return rangeAction.calculateRange(); 
	}

}
