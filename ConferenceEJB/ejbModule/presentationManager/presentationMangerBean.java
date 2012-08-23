//package presentationManager;
//
//import javax.ejb.Stateless;
//import javax.jws.WebService;
//import javax.jws.soap.SOAPBinding;
//import javax.jws.soap.SOAPBinding.Style;
//import javax.jws.soap.SOAPBinding.Use;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import entity.Presentation;
//import entity.Speaker;
//
//
//@Stateless
//@WebService(name = "ConferenceManagerPortType",
//	portName = "ConferenceManagerPort",
//	targetNamespace = "http://webservice.kosttek.edu.pl/"
//)
//@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
//public class presentationMangerBean implements presentationManager {
//	
//	private EntityManagerFactory entityManagerFactory;
//	private EntityManager entityManager;
//	
//	public presentationMangerBean () {
//		entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
//		entityManager = entityManagerFactory.createEntityManager();
//	}
//	
//	@Override
//	public String addPresentationToDb(String title, String description,
//			String speakerId) {
//		
//		
//		Speaker speaker= entityManager.find(Speaker.class, speakerId);
//		
//		Presentation presetation = new Presentation();
//		presetation.setDescription(description);
//		presetation.setTitle(title);
//		presetation.setSpeaker(speaker);
//		
//		try {
//        	entityManager.getTransaction().begin();
//        	entityManager.persist(presetation);
//        	entityManager.getTransaction().commit();
//        	System.out.println("Added successfully with id " + presetation.getId());
//			
//		} catch (Exception e) {
//			System.err.println("Error occured");
//			e.printStackTrace();
//		}
//        
//        return "Added successfully with id " + presetation.getId();
//	}
//}
