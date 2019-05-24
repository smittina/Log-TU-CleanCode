package ex2;

/**
 * Repr�sente un Livret A
 * @author Formation
 *
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de r�mun�ration dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/**
	 * Constructeur permettant d'initaliser un Livret A
	 * @param solde solde du compte
	 * @param tauxRemuneration taux de r�mun�ration annuel du compte
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/**
	 * M�thode qui applique au solde le taux de r�mun�ration annuel du Livret A
	 */
	public void appliquerRemuAnnuelle(){
		setSolde(getSolde()+getSolde()*tauxRemuneration/100);		
	}
	
	/**
	 * M�thode qui permet de d�biter un montant du Livret A � condition que le solde final soit positif
	 */
	public void debiterMontant(double montant) {
		if (getSolde() - montant > 0){
			setSolde(getSolde()-montant);
		}
	}

}
