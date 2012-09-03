package paw;

import javax.faces.bean.ManagedBean;

import pl.edu.kosttek.webservice.Conference;
import pl.edu.kosttek.webservice.ConferenceArray;
import pl.edu.kosttek.webservice.GetConferences;
import pl.edu.kosttek.webservice.GetConferencesBeanService;

@ManagedBean
public class SomeBean {
  private String someProperty="some property! K!";
  private Conference [] conferences;
  
  public String getSomeProperty()  {
      System.out.println("***********************");
      System.out.println("Create Web Service Client...");
      GetConferencesBeanService service1 = new GetConferencesBeanService();
      System.out.println("Create Web Service...");
      GetConferences port1 = service1.getGetConferencesBeanPort();
      System.out.println("Call Web Service Operation...");
      System.out.println("Server said: " + port1.echoTest());
      System.out.println("Server said: " + port1.getConferences());
      System.out.println("Create Web Service...");
      GetConferences port2 = service1.getGetConferencesBeanPort();
      System.out.println("Call Web Service Operation...");
      System.out.println("Server said: " + port2.echoTest());
      System.out.println("Server said: " + port2.getConferences());
      System.out.println("***********************");
      System.out.println("Call Over!");
	  return(port1.echoTest());
//      return (someProperty);
  }

  public void setSomeProperty(String someProperty) {
    this.someProperty = someProperty;
  }
  
  public String someActionControllerMethod() {
    return("some-page");
  }

public Conference []  getConferences() {
	if(conferences == null){
		GetConferencesBeanService service1 = new GetConferencesBeanService();
		GetConferences port1 = service1.getGetConferencesBeanPort();
		Object [] tempConfs = port1.getConferences().getItem().toArray();
		Conference [] conferencesRet = new Conference [tempConfs.length];
		for (int i = 0; i < tempConfs.length; i++) {
			conferencesRet[i] = (Conference)tempConfs[i];
			
		}
			
		
		setConferences(conferencesRet);
		}
	return conferences;
}

public void setConferences(Conference [] conferences) {
	this.conferences = conferences;
}

}
