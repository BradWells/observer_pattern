package observer;

public class Yeller implements Observer{

	@Override
	public void sendNotification(State state) {
		String stateString;
		switch(state){
			case EATING:
				stateString = "EATING";
				break;
			case SITTING:
				stateString = "SITTING";
				break;
			case STANDING:
				stateString = "STANDING";
				break;
			default:
				stateString = "UNKNOWN";
				break;
		}
		System.out.println("Yeller: SUBJECT IS NOW " + stateString + "!!!!");
	}
	
}
