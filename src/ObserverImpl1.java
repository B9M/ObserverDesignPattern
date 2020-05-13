
public class ObserverImpl1 implements Observer {

	@Override
	public void update(Observable observable) {
		// int state = observable.getState(); observable => interface , faire cast vers class 
		int state = ((ObservableImpl) observable).getState();
		double res = state*state ;
		
		System.out.println("********** ObserverImpl1 **********");
		System.out.println("la Nouvelle mise a jour State = "+state);
		System.out.println("Résultat de Calcule  = "+res);
		System.out.println("***********************************");
		
	}

}
