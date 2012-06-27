package boardroomManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Boardroom;

public class boardroomManagerBean implements boardoomManager {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public boardroomManagerBean () {
		entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public String putBoardroomToDB(String title, String name, String description) {
		
		Boardroom boardroom = new Boardroom();
		boardroom.setDescription(description);
		boardroom.setName(name);
		boardroom.setTitle(title);
		
		try {
        	entityManager.getTransaction().begin();
        	entityManager.persist(boardroom);
        	entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Error during putting Boardroom to db: " +e.getMessage();
		}
        
        return "Boardroom added successfully";
	}
}
