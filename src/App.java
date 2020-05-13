
public class App {

	public static void main(String[] args) {
		ObservableImpl observavble =  new ObservableImpl();
		Observer o1 = new ObserverImpl1();
		Observer o2 = new ObserverImpl2();
		Observer o3 = new ObserverImpl1();

		observavble.subscribe(o1);//1- c juste o1 qui est souscrit o2 && o3 non vont pas recevoir la notif
		observavble.subscribe(o2);//2-add o2
		observavble.subscribe(o3);
		
		observavble.setState(44);
		observavble.setState(11);
		observavble.unsubscribe(o1);//o1 ne poura pas recevoir la notification
		//JAVA 7
		observavble.subscribe(new Observer() {
			
			@Override
			public void update(Observable observable) {
				System.out.println("Observateur Anonyme *******// Java 7");
			}
		});
		
		//JAVA 8
		observavble.subscribe(
				obs -> {
					System.out.println("Observateur Anonyme ******* // java 8");
					
				});
		
		observavble.setState(2);
		
	}

}
