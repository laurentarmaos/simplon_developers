package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import fr.formation.developers.validation.ValidFields;

@ValidFields
public class Project {

	@NotBlank
	@Size(min = 1, max = 255)
	private String name;

	@NotBlank
	@Size(min = 100, max = 1000)
	private String description;

	@FutureOrPresent
	private LocalDate startingDate;

	private LocalDate endingDate;

	@Positive
	private Integer annualBudget;

	public Project() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}

	public LocalDate getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}

	public Integer getAnnualBudget() {
		return annualBudget;
	}

	public void setAnnualBudget(Integer annualBudget) {
		this.annualBudget = annualBudget;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", description=" + description + ", startingDate=" + startingDate
				+ ", endingDate=" + endingDate + ", annualBudget=" + annualBudget + "]";
	}

}
