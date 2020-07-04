package MonBungalow.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany
	private Collection<Bungalow> bungalow;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Long id, String name, Collection<Bungalow> bungalow) {
		super();
		this.id = id;
		this.name = name;
		this.bungalow = bungalow;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Bungalow> getBungalow() {
		return bungalow;
	}
	public void setBungalow(Collection<Bungalow> bungalow) {
		this.bungalow = bungalow;
	}
 
}
