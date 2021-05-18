package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import fr.formation.developers.validation.AgeVerification;

public class DeveloperUpdate {

	@NotNull
	@AgeVerification
	private LocalDate birthDate;

	public DeveloperUpdate() {
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "DeveloperUpdate [birthDate=" + birthDate + "]";
	}

}
