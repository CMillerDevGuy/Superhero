package Superhero.Superhero.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Powers", schema = "public")
public class Power {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer powerId;

	@NotNull
	@Column(name = "powerName", unique = true)
	private String powerName;

	@NotNull
	private String powerType;

	@NotNull
	private String powerDescription;
	
	//@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.EAGER)
	//@JoinTable(name = "Superheroes", joinColumns = { @JoinColumn(name = "superheroId") }, inverseJoinColumns = {@JoinColumn(name = "powersId") })
	//private Set<Superhero> superhero = new HashSet<Superhero> ();

	public Integer getPowersId() {
		return powerId;
	}

	public void setPowersId(Integer powersId) {
		this.powerId = powersId;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public String getPowerType() {
		return powerType;
	}

	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}

	public String getPowerDescription() {
		return powerDescription;
	}

	public void setPowerDescription(String powerDescription) {
		this.powerDescription = powerDescription;
	}

}
