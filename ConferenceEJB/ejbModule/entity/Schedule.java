package entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "schedule")
public class Schedule {
	@Id
	@GeneratedValue
	private int id;
	@Column( name = "start_date", nullable = false)
	private Date startDate;
	@Column( name = "end_date", nullable = false)
	private Date endDate;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="presentation_id")
	private Presentation presentation;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="panel_id")
	private Panel panel;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Conference_id")
	private Conference conference;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="boardroom_id")
	private Boardroom boardroom;
	
	
	public Date getStartDate() {
		return startDate;
	}
	public Schedule(){
		
	}
	
	public Schedule(Date startDate, Date endDate, Presentation presentation,
			Panel panel, Conference conference, Boardroom boardroom) {
		
		this.startDate = startDate;
		this.endDate = endDate;
		this.presentation = presentation;
		this.panel = panel;
		this.conference = conference;
		this.boardroom = boardroom;
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

	public Presentation getPresentation() {
		return presentation;
	}

	public void setPresentation(Presentation presentation) {
		this.presentation = presentation;
	}

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	public Conference getConference() {
		return conference;
	}

	public void setConference(Conference conference) {
		this.conference = conference;
	}

	public Boardroom getBoardroom() {
		return boardroom;
	}

	public void setBoardroom(Boardroom boardroom) {
		this.boardroom = boardroom;
	}
	
	public int getId() {
		return this.id;
	}
}
package entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "schedule")
public class Schedule {
	@Id
	@GeneratedValue
	private int id;
	@Column( name = "start_date", nullable = false)
	private Date startDate;
	@Column( name = "end_date", nullable = false)
	private Date endDate;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="presentation_id")
	private Presentation presentation;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="panel_id")
	private Panel panel;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Conference_id")
	private Conference conference;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="boardroom_id")
	private Boardroom boardroom;
	
	
	public Date getStartDate() {
		return startDate;
	}
	public Schedule(){
		
	}
	
	public Schedule(Date startDate, Date endDate, Presentation presentation,
			Panel panel, Conference conference, Boardroom boardroom) {
		
		this.startDate = startDate;
		this.endDate = endDate;
		this.presentation = presentation;
		this.panel = panel;
		this.conference = conference;
		this.boardroom = boardroom;
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

	public Presentation getPresentation() {
		return presentation;
	}

	public void setPresentation(Presentation presentation) {
		this.presentation = presentation;
	}

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	public Conference getConference() {
		return conference;
	}

	public void setConference(Conference conference) {
		this.conference = conference;
	}

	public Boardroom getBoardroom() {
		return boardroom;
	}

	public void setBoardroom(Boardroom boardroom) {
		this.boardroom = boardroom;
	}
	
	public int getId() {
		return this.id;
	}
}


