package Superhero.Superhero.daos;

import java.util.List;

import Superhero.Superhero.entities.Superhero;


public interface SuperheroDao {

	List<Superhero> getAllSuperheroes();

	void addNewSuperhero(Superhero superhero);

}

