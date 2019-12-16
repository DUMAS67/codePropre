package ex4;

import java.util.Date;
/* 
 * Classe de Pret avec plusieurs constructeurs*
 */ 
 class Pret {
 
	 /* attribut qui récupère les comportement de l'interface Strategy */
	private Strategy strategy;
	/* attribut qui informe le capital demandé */
	private double capital;
	/* attribut qui informe le capital restant */
	private double capitalRestantDu;
	/* attribut qui informe du taux du prêt */
	private double taux;
	/* attribut qui informe de la Date de début du prêt*/
	private Date dateDebut;
	/* attribut qui informe de la Date de fin du prêt*/
	
	private Date dateFin;
	
	/*constructeur 1 */
	public Pret(double capital, double taux, Date dateDebut) { 
		super();
		this.strategy = new PretATerme();
		this.capital = capital;
		this.taux = taux;
		this.dateDebut = dateDebut;
	}
	/*constructeur 2 = constructeur 1  + dateFin*/
	public Pret(double capital, double taux, Date dateDebut, Date dateFin) {
		new Pret(capital,taux,dateDebut);
		this.dateFin = dateFin;
	}
	
	/*constructeur 3 = constructeur 2  + CapitalRestantDu*/
	public Pret(double capital, double capitalRestantDu, double taux, Date dateDebut, Date dateFin) {
		new Pret(capital,taux,dateDebut, dateFin);
		this.capitalRestantDu = capitalRestantDu;
	}

	/** Getter for strategy
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/** Setter
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/** Getter for capital
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}

	/** Setter
	 * @param capital the capital to set
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/** Getter for capitalRestantDu
	 * @return the capitalRestantDu
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	/** Setter
	 * @param capitalRestantDu the capitalRestantDu to set
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	/** Getter for taux
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/** Getter for dateDebut
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter for dateFin
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
}
