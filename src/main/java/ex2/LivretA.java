package ex2;

public class LivretA extends CompteBancaire {

	/* Constructeur qui reprend le constructeur de la Classe Mère*/
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0, tauxRemuneration);
		
	}

}
