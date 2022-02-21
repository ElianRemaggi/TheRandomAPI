package random;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

import random.Controllers.*;


public class RandomAPI extends Application{

		public static void main(String[] args) {
			try {
				Component component = new Component();
				component.getServers().add(Protocol.HTTP,8002); //Puerto en el que se levantara el servicio
				component.getDefaultHost().attach(new RandomAPI()); //Levantamos la APLICACION RandomAPI
				component.start();
			}catch (Exception e) {
				System.out.println("RandomAPI Class Exception");
				e.printStackTrace();				
			}
		}
		
		public Restlet createInboundRoot() {
			
			Router router = new Router(getContext());
			
			//Registramos las urls con las que se utilizaran los vervos
			
			router.attach("/range",RangeController.class );// check
			router.attach("/or",OrController.class ); //check
			router.attach("/dices",DiceController.class ); //check
			router.attach("/RockPaperScissors",RockPaperScissorsController.class ); //check
			router.attach("/flipCoin",flipCoinController.class);
			return router;
		}
}
