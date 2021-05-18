package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.services.DeveloperService;

@RestController
@RequestMapping("/developer")
public class DeveloperController {

    public final DeveloperService service;

    public DeveloperController(DeveloperService service) {
	this.service = service;
    }

    @GetMapping("/{pseudonym}")
    public DeveloperView getByPseudonym(@PathVariable("pseudonym") String pseudonym) {

	return service.getByPseudonym(pseudonym);

    }

    @PostMapping
    public void create(@Valid @RequestBody DeveloperCreate developer) {
	service.create(developer);
    }

    @PatchMapping("/{pseudonym}/birth-date")
    public void updateBirthDate(@PathVariable("pseudonym") String pseudonym,
	    @Valid @RequestBody DeveloperUpdate partial) {
	// System.out.println("Partial object = " + partial);
	// DeveloperCreate developer = new DeveloperCreate();
	// developer.setPseudonym(pseudonym); // variable de chemin
	// developer.setBirthDate(partial.getBirthDate()); // JSON
	// developer.setFirstName("prenom1");
	// developer.setLastName("nom1");

	service.updateBirthDate(pseudonym, partial);
    }

}
