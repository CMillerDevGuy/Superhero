package Superhero.Superhero.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "SuperheroTeam", schema = "public")
public class SuperheroTeam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer teamId;

	@NotNull
	@Length(max = 250)
	private String headquarters;

	@NotNull
	private boolean publicSupport;
	
//	@NotNull
//	private Superhero teamLead;

	@ManyToOne
	@JoinColumn(name = "superheroId")
	private Superhero superhero;

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public boolean isPublicSupport() {
		return publicSupport;
	}

	public void setPublicSupport(boolean publicSupport) {
		this.publicSupport = publicSupport;
	}

	/*public Superhero getTeamLead() {
		return teamLead;
	}

	public void setTeamLead(Superhero teamLead) {
		this.teamLead = teamLead;
	}*/

	public Superhero getSuperhero() {
		return superhero;
	}

	public void setSuperhero(Superhero superhero) {
		this.superhero = superhero;
	}

}
