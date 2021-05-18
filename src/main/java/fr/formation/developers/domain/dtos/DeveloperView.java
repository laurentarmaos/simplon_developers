package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

public class DeveloperView {

    private String lastName;

    private String firstName;

    private String pseudonym;

    private LocalDate birthDate;

    public DeveloperView() {
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getPseudonym() {
	return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
	this.pseudonym = pseudonym;
    }

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    @Override
    public String toString() {
	return "Developer [lastName=" + lastName + ", firstName=" + firstName + ", pseudonym=" + pseudonym
		+ ", birthDate=" + birthDate + "]";
    }
}
