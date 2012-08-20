package conferenceManager;

import javax.ejb.Remote;

@Remote
public interface conferenceManager {
	public String putConferenceToDB(String title, String description, String starDate, String endDate);

}
