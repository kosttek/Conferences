package conferenceManager;

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

import entity.Conference;

@Stateless
@WebService(name = "ConferenceManagerPortType",
	portName = "ConferenceManagerPort",
	targetNamespace = "http://webservice.kosttek.edu.pl/"
)
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)


public class conferenceManagerBean implements conferenceManager {
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public conferenceManagerBean () {
		entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@Override
	public String putConferenceToDB(String title, String description,
			String startingDate, String endingDate) {

        DateFormat formatter;
        Date startDate = new Date();
        Date endDate = new Date();
        formatter = new SimpleDateFormat("d-M-y");
        try {
        	startDate = (Date) formatter.parse(startingDate);
			endDate = (Date) formatter.parse(endingDate);
		} catch (ParseException e) {
			System.out.println("Exception in parsing date :"+e);  
			e.printStackTrace();
		}
		
        Conference conference = new Conference();
        conference.setTitle(title);
        conference.setDescription(description);
        conference.setStartDate(startDate);
        conference.setEndDate(endDate);
        
        try {
        	entityManager.getTransaction().begin();
        	entityManager.persist(conference);
        	entityManager.getTransaction().commit();
        	System.out.println("Added successfully with id " + conference.getId());
			
		} catch (Exception e) {
			System.err.println("Error occured");
			e.printStackTrace();
		}
        
        return "Added successfully with id " + conference.getId();
	}

}
