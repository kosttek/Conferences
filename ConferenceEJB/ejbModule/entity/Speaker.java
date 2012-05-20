package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity(name = "speaker")
public class Speaker {
	@Id
	@GeneratedValue
	private int id;
	@Column( name = "name", nullable = false, length=100)
	private String name;
	@Column( name = "last_name", nullable = false, length=100)
	private String lastName;
	@Column( name = "description", nullable = true, length=1000)
	private String description;
//	@OneToOne(fetch=FetchType.LAZY, mappedBy="speaker")
//	private Presentation presentation;
	
	public Speaker(){
		
	}
	public Speaker(final String name,final String lastName,final String description){
		
		setName(name);
		setLastName(lastName);
		setDescription(description);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
