package paw;

import javax.faces.bean.ManagedBean;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import pl.edu.kosttek.webservice.GetConferences;
import pl.edu.kosttek.webservice.GetConferencesBeanService;

@ManagedBean
public class CreateConferenceBean {
	protected String description;
    protected String endDate;
    protected String startDate;
    protected String title;
    public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String addConfernece(){
		GetConferencesBeanService service1 = new GetConferencesBeanService();
		GetConferences port1 = service1.getGetConferencesBeanPort();
		return port1.putConferenceToDB(title, description, startDate, endDate);
	}
	
}
