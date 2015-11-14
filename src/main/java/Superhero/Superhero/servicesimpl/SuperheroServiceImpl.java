package Superhero.Superhero.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Superhero.Superhero.daos.SuperheroDao;
import Superhero.Superhero.entities.Superhero;
import Superhero.Superhero.services.SuperheroService;


@Service
public class SuperheroServiceImpl implements SuperheroService {
	@Autowired
	SuperheroDao superheroDao;

	
	public List<Superhero> getAllSuperheroes() {
		return superheroDao.getAllSuperheroes();
	}

	
	public void addNewSuperhero(Superhero superhero) {
		superheroDao.addNewSuperhero(superhero);
		
	}

}