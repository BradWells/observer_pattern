package observer;

import java.util.ArrayList;

public class Subject {
	private ArrayList<Observer> observers;
	private State currentState;
	
	public Subject(){
		observers = new ArrayList<Observer>();
		currentState = State.STANDING;
	}
	
	public void registerObserver(Observer obs){
		observers.add(obs);
	}
	
	public Observer unregisterObserver(Observer removedObs){
		for(Observer observer : observers){
			if(observer == removedObs){
				observers.remove(observer);
				return observer;
			}
		}
		return null;
	}
	
	public void changeState(){
		switch(currentState){
			case EATING:
				currentState = State.STANDING;
				break;
			case STANDING:
				currentState = State.SITTING;
				break;
			case SITTING:
				currentState = State.EATING;
				break;
		}
		notifyObservers();
	}
	
	public void notifyObservers(){
		for(Observer observer : observers){
			observer.sendNotification(currentState);
		}
	}
}
