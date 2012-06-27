package panelManger;

import java.util.List;

import javax.ejb.Remote;

import entity.Conference;
import entity.Panel;

@Remote
public interface PanelManager {
	//public List<Panel> getPanelList(String conferenceId);
	public String getPanelListByConference(String conferenceId);
	public String putPanelToDB(String name, String description);
	public Panel testPanelReturn(String id);
	//public boolean addPanel(String name, String description);

}
