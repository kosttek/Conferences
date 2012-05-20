package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "presentation")
public class Presentation {
	@Id
	@GeneratedValue
	private int id;
	@Column( name = "title", nullable = false, length=100)
	private String title;
	@Column( name = "description", nullable = true, length=1000)
	private String description;
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="speaker_id")
	private Speaker speaker;
	
	public Presentation() {
	
	}
	public Presentation(final String title,final String description,final Speaker speaker){
		
		setTitle(title);
		setDescription(description);
		setSpeaker(speaker);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
}
