package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;

public interface DeveloperService {

    DeveloperView getByPseudonym(String pseudonym);

    void create(DeveloperCreate developer);

    void updateBirthDate(String pseudonym, DeveloperUpdate partial);
}
