package observer;

public class Informer implements Observer{

	@Override
	public void sendNotification(State state) {
		String stateString;
		switch(state){
			case EATING:
				stateString = "eating";
				break;
			case SITTING:
				stateString = "sitting";
				break;
			case STANDING:
				stateString = "standing";
				break;
			default:
				stateString = "unknown";
				break;
		}
		System.out.println("Informer: The subject is now " + stateString + ".");
	}
	
}
