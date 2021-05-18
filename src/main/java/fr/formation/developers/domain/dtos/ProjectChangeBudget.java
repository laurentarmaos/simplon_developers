package fr.formation.developers.domain.dtos;

import javax.validation.constraints.Positive;

public class ProjectChangeBudget {

	@Positive
	private Integer annualBudget;

	public Integer getAnnualBudget() {
		return annualBudget;
	}

	public ProjectChangeBudget() {
	}

	public void setAnnualBudget(Integer annualBudget) {
		this.annualBudget = annualBudget;
	}

	@Override
	public String toString() {
		return "ProjectChangeBudget [annualBudget=" + annualBudget + "]";
	}

}
