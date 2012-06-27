package panelManger;

import javax.ejb.Remote;
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

import entity.Panel;

@Stateless
@WebService(name = "PanelManagerPortType",
	portName = "PanelManagerPort",
	targetNamespace = "http://webservice.kosttek.edu.pl/"
)
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)

public class PanelManagerBean implements PanelManager {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public PanelManagerBean () {
		entityManagerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@WebMethod
	@WebResult (
		name = "getPanelListByConferenceResponse",
		targetNamespace = "http://webservice.kosttek.edu.pl"
	)
	public String getPanelListByConference(@WebParam(name = "conferenceId")String id) {
		return "Dostałem id" + id;
	}
	
	
	@WebMethod
	@WebResult (
			name = "addSecondConferenceResponse",
			targetNamespace = "http://webservice.kosttek.edu.pl"
		)
	public Panel testPanelReturn(@WebParam(name="testMessage")String id) {
        
		
		Panel panel = new Panel();
		panel.setDescription("Opis panelu");
		panel.setName("Nazwa panelu + id "+id);
		
        return panel;
	}
	
	@WebMethod
	@WebResult (
			name = "putPanelToDBResponse",
			targetNamespace = "http://webservice.kosttek.edu.pl"
			)
	public String putPanelToDB(String name, String description) {
		Panel newPanel= new Panel();
		newPanel.setName(name);
		newPanel.setDescription(description);
        
        try {
        	entityManager.getTransaction().begin();
        	entityManager.persist(newPanel);
        	entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Error during putting Panel to db: " +e.getMessage();
		}
        
        return "Panel added successfully";
	}
}
