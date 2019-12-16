/**
 * 
 */
package ex3;

import java.util.List;

/**
 * Classe qui défini une FermeReptile avec sa méthode abstract
 *
 */
public class FermeReptile extends Zone {

		
	public FermeReptile(List<Animal> listeAnimaux) {
		super(listeAnimaux);}


	/* (non-Javadoc)
	 * @see ex3.Zone#getPoids()
	 */
	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return 0.2d;
	}

}
