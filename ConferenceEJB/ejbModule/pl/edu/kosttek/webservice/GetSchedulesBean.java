package pl.edu.kosttek.webservice;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Conference;
import entity.Schedule;

@Stateless
@WebService(endpointInterface = "pl.edu.kosttek.webservice.GetSchedules")
@Remote(GetSchedules.class)
public class GetSchedulesBean {
	private EntityManagerFactory emf;
	private EntityManager em;


	public List<Schedule> getSchedules(int conferenceId) {
		final List<Schedule> resultList ;

		emf = Persistence.createEntityManagerFactory("examplePersistenceUnit");
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		resultList = em.createQuery("from schedule where conference = "+conferenceId)
				.getResultList();
		em.close();
		System.out.println("conferenceId : "+conferenceId);
		System.out.println("schedule list size  : "+ resultList.size());
		return resultList;
	}
	
}
