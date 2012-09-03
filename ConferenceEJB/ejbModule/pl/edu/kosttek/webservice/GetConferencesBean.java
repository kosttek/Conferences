package pl.edu.kosttek.webservice;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import test.Person;
import entity.Conference;

@Stateless
@WebService(endpointInterface = "pl.edu.kosttek.webservice.GetConferences")
@Remote(GetConferences.class)
public class GetConferencesBean {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
	private EntityManager entityManager= entityManagerFactory.createEntityManager();;

	public String echoTest() {
		return "Test : "+dbtest();
	}

	public List<Conference> getConferences() {
		final List<Conference> resultList ;

//		entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
//		entityManager = entityManagerFactory.createEntityManager();
		if(!entityManager.getTransaction().isActive())
			entityManager.getTransaction().begin();
		else
			entityManager.getTransaction();
		resultList = entityManager.createQuery("select c from conference c")
				.getResultList();

		System.out.println("---Conferneces size:" + resultList.size());

		
		return resultList;
	}
	
	public String removeConference(String id){
		Conference conference;
		if(!entityManager.getTransaction().isActive())
			entityManager.getTransaction().begin();
		else
			entityManager.getTransaction();
		conference =(Conference) entityManager.createQuery("select c from conference c where id="+ id)
				.getSingleResult();
		entityManager.remove(conference);

		
		return id;
	}
	
	private String dbtest(){
        Person p1 = new Person("Brett", 'L', "Schuchert", "Street1",
                "Street2", "City", "State", "Zip",new Date(System.currentTimeMillis()));
        Person p2 = new Person("FirstName"+new Random().nextInt(), 'K', "LastName",
                "Street1", "Street2", "City", "State", "Zip",new Date(System.currentTimeMillis()));

 
        entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.getTransaction().commit();
 
        final List<Person> list = entityManager.createQuery("select p from person p")
                .getResultList();
 

        for (Person current : list) {
            final String firstName = current.getFirstName();
            return firstName;
        }
        return "Noname";
    }
	
	public String putConferenceToDB(String title, String description,
			String startingDate, String endingDate) {
//		entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
//		entityManager = entityManagerFactory.createEntityManager();
        DateFormat formatter;
        java.util.Date startDate = new java.util.Date();
        java.util.Date endDate = new java.util.Date();
        formatter = new SimpleDateFormat("d-M-y");//01-01-2001
        try {
        	startDate = (java.util.Date) formatter.parse(startingDate);
			endDate = (java.util.Date) formatter.parse(endingDate);
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
    		if(!entityManager.getTransaction().isActive())
    			entityManager.getTransaction().begin();
    		else
    			entityManager.getTransaction();
    		
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
