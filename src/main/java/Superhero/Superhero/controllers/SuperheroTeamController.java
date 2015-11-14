package Superhero.Superhero.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Superhero.Superhero.entities.SuperheroTeam;
import Superhero.Superhero.services.SuperheroTeamService;

@RestController
public class SuperheroTeamController {
	@Autowired
	SuperheroTeamService superheroTeamService;

	
	@RequestMapping(value="/superheroTeam", method=RequestMethod.GET)
	public List<SuperheroTeam> getAllSuperheroes(){
		return superheroTeamService.getAllSuperheroTeams();
	}
	
	@RequestMapping(value="/superheroTeam", method=RequestMethod.POST)
	public void addNewSuperheroTeam(@RequestBody SuperheroTeam superheroTeam){
		superheroTeamService.addNewSuperheroTeam(superheroTeam);
	}
	
	@RequestMapping(value="/superheroTeam", method=RequestMethod.PUT)
	public void updateSuperheroTeam(@RequestBody SuperheroTeam superheroTeam){
		superheroTeamService.updateSuperheroTeam(superheroTeam);
	}
	@RequestMapping(value="/superheroTeam", method=RequestMethod.DELETE)
	public void deleteSuperheroTeam(@RequestBody SuperheroTeam superheroTeam) {
		superheroTeamService.deleteSuperheroTeam(superheroTeam);
	}
}