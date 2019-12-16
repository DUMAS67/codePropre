package ex3;

import java.util.List;

public abstract class Zone {

	/* Décrit une liste d'animaux */
	private List<Animal> listeAnimaux;

	public Zone(List<Animal> listeAnimaux) {
		super();
		this.listeAnimaux = listeAnimaux;
	}

	/* Ajoute un élément de type Animal dans la Liste des Animaux */
	public void addAnimal(Animal animal) {
		this.listeAnimaux.add(animal);
	}

	/* Afficle les animaux de la Zone */
	public void afficherListeAnimaux() {
		for (Animal an : listeAnimaux) {
			System.out.println(an);
		}
	}
/* Compte les animaux de la Zone */
	public int compterAnimaux() {
		return listeAnimaux.size();
	}
/* méthode abstracte qui permet de donner un poids pour chaque type d'animal*/
	public abstract double getPoids();

	/* Calcule la nourriture donnée par jour*/
	public double calculerKgsNourritureParJour() {
		return listeAnimaux.size() * getPoids();
	}
}
