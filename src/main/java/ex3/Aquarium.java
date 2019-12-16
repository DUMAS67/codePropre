/**
 * 
 */
package ex3;

import java.util.List;

/**
 * Classe qui défini un Aquarium avec sa méthode abstract
 *
 */
public class Aquarium extends Zone{

	
	public Aquarium(List<Animal> listeAnimaux) {
		super(listeAnimaux);
	}

	/* (non-Javadoc)
	 * @see ex3.Zone#getPoids()
	 */
	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return 0.5d;
	}

}
