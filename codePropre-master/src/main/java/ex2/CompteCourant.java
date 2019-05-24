package ex2;

/**
 * Repr�sente un compte Courant
 * @author Formation
 *
 */
public class CompteCourant extends CompteBancaire{

	/** decouvert : un d�couvert est autoris� seulement pour les comptes courants */
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
	 * M�thode qui permet de d�biter un montant du compte � condition de ne pas d�passer le d�couvert autoris�
	 */
	public void debiterMontant(double montant) {
		if (getSolde() - montant > decouvert){
			setSolde(getSolde()- montant);
		}	
	}
}
