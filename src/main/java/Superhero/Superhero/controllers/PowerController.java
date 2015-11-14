package Superhero.Superhero.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Superhero.Superhero.entities.Power;
import Superhero.Superhero.services.PowerService;

@RestController
public class PowerController {
	
	@Autowired
	PowerService powerService;
	
	
	@RequestMapping(value="/power", method=RequestMethod.GET) 
	public List<Power> getAllPowers() {  
		return powerService.getAllPowers();
	}
	
	@RequestMapping(value="/power", method=RequestMethod.POST)
	public void addPower(@RequestBody Power power){
		powerService.addPower(power);
	}
	
	@RequestMapping(value="/power", method=RequestMethod.PUT)
	public void updatePowerById(/*@PathVariable Integer id,*/ @RequestBody Power power){
		//power.setPowersId(id);
		powerService.updatePowerById(power);
	}
}