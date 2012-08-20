package speakerManager;

import javax.ejb.Remote;

@Remote
public interface speakerManager {
	public String putSpeakerToDB (String title, String name, String description);
}

