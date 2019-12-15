package ex1;

import java.util.Date;

/* Classe qui affiche les données administratives d'une entreprise
 * @author DIGINAMIC
 */

public class Entreprise {

	private long siret; // Nom du Siret de l'Entreprise
	private String nom; // Nom de l'Entreprise
	private String adresse; // Adresse de l'entreprise
	private Date dateCreation; // Date de Création de l'Entreprise
	
	public static final long CAPITAL_MAX = 3_000_000; // Constante de capital maximum
	
	/* méthode qui 
	 * affiche le statut de l'entreprise*/
	
	public void AfficherStatut(){
		
		System.out.println(siret);
		
	}

	/** Getter
	 * @return the siret
	 */
	public long getSiret() {
		return siret;
	}

	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(long siret) {
		this.siret = siret;
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
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
