package ex3;

/** Repr�sente une ferme de reptile
 * @author DIGINAMIC
 */
public class FermeReptile extends Zone {

	/**
	 * Initialise la ferme de reptiles
	 */
	public FermeReptile() {
		super();
	}

	@Override
	public double getPoids() {
		return ConstantesMasse.MASSE_REPTILE;
	}

}
