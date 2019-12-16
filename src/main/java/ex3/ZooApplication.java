/*
 * Classe executable qui créé des animaux et les affecte dans un Zoo*/

package ex3;

import java.util.ArrayList;

public class ZooApplication {

	public static void main(String[] args) {
		/* initiailisation des listes des Zones du Zoo*/
		ArrayList<Animal> listSavane = new ArrayList<Animal>(0);
		ArrayList<Animal> listCarnivore = new ArrayList<Animal>(0);
		ArrayList<Animal> listReptile = new ArrayList<Animal>(0);
		ArrayList<Animal> listAquarium = new ArrayList<Animal>(0);
		/* Création des Zones du zoo */
		SavaneAfricaine savane = new SavaneAfricaine(listSavane);
		ZoneCarnivore carnivore = new ZoneCarnivore(listCarnivore);
		FermeReptile reptile = new FermeReptile(listReptile);
		Aquarium aquarium = new Aquarium(listAquarium);
		
		/* création d'un Zoo */
		Zoo zoo = new Zoo("Thoiry", savane, carnivore,reptile,aquarium);

		 zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		 zoo.addAnimal(new Animal("Zèbre", "MAMMIFERE", "HERBIVORE"));
		 zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "HERBIVORE"));
		 zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
		 zoo.addAnimal(new Animal("Requin blanc", "POISSON", "HERBIVORE"));
		 zoo.addAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
		 zoo.addAnimal(new Animal("Boa constrictor", "REPTILE", "CARNIVORE"));
		 zoo.addAnimal(new Animal("Python", "REPTILE", "CARNIVORE"));
		
	}

}
