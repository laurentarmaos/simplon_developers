package fr.formation.developers.controllers;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.Project;
import fr.formation.developers.domain.dtos.ProjectChangeBudget;
import fr.formation.developers.domain.dtos.ProjectChangeDesc;
import fr.formation.developers.domain.dtos.ProjectEndDate;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@GetMapping("/{projectName}")
	public Project getByName(@PathVariable("projectName") String projectName) {

		Project project = new Project();
		project.setName("project1");
		LocalDate startDate = LocalDate.of(2021, 05, 15);
		project.setStartingDate(startDate);
		project.setAnnualBudget(10);

		return project;
	}

	@PostMapping
	public void create(@Valid @RequestBody Project project) {
		System.out.println(project);
	}

	@PatchMapping("/{projectName}/editdesc")
	public void editDescription(@Valid @PathVariable("projectName") String projectName,
			@Valid @RequestBody ProjectChangeDesc partial) {
		System.out.println("edit description of  = " + projectName + " to : " + partial.getDescription());
	}

	@PatchMapping("/{projectName}/editbudget")
	public void editBudget(@Valid @PathVariable("projectName") String projectName,
			@Valid @RequestBody ProjectChangeBudget partial) {
		System.out.println("edit budget of of  = " + projectName + " to : " + partial.getAnnualBudget());
	}

	@PatchMapping("/{projectName}/ending")
	public void endingDate(@Valid @PathVariable("projectName") String projectName,
			@Valid @RequestBody ProjectEndDate partial) {

		System.out.println("create ending date of  = " + projectName + " to : " + partial.getEndingDate());
	}
}
