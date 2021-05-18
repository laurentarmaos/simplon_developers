package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Future;

public class ProjectEndDate {

	@Future
	private LocalDate endingDate;

	public ProjectEndDate() {
	}

	public LocalDate getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}

	@Override
	public String toString() {
		return "ProjectEndDate [endingDate=" + endingDate + "]";
	}

}
