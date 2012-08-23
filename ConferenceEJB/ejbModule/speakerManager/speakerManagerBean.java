//package speakerManager;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import entity.Speaker;
//
//public class speakerManagerBean {
//	private EntityManagerFactory entityManagerFactory;
//	private EntityManager entityManager;
//	
//	public speakerManagerBean () {
//		entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
//		entityManager = entityManagerFactory.createEntityManager();
//	}
//	
//	public String putSpeakerToDB (String lastName, String name, String description) {
//		
//		Speaker speaker = new Speaker();
//		speaker.setName(name);
//		speaker.setLastName(lastName);
//		speaker.setDescription(description);
//		
//		try {
//        	entityManager.getTransaction().begin();
//        	entityManager.persist(speaker);
//        	entityManager.getTransaction().commit();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "Error during putting spaker to db: " +e.getMessage();
//		}
//        
//        return "Spaker added successfully";
//	}
//}
