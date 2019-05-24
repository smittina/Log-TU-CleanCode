package ex3;

/**
 * Repr�sente une zone de carnivores
 * @author Formation
 *
 */
public class ZoneCarnivore extends Zone {
	
	/**
	 * Permet d'initialiser la zone
	 */
	public ZoneCarnivore() {
		super();
	}
	
	@Override
	public double getPoids() {		
		return ConstantesMasse.MASSE_CARNIVORE;
	}
}
