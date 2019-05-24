package ex3;

/**
 * Représente une savane africaine
 * @author Formation
 *
 */
public class SavaneAfricaine extends Zone {	
	
	/**
	 * Initialise la zone de savane africaine
	 */
	public SavaneAfricaine() {
		super();
	}

	@Override
	public double getPoids() {
		return ConstantesMasse.MASSE_SAVANE;
	}
	
	
	


}
