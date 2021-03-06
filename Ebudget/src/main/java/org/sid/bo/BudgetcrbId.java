package org.sid.bo;
// Generated 2 avr. 2018 22:14:16 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BudgetcrbId generated by hbm2java
 */
@Embeddable
public class BudgetcrbId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numcrb;
	private String numcb;

	public BudgetcrbId() {
	}

	public BudgetcrbId(String numcrb, String numcb) {
		this.numcrb = numcrb;
		this.numcb = numcb;
	}

	@Column(name = "numcrb", nullable = false, length = 254)
	public String getNumcrb() {
		return this.numcrb;
	}

	public void setNumcrb(String numcrb) {
		this.numcrb = numcrb;
	}

	@Column(name = "numcb", nullable = false, length = 254)
	public String getNumcb() {
		return this.numcb;
	}

	public void setNumcb(String numcb) {
		this.numcb = numcb;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BudgetcrbId))
			return false;
		BudgetcrbId castOther = (BudgetcrbId) other;

		return ((this.getNumcrb() == castOther.getNumcrb()) || (this.getNumcrb() != null
				&& castOther.getNumcrb() != null && this.getNumcrb().equals(castOther.getNumcrb())))
				&& ((this.getNumcb() == castOther.getNumcb()) || (this.getNumcb() != null
						&& castOther.getNumcb() != null && this.getNumcb().equals(castOther.getNumcb())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNumcrb() == null ? 0 : this.getNumcrb().hashCode());
		result = 37 * result + (getNumcb() == null ? 0 : this.getNumcb().hashCode());
		return result;
	}

}
