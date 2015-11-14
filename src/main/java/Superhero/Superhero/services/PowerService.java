package Superhero.Superhero.services;

import java.util.List;

import Superhero.Superhero.entities.Power;


public interface PowerService {

	List<Power> getAllPowers();

	void addPower(Power power);

	void updatePowerById(Power power);

}
