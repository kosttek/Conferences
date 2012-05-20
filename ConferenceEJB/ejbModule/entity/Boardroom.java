package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "boardroom")
public class Boardroom {
	@Id
	@GeneratedValue
	private int id;
	@Column( name = "title", nullable = true, length=100)
	private String title;
	@Column( name = "name", nullable = false, length=100)
	private String name;
	@Column( name = "description", nullable = true, length=1000)
	private String description;
	
	public Boardroom( String title,String name, String description){
		
		setTitle(title);
		setName(name);
		setDescription(description);
	}
	
	public Boardroom(){
		
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
