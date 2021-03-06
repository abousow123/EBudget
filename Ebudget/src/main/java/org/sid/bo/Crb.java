package org.sid.bo;
// Generated 2 avr. 2018 22:14:16 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Crb generated by hbm2java
 */
@Entity
@Table(name = "crb")
public class Crb implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numcrb;
	private String description;
	private String service;
	private Set<Budgetcrb> budgetcrbs = new HashSet<Budgetcrb>(0);
	private Set<Bureauadministratifcomptable> bureauadministratifcomptables = new HashSet<Bureauadministratifcomptable>(
			0);

	public Crb() {
	}

	public Crb(String numcrb) {
		this.numcrb = numcrb;
	}

	public Crb(String numcrb, String description, String service, Set<Budgetcrb> budgetcrbs,
			Set<Bureauadministratifcomptable> bureauadministratifcomptables) {
		this.numcrb = numcrb;
		this.description = description;
		this.service = service;
		this.budgetcrbs = budgetcrbs;
		this.bureauadministratifcomptables = bureauadministratifcomptables;
	}

	@Id

	@Column(name = "numcrb", unique = true, nullable = false, length = 254)
	public String getNumcrb() {
		return this.numcrb;
	}

	public void setNumcrb(String numcrb) {
		this.numcrb = numcrb;
	}

	@Column(name = "description", length = 254)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "service", length = 254)
	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "crb")
	@JsonManagedReference
	public Set<Budgetcrb> getBudgetcrbs() {
		return this.budgetcrbs;
	}

	public void setBudgetcrbs(Set<Budgetcrb> budgetcrbs) {
		this.budgetcrbs = budgetcrbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "crb")
	@JsonManagedReference
	public Set<Bureauadministratifcomptable> getBureauadministratifcomptables() {
		return this.bureauadministratifcomptables;
	}

	public void setBureauadministratifcomptables(Set<Bureauadministratifcomptable> bureauadministratifcomptables) {
		this.bureauadministratifcomptables = bureauadministratifcomptables;
	}

}
