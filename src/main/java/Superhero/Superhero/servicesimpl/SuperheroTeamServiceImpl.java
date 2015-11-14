package Superhero.Superhero.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Superhero.Superhero.daos.SuperheroTeamDao;
import Superhero.Superhero.entities.SuperheroTeam;
import Superhero.Superhero.services.SuperheroTeamService;


@Service
public class SuperheroTeamServiceImpl implements SuperheroTeamService {
	@Autowired
	SuperheroTeamDao superheroTeamDao;

	
	public List<SuperheroTeam> getAllSuperheroTeams() {
		return superheroTeamDao.getAllSuperherTeams();
	}

	
	public void addNewSuperheroTeam(SuperheroTeam superheroTeam) {
		superheroTeamDao.addNewSuperheroTeam(superheroTeam);
		
	}


	@Override
	public void updateSuperheroTeam(SuperheroTeam superheroTeam) {
		superheroTeamDao.updateSuperheroTeam(superheroTeam);
		
	}


	@Override
	public void deleteSuperheroTeam(SuperheroTeam superheroTeam) {
		superheroTeamDao.deleteSuperheroTeam(superheroTeam);
	}
}