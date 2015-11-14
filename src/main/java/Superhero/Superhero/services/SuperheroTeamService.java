package Superhero.Superhero.services;

import java.util.List;

import Superhero.Superhero.entities.SuperheroTeam;

public interface SuperheroTeamService {

	List<SuperheroTeam> getAllSuperheroTeams();

	void addNewSuperheroTeam(SuperheroTeam superheroTeam);

	void updateSuperheroTeam(SuperheroTeam superheroTeam);

	void deleteSuperheroTeam(SuperheroTeam superheroTeam);

}