import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement (name = "etudiant")
@XmlType(propOrder= {"nom","dateDeNaissance","prenom"})
public class Personne implements Serializable{
	private String nom;
	private String prenom;
	private Date DateDeNaissance;
	
	public Personne() {
		
	}

	public Personne(String nom, String prenom, Date dateDeNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		DateDeNaissance = dateDeNaissance;
	}

	@XmlAttribute
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateDeNaissance() {
		return DateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		DateDeNaissance = dateDeNaissance;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", DateDeNaissance=" + DateDeNaissance + "]";
	}
}