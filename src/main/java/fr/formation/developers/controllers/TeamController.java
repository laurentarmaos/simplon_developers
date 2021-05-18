package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.Team;

@RestController
@RequestMapping("/team")
public class TeamController {

	@GetMapping("{teamName}")
	public Team getByName(@PathVariable("teamName") String teamName) {
		Team team = new Team();
		team.setName("team1");
		team.setAgile(true);
		if (teamName.equals(team.getName())) {
			return team;
		} else {
			return null;
		}
	}

	@PostMapping
	public void create(@Valid @RequestBody Team team) {
		System.out.println(team);
	}

	@DeleteMapping("/{teamName}/delete")
	public void delete(@PathVariable("teamName") String teamName) {
		System.out.println("Deleted team : " + teamName);
	}
}
