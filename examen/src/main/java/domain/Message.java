package domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column( unique = true, nullable = false, precision = 19)
	private long id;
	
	@Column(name = "nomUtilisateur", nullable = false)
	private String nomUtilisateur;
	
	@Column(name = "texte", nullable = false, length = 200)
	private String texte;
	
	@Column(name = "date", nullable = false)
	private Date date;

	public Message(String nomUtilisateur, String texte, Date date) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.texte = texte;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
	
	

}
