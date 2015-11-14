package Superhero.Superhero.daodimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import Superhero.Superhero.daos.SuperheroDao;
import Superhero.Superhero.entities.Superhero;


@Repository
@Transactional
public class SuperheroDaoImpl implements SuperheroDao {
	@PersistenceContext
	private EntityManager em;
	
	//sets up EntityManager for general hibernate functionality
	public void setEm(EntityManager em) 
	{
		this.em = em;
	}

	
	public List<Superhero> getAllSuperheroes() {
		return em.createQuery("SELECT e FROM Superhero e", Superhero.class).
				getResultList();
	}

	
	public void addNewSuperhero(Superhero superhero) {
			em.persist(superhero);
	}
}

