package paw;

import javax.faces.bean.ManagedBean;

import pl.edu.kosttek.webservice.GetConferences;
import pl.edu.kosttek.webservice.GetConferencesBeanService;

@ManagedBean
public class RemoveConference {
	public String remove(int id){
		GetConferencesBeanService service1 = new GetConferencesBeanService();
		GetConferences port1 = service1.getGetConferencesBeanPort();
		port1.removeConference(String.valueOf(id));
		return id+" id";
	}
}
