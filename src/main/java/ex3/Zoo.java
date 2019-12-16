package ex3;

/**
 * Classe qui défini les attributs et méthodes d'un Zoo */
 
public class Zoo {
/* Nom du Zoo*/
	private String nom;
	/* Zone SavaneAfricaine dans le Zoo */
	private SavaneAfricaine savaneAfricaine;
	/* Zone ZoneCarnivore dans le Zoo */
	private ZoneCarnivore zoneCarnivore;
	/* Zone FermeReptile dans le Zoo */
	private FermeReptile fermeReptile;
	/* Zone Aquarium dans le Zoo */
	private Aquarium aquarium;

	public static final String MAMMIFERE = "MAMMIFERE";
	public static final String CARNIVORE = "CARNIVORE";
	public static final String HERBIVORE = "HERBIVORE";
	public static final String REPTILE = "REPTILE";
	public static final String POISSON = "POISSON";
	
	public Zoo(String nom, SavaneAfricaine savaneAfricaine, ZoneCarnivore zoneCarnivore, FermeReptile fermeReptile,
			Aquarium aquarium) {
		super();
		this.nom = nom;
		this.savaneAfricaine = savaneAfricaine;
		this.zoneCarnivore = zoneCarnivore;
		this.fermeReptile = fermeReptile;
		this.aquarium = aquarium;
	}
/* Ajoute un animal à une zone précise en fonction de ses comportements et type */
	public void addAnimal(Animal animal) {
		if ((animal.getType().equals(MAMMIFERE)) && (animal.getComportement().equals(CARNIVORE))) {
			zoneCarnivore.addAnimal(animal);
		} else if ((animal.getType().equals(MAMMIFERE)) && (animal.getComportement().equals(HERBIVORE))) {
			savaneAfricaine.addAnimal(animal);
		} else if (animal.getType().equals(REPTILE)) {
			fermeReptile.addAnimal(animal);
		} else if (animal.getType().equals(POISSON)) {
			aquarium.addAnimal(animal);
		}
	}
/* Affiche la liste des Animaux du Zoo */
	public void afficherListeAnimaux() {
		
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
