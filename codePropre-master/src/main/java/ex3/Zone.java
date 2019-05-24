package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une zone du Zoo
 * @author Meissel
 *
 */
public abstract class Zone {

	/**
	 * Liste des différents types d'animaux présents dans la zone
	 */
	private List<String> types;
	/**
	 * Liste des différents noms d'animaux présents dans la zone
	 */
	private List<String> noms;
	/**
	 * Liste des différents comportements alimentaires des animaux de la zone
	 */
	private List<String> comportements;
	
	/**
	 * Intialise la zone
	 */
	public Zone() {
		types = new ArrayList<>();
		noms = new ArrayList<>();
		comportements = new ArrayList<>();
	}
	
	/**
	 * Méthode qui permet d'ajouter un animaux dans la zone
	 * @param typeAnimal
	 * @param nomAnimal
	 * @param comportement
	 */
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	/**
	 * Méthode qui permet d'afficher la liste des différents animaux présents dans la zone
	 */
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	/**
	 * Méthode qui permet de compte le nombre d'animaux présents dans la zone
	 * @return le nombre d'animaux
	 */
	public int compterAnimaux(){
		return noms.size();
	}
	
	/**
	 * Méthode abstraite permettant d'obtenir la Masse moyenne en kg de nourriture consommée par un animal de la zone
	 * @return la masse de nourriture
	 */
	public abstract double getPoids();
	
	/**
	 * Permet de calculer la quantité en Kgs de nourriture par jour nécessaire pour un animal de la zone
	 * @return
	 */
	public double calculerKgsNourritureParJour(){
		return noms.size() * getPoids();
	}

	/**
	 * Getter types
	 * @return types
	 */
	public List<String> getTypes() {
		return types;
	}

	/**
	 * Setter types
	 * @param types
	 */
	public void setTypes(List<String> types) {
		this.types = types;
	}

	/**
	 * Getter noms
	 * @return noms
	 */
	public List<String> getNoms() {
		return noms;
	}

	/**
	 * Setter noms
	 * @param noms
	 */
	public void setNoms(List<String> noms) {
		this.noms = noms;
	}

	/**
	 * Getter comportements
	 * @return comportements
	 */
	public List<String> getComportements() {
		return comportements;
	}

	/**
	 * Setter comportements
	 * @param comportements
	 */
	public void setComportements(List<String> comportements) {
		this.comportements = comportements;
	}
}
