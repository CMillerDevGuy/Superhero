package Superhero.Superhero.daos;

import java.util.List;

import Superhero.Superhero.entities.Power;

public interface PowerDao {

	List<Power> getAllPowers();

	void addPower(Power power);

	void updatePowerById(Power power);

}
