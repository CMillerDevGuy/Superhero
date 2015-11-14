package Superhero.Superhero.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "Superheroes", schema = "public")
public class Superhero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer superheroId;

	@NotNull
	@Length(max = 250)
	@Column(name = "superheroName", unique = true)
	private String superheroName;

	@NotNull
	@Length(max = 250)
	private String realName;

	@NotNull
	private String origin;

	@NotNull
	private String costumeImage;

	@NotNull
	private String height;

	@NotNull
	private String weight;

	//@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.EAGER)
	//@JoinTable(name = "Powers", joinColumns = { @JoinColumn(name = "powersId") }, inverseJoinColumns = {@JoinColumn(name = "superheroId") })
	//@OneToMany
	//@JoinColumn(name = "powerId")
	//private Set<Power> powers = new HashSet<Power>();
	//@ManyToOne
	//@JoinColumn(name = "powerId")
	//private Power powers;

	/*public Power getPowers() {
		return powers;
	}

	public void setPowers(Power powers) {
		this.powers = powers;
	}*/

	public Integer getSuperheroId() {
		return superheroId;
	}

	public void setSuperheroId(Integer superheroId) {
		this.superheroId = superheroId;
	}

	public String getSuperheroName() {
		return superheroName;
	}

	public void setSuperheroName(String superheroName) {
		this.superheroName = superheroName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getCostumeImage() {
		return costumeImage;
	}

	public void setCostumeImage(String costumeImage) {
		this.costumeImage = costumeImage;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	/*public Set<Power> getPowers() {
		return powers;
	}

	public void setPowers(Set<Power> powers) {
		this.powers = powers;
	}*/

}
