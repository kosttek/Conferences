package pl.edu.kosttek.webservice;

import java.sql.Date;
import java.util.List;
import java.util.Random;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.BasicConfigurator;


import test.Person;

import entity.Conference;

@Stateless
@WebService(endpointInterface = "pl.edu.kosttek.webservice.GetConferences")
@Remote(GetConferences.class)
public class GetConferencesBean {
	private EntityManagerFactory emf;
	private EntityManager em;

	public String echoTest() {
		return "Test : "+dbtest();
	}

	public List<Conference> getConferences() {
		final List<Conference> resultList ;

		emf = Persistence.createEntityManagerFactory("examplePersistenceUnit");
		em = emf.createEntityManager();
		em.getTransaction().begin();
		resultList = em.createQuery("select c from conference c")
				.getResultList();
		System.out.println("---Conferneces size:" + resultList.size());
		em.close();
		return resultList;
	}
	private String dbtest(){
        Person p1 = new Person("Brett", 'L', "Schuchert", "Street1",
                "Street2", "City", "State", "Zip",new Date(System.currentTimeMillis()));
        Person p2 = new Person("FirstName"+new Random().nextInt(), 'K', "LastName",
                "Street1", "Street2", "City", "State", "Zip",new Date(System.currentTimeMillis()));

 
        emf = Persistence.createEntityManagerFactory("examplePersistenceUnit");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();
 
        final List<Person> list = em.createQuery("select p from person p")
                .getResultList();
 

        for (Person current : list) {
            final String firstName = current.getFirstName();
            return firstName;
        }
        return "Noname";
    }
}
