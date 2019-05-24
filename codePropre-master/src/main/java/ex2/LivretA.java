package ex2;

/**
 * Représente un Livret A
 * @author Formation
 *
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/**
	 * Constructeur permettant d'initaliser un Livret A
	 * @param solde solde du compte
	 * @param tauxRemuneration taux de rémunération annuel du compte
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/**
	 * Méthode qui applique au solde le taux de rémunération annuel du Livret A
	 */
	public void appliquerRemuAnnuelle(){
		setSolde(getSolde()+getSolde()*tauxRemuneration/100);		
	}
	
	/**
	 * Méthode qui permet de débiter un montant du Livret A à condition que le solde final soit positif
	 */
	public void debiterMontant(double montant) {
		if (getSolde() - montant > 0){
			setSolde(getSolde()-montant);
		}
	}

}
