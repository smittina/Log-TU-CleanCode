package ex2;

/**
 * Représente un compte Courant
 * @author Formation
 *
 */
public class CompteCourant extends CompteBancaire{

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert; 
	
	/**
	 * Constructeur permettant d'initialiser un Compte Courant
	 * @param solde
	 * @param decouvert
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}
	
	/**
	 * Méthode qui permet de débiter un montant du compte à condition de ne pas dépasser le découvert autorisé
	 */
	public void debiterMontant(double montant) {
		if (getSolde() - montant > decouvert){
			setSolde(getSolde()- montant);
		}	
	}
}
