package fr.formation.developers.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Override
    public DeveloperView getByPseudonym(String pseudonym) {

	DeveloperView developer = new DeveloperView();
	developer.setFirstName("prenom1");
	developer.setLastName("nom1");
	developer.setPseudonym("pseudo1");
	LocalDate date = LocalDate.of(2021, 04, 30);

	developer.setBirthDate(date);

	if (pseudonym.equals(developer.getPseudonym())) {
	    return developer;
	}
	return null;

    }

    @Override
    public void create(DeveloperCreate developer) {

	System.out.println(developer);

    }

    @Override
    public void updateBirthDate(String pseudonym, DeveloperUpdate partial) {

	System.out.println("Uptdate bDay of  = " + pseudonym + "with new date : " + partial.getBirthDate());

    }

}
