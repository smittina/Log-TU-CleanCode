package ex3;

/**
 * Repr�sente une aquarium
 * @author Formation
 *
 */
public class Aquarium extends Zone {
	
	/**
	 * Initialise la zone d'aquarium
	 */
	public Aquarium() {
		super();
	}

	@Override
	public double getPoids() {
		return ConstantesMasse.MASSE_AQUARIUM;
	}

	
	
}
