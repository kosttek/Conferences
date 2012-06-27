package scheduleManager;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jacorb.notification.engine.Schedulable;

import entity.Boardroom;
import entity.Conferenceimport entity.Schedule;
;
import entity.Conference;
import entity.Panel;
import entity.Presentation;
import entity.Schedule;
import entity.Speaker;


@Stateless
@WebService(name = "ConferenceManagerPortType",
	portName = "ConferenceManagerPort",
	targetNamespace = "http://webservice.kosttek.edu.pl/"
)
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)

public class scheduleManagerBean implements scheduleManager{
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public scheduleManagerBean () {
		entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public String addScheduleToDb(String startDate, String endDate, String presentationId, String panelId,
			String conferenceId, String boardroomId) {
		
		Presentation presentation= entityManager.find(Presentation.class, presentationId);
		Panel panel = entityManager.find(Panel.class, panelId);
		Conference conference = entityManager.find(Conference.class, conferenceId);
		Boardroom boardroom = entityManager.find(Boardroom.class, boardroomId);
		
		DateFormat formatter;
	 	Date startingDate = new Date();
        Date endingDate = new Date();
        formatter = new SimpleDateFormat("d-M-y");
        try {
        	startingDate = (Date) formatter.parse(startDate);
			endingDate = (Date) formatter.parse(endDate);
		} catch (ParseException e) {
			System.out.println("Exception in parsing date :"+e);  
			e.printStackTrace();
		}	
		
		Schedule schedule = new Schedule();
		schedule.setBoardroom(boardroom);
		schedule.setConference(conference);
		schedule.setPanel(panel);
		schedule.setPresentation(presentation);
		schedule.setStartDate(startingDate);
		schedule.setEndDate(endingDate);
		
		try {
        	entityManager.getTransaction().begin();
        	entityManager.persist(schedule);
        	entityManager.getTransaction().commit();
        	System.out.println("Added successfully with id " + schedule.getId());
			
		} catch (Exception e) {
			System.err.println("Error occured");
			e.printStackTrace();
		}
        
        return "Added successfully with id " + schedule.getId();
	}
}
