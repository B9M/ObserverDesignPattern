
public class ObserverImpl2 implements Observer {
	
	private int counteur;
	@Override
	public void update(Observable observable) {
		int state = ((ObservableImpl) observable).getState();
		if((state%2)==0)++counteur;
		
		System.out.println("********** ObserverImpl2 **********");
		System.out.println("la Nouvelle mise a jour State = "+state);
		System.out.println("Résultat de Calcule  = "+((state%2)==0?"pair":"Impair"));
		System.out.println("le compteur  "+counteur);
		System.out.println("***********************************");
		
		
		/*
		 //POP 
		@Override
		public void update(int state) {
			
			// int state = observable.getState(); observable => interface , faire cast vers class 
			
			double res = state*state ;
			
			System.out.println("********** ObserverImpl2 **********");
			System.out.println("la Nouvelle mise a jour State = "+state);
			System.out.println("Résultat de Calcule  = "+res);
			System.out.println("***********************************");
			
		}
		 
		 
		 */


	}

}
