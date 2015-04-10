package observer;

public class ObserverDemo {
	public static void main(String[] args) {
		Subject sub = new Subject();
		Yeller yeller = new Yeller();
		Informer informer = new Informer();
		sub.registerObserver(yeller);
		sub.registerObserver(informer);
		
		for(int i=0; i<4; i++){
			sub.changeState();
			System.out.println();
		}
	}
}
