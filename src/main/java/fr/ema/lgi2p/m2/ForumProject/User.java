package fr.ema.lgi2p.m2.ForumProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String texte;
	private Boolean actif;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(int id, String texte, Boolean actif) {
		super();
		this.id = id;
		this.texte = texte;
		this.actif = actif;
	}

	public User(String texte, Boolean actif) {
		super();
		this.texte = texte;
		this.actif = actif;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

}
