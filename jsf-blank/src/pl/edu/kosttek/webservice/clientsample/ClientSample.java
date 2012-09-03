package pl.edu.kosttek.webservice.clientsample;

import pl.edu.kosttek.webservice.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        GetConferencesBeanService service1 = new GetConferencesBeanService();
	        System.out.println("Create Web Service...");
	        GetConferences port1 = service1.getGetConferencesBeanPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.putConferenceToDB(null,null,null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.echoTest());
	        System.out.println("Server said: " + port1.removeConference(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.getConferences());
	        System.out.println("Create Web Service...");
	        GetConferences port2 = service1.getGetConferencesBeanPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.putConferenceToDB(null,null,null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.echoTest());
	        System.out.println("Server said: " + port2.removeConference(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.getConferences());
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
