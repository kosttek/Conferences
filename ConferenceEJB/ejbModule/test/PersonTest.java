package test;
 
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Presentation;
import entity.Speaker;
 
public class PersonTest {
//    private final Person p1 = new Person("Brett", 'L', "Schuchert", "Street1",
//            "Street2", "City", "State", "Zip",new Date(System.currentTimeMillis()));
//    private final Person p2 = new Person("FirstName", 'K', "LastName",
//            "Street1", "Street2", "City", "State", "Zip",new Date(System.currentTimeMillis()));
//    private final Person p1 = new Person("Brett");
//    private final Person p2 = new Person("FirstName");
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
// kika tu byla fuck yea :D
    //proba2
    
    @Before
    public void initEmfAndEm() {

 //"person.odb" on local 
        emf = Persistence.createEntityManagerFactory("examplePersistenceUnit");
        em = emf.createEntityManager();
    }
 
    @After
    public void cleanup() {
        em.close();
    }
 
//    @Ignore
//    @SuppressWarnings("unchecked")
//    @Test
//    public void insertAndRetrieve() {
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.getTransaction().commit();
// 
//        final List<Person> list = em.createQuery("select p from person p")
//                .getResultList();
// 
//        assertEquals(2, list.size());
//        for (Person current : list) {
//            final String firstName = current.getFirstName();
//            assertTrue(firstName.equals("Brett")
//                    || firstName.equals("FirstName"));
//        }
//    }
    @Test
    public void insertPresentationAndRetrieve() {
    	Presentation pr1 = new Presentation( "prese", "boring", new Speaker( "name", "last", "desc"));
    	em.getTransaction().begin();
        em.persist(pr1);
        
        em.getTransaction().commit();
        final List<Presentation> list = em.createQuery("select p from presentation p")
                .getResultList();
        assertTrue(list.get(0).getSpeaker()!=null);
    }
}
