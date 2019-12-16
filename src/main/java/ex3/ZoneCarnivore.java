package ex3;

import java.util.List;

public class ZoneCarnivore extends Zone {

	/**
	 * @param listeAnimaux
	 */
	public ZoneCarnivore(List<Animal> listeAnimaux) {
		super(listeAnimaux);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ex3.Zone#getPoids()
	 */
	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return 50;
	}
}
