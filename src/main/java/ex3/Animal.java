/**
 * Classe qui défini un Animal
 */
package ex3;


/**
 * @author DUMAS
 *
 */
public class Animal {

	/* Type de l'Animal - Mammifere, Serpent, Poisson*/
	private String type;
	/* Nom de l'Animal*/
	private String nom;
	/* Comportement de l'Animal - Carnivore, herbivore*/
	private String comportement;
	
	public Animal(String nom, String type, String comportement) {
		super();
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}
	
	@Override
	/* Permet un affichage sans passer par une méthode pour chaque implémentation d'Animal*/
	public String toString() {
		return "Nom : " + nom + " Type : " + type + " Comportement : " + comportement;
	}
	
	/** Getter
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}
	/** Setter
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
}

