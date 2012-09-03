package pl.edu.kosttek.webservice.schedule.clientsample;

import pl.edu.kosttek.webservice.schedule.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        GetSchedulesBeanService service1 = new GetSchedulesBeanService();
	        System.out.println("Create Web Service...");
	        GetSchedules port1 = service1.getGetSchedulesBeanPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.getSchedules(Integer.parseInt(args[0])));
	        System.out.println("Create Web Service...");
	        GetSchedules port2 = service1.getGetSchedulesBeanPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.getSchedules(Integer.parseInt(args[1])));
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
