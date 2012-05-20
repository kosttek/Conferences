package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "panel")
public class Panel {

	@Id
	@GeneratedValue
	private int id;
	@Column( name = "name", nullable = false, length=100)
	private String name;
	@Column( name = "description", nullable = true, length=1000)
	private String description;
	
	public Panel( String name, String description){
		
		setName(name);
		setDescription(description);
	}
	
	public Panel(){
		
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
	
}
