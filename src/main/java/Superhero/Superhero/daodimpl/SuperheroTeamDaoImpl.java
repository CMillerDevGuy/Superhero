package Superhero.Superhero.daodimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import Superhero.Superhero.daos.SuperheroTeamDao;
import Superhero.Superhero.entities.SuperheroTeam;

@Repository
@Transactional
public class SuperheroTeamDaoImpl implements SuperheroTeamDao {
	@PersistenceContext
	private EntityManager em;
	
	//sets up EntityManager for general hibernate functionality
	public void setEm(EntityManager em) 
	{
		this.em = em;
	}

	
	public List<SuperheroTeam> getAllSuperherTeams() {
		return em.createQuery("SELECT e FROM SuperheroTeam e", SuperheroTeam.class).
				getResultList();
	}

	
	public void addNewSuperheroTeam(SuperheroTeam superheroTeam) {
		em.persist(superheroTeam);
	}


	@Override
	public void updateSuperheroTeam(SuperheroTeam superheroTeam) {
		em.merge(superheroTeam);
	}


	@Override
	public void deleteSuperheroTeam(SuperheroTeam superheroTeam) {
		em.remove(superheroTeam);
		
	}
}
