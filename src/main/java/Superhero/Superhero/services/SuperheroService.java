package Superhero.Superhero.services;

import java.util.List;

import Superhero.Superhero.entities.Superhero;


public interface SuperheroService {

	List<Superhero> getAllSuperheroes();

	public void addNewSuperhero(Superhero superhero);

}