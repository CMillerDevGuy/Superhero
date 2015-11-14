package Superhero.Superhero.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Superhero.Superhero.daos.PowerDao;
import Superhero.Superhero.entities.Power;
import Superhero.Superhero.services.PowerService;


@Service
public class PowerServiceImpl implements PowerService {
	@Autowired
	PowerDao powerDao;

	
	public List<Power> getAllPowers() {
		return powerDao.getAllPowers();
	}

	
	public void addPower(Power power) {
		powerDao.addPower(power);
		
	}

	
	public void updatePowerById(Power power) {
		powerDao.updatePowerById(power);
		
	}

}
