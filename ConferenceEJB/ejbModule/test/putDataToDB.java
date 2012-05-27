package test;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Boardroom;
import entity.Conference;
import entity.Panel;
import entity.Presentation;
import entity.Schedule;
import entity.Speaker;

public class putDataToDB {

	private EntityManagerFactory emf;
	private EntityManager em;

	@Before
	public void initEmfAndEm() {
		BasicConfigurator.configure();
		emf = Persistence.createEntityManagerFactory("examplePersistenceUnit");
		em = emf.createEntityManager();
	}

	@After
	public void cleanup() {
		em.close();
	}

	@Test
	public void dropTables() {

		// org.hibernate.Session session = helper.getSession();
		// org.hibernate.Transaction tx = session.beginTransaction();
		// session.createSQLQuery("DROP TABLE speaker").executeUpdate();
		em.getTransaction().begin();
		em.createNativeQuery("DROP TABLE IF EXISTS schedule");
		em.createNativeQuery("DROP TABLE IF EXISTS speaker");
		em.createNativeQuery("DROP TABLE IF EXISTS conference");
		em.createNativeQuery("DROP TABLE IF EXISTS panel");
		em.createNativeQuery("DROP TABLE IF EXISTS presentation");
		em.createNativeQuery("DROP TABLE IF EXISTS boardroom");

		Conference conf1 = new Conference("Pokemony na grunwaldzie",
				"opis poka poka", new Date(System.currentTimeMillis()),
				new Date(System.currentTimeMillis() + 123000));

		Conference conf2 = new Conference("Baryłki niemocy",
				"wino tanie i dobre", new Date(System.currentTimeMillis()+321000),
				new Date(System.currentTimeMillis() + 456000));
		
		Panel c1p1 = new Panel( "Pokebale", "ojoj");
		Panel c1p2 = new Panel( "miecze i mieczyki", "dyskusja na temat przyznania pokojowej nagrody nobla");

		Panel c2p1 = new Panel("wino","wino wiecznie zywe");
		
		Boardroom c1b1 = new Boardroom( "maszynownia", "p 107", "brod smrod i ubustwo");
		Boardroom c1b2 = new Boardroom( "lux", "p 108", "skora i glazora");
		
		Boardroom c2b1 = new Boardroom( "spelona", "squot", "same dobre rzeczy");
		
		Speaker p1 = new Speaker("Mariusz", "Milczynski", "madry facet");
		Speaker p2 = new Speaker("Robert", "Pawlowski", " karzel ");
		//Speaker p3 = new Speaker("Kasia", "Mirosz", " pogodna blondynka ");
		Presentation c1pr1 = new Presentation("pikaczu", "analiza przyjazni asha i pika", p1);
		Presentation c1pr2 = new Presentation("KONG KING", "paralaksa marksizmu", p2);
		Presentation c1pr3 = new Presentation("typy niebytu", "Migracja jednostek", p2);
	
		Speaker p4 = new Speaker("Maria", "Antonina", " sexowna brunetka ");
		Presentation c2pr1 = new Presentation("Wino a potencja", "Praktyczne porady dla zon alkoholikow", p4);
		//System.currentTimeMillis() + 123000)
		Schedule c1s1 = new Schedule(new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + 123000), c1pr1, c1p1, conf1, c1b1);
		Schedule c1s2 = new Schedule(new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + 100000), c1pr2, c1p2, conf1, c1b2);
		Schedule c1s3 = new Schedule(new Date(System.currentTimeMillis()+ 100000), new Date(System.currentTimeMillis() + 123000), c1pr3, c1p1, conf1, c1b1);;
		Schedule c2s1 = new Schedule(new Date(System.currentTimeMillis()+321000), new Date(System.currentTimeMillis() + 456000), c2pr1, c2p1, conf2, c2b1);;
		
		em.persist(c1s1);
		em.persist(c1s2);
		em.persist(c1s3);
		em.persist(c2s1);
		em.getTransaction().commit();
		
//		List<Schedule> resultList= null;
//		em.getTransaction().begin();
//		resultList = em.createQuery("from schedule where conference = 2")
//				.getResultList();
//		System.out.println("---Conferneces size:" + resultList.size());
		
	}

}
