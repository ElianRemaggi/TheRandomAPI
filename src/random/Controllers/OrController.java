package random.Controllers;

import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import random.Model.OrAction;

public class OrController extends ServerResource{
	
	OrAction orAction;
	
	@Post("application/json")
	public Object orAction(Object[] obj){ // retorna el array completo
		orAction = new OrAction(obj[0],obj[1]);
		return orAction.orOperate(); 
	}
}
