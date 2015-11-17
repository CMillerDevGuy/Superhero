package Superhero.Superhero.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	
	@ManyToOne
	@JoinColumn(name = "teamlead_id")
	private Superhero teamLead;

	@OneToMany
	@JoinColumn(name = "superhero_id")
	private List<Superhero> superheros;
	
	public Superhero getTeamLead() {
		return teamLead;
	}

	public void setTeamLead(Superhero teamLead) {
		this.teamLead = teamLead;
	}

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

	public List<Superhero> getSuperheros() {
		return superheros;
	}

	public void setSuperheros(List<Superhero> superheros) {
		this.superheros = superheros;
	}

}
