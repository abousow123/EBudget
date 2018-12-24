package org.sid.bo;
// Generated 2 avr. 2018 22:14:16 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Bureauutilisateur generated by hbm2java
 */
@Entity
@Table(name = "bureauutilisateur")
public class Bureauutilisateur implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BureauutilisateurId id;
	private Bureauadministratifcomptable bureauadministratifcomptable;
	private Role role;
	private Utilisateur utilisateur;

	public Bureauutilisateur() {
	}

	public Bureauutilisateur(BureauutilisateurId id, Bureauadministratifcomptable bureauadministratifcomptable,
			Utilisateur utilisateur) {
		this.id = id;
		this.bureauadministratifcomptable = bureauadministratifcomptable;
		this.utilisateur = utilisateur;
	}

	public Bureauutilisateur(BureauutilisateurId id, Bureauadministratifcomptable bureauadministratifcomptable,
			Role role, Utilisateur utilisateur) {
		this.id = id;
		this.bureauadministratifcomptable = bureauadministratifcomptable;
		this.role = role;
		this.utilisateur = utilisateur;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "numbac", column = @Column(name = "numbac", nullable = false, length = 254)),
			@AttributeOverride(name = "numutilisateur", column = @Column(name = "numutilisateur", nullable = false, length = 254)) })
	public BureauutilisateurId getId() {
		return this.id;
	}

	public void setId(BureauutilisateurId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numbac", nullable = false, insertable = false, updatable = false)
	public Bureauadministratifcomptable getBureauadministratifcomptable() {
		return this.bureauadministratifcomptable;
	}

	public void setBureauadministratifcomptable(Bureauadministratifcomptable bureauadministratifcomptable) {
		this.bureauadministratifcomptable = bureauadministratifcomptable;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numrole")
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numutilisateur", nullable = false, insertable = false, updatable = false)
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
