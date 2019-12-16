package ex3;

import java.util.List;

public class SavaneAfricaine extends Zone{

	/**
	 * @param listeAnimaux
	 */
	public SavaneAfricaine(List<Animal> listeAnimaux) {
		super(listeAnimaux);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ex3.Zone#getPoids()
	 */
	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return 60;
	}
};