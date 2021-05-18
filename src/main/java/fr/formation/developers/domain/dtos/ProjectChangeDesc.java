package fr.formation.developers.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import fr.formation.developers.validation.ValidFields;

@ValidFields
public class ProjectChangeDesc {

	@NotBlank
	@Size(min = 100, max = 1000)
	private String description;

	public ProjectChangeDesc() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProjectChangeDesc [description=" + description + "]";
	}

}
