package scheduleManager;
import javax.ejb.Remote;

@Remote
public interface scheduleManager {
	public String addScheduleToDb(String startDate, String endDate, String presentationId, String panelId,
			String conferenceId, String boardroomId);
}


