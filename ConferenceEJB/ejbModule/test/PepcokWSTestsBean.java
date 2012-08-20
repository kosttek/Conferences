package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Conference;

@Stateless
@WebService(name = "PepcokWSTestsPortType",
	portName = "PepcokWSTestsPort",
	targetNamespace = "http://webservice.kosttek.edu.pl/"
)
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)

public class PepcokWSTestsBean implements PepcokWSTests {
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public PepcokWSTestsBean() {
		entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
		entityManager = entityManagerFactory.createEntityManager();
	}

	@WebMethod
	@WebResult (
		name = "PutConferencesToDBResponse",
		targetNamespace = "http://webservice.kosttek.edu.1pl"
	)
	public String PutConferencesToDB() {
        String futureDate = "20-06-13";
        DateFormat formatter;
        Date endDate = new Date();
        formatter = new SimpleDateFormat("d-M-y");
        try {
			endDate = (Date) formatter.parse(futureDate);
		} catch (ParseException e) {
			System.out.println("Wyjątek w ustawianiu daty :"+e);  
			e.printStackTrace();
		}
		
        Conference conference = new Conference();
        conference.setTitle("Druga testowa konferencja");
        conference.setDescription("To jest druga testowa konferencja");
        conference.setStartDate(new Date());
        conference.setEndDate(endDate);
        
        try {
        	entityManager.getTransaction().begin();
        	entityManager.persist(conference);
        	entityManager.getTransaction().commit();
        	System.out.println("Konferencja dodana z id= "+conference.getId());
			
		} catch (Exception e) {
			System.err.println("Nie dodałem konferencji do bazy");
			e.printStackTrace();
		}
        
        return "Wszystko poszło pomyślnie :)";
	}
	
	@WebMethod
	@WebResult (
			name = "getConferenceFromDBResponse",
			targetNamespace = "http://webservice.kosttek.edu.pl"
		)
	public Conference getConferenceFromDB(String id) {
		Conference conference = entityManager.find(Conference.class, id);
		return conference;
	}
	
	@WebMethod
	@WebResult (
			name = "testGettingConferenceFromDBResponse",
			targetNamespace = "http://webservice.kosttek.edu.pl"
		)
	public Conference testGettingConferenceFromDB(@WebParam(name="id")int id) {
        
		Conference conference;
		conference = entityManager.find(Conference.class, id);
		
        return conference;
	}
	
	@WebMethod
	@WebResult (
			name = "testGettingConferenceWithStringResponseResponse")
	
	public String testGettingConferenceWithStringResponse(int id) {
		Conference conference;
		conference = entityManager.find(Conference.class, id);
		
		return conference.toString();
	}
}
