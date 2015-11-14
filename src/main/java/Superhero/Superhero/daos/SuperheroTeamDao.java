package Superhero.Superhero.daos;

import java.util.List;

import Superhero.Superhero.entities.SuperheroTeam;


public interface SuperheroTeamDao {

	List<SuperheroTeam> getAllSuperherTeams();

	void addNewSuperheroTeam(SuperheroTeam superheroTeam);

	void updateSuperheroTeam(SuperheroTeam superheroTeam);

	void deleteSuperheroTeam(SuperheroTeam superheroTeam);

}
