package fr.formation.developers.domain.dtos;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Team {

	@NotBlank
	@Size(min = 1, max = 255)
	private String name;
	@AssertTrue
	private boolean isAgile;

	public Team() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAgile() {
		return isAgile;
	}

	public void setAgile(boolean isAgile) {
		this.isAgile = isAgile;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", isAgile=" + isAgile + "]";
	}

}
