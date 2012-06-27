package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "conference")
public class Conference implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;
	@Column( name = "title", nullable = false, length=100)
	private String title;
	@Column( name = "description", nullable = true, length=1000)
	private String description;
	@Column( name = "start_date", nullable = false)
	private Date startDate;
	@Column( name = "end_date", nullable = false)
	private Date endDate;
	
	public Conference(){	
	}
	
	public Conference( String title, String description, Date startDate, Date endDate){
		
		setTitle(title);
		setDescription(description);
		setStartDate(startDate);
		setEndDate(endDate);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String toString() {
		return "Description: "+description+" title: "+title + "id: " + id +"StartDate: "+startDate.toString()+" EndDate "+endDate.toString();
	}
}
