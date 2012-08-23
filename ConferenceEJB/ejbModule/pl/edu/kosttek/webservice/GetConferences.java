package pl.edu.kosttek.webservice;

import java.rmi.Remote;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import entity.Conference;

@WebService
@SOAPBinding(style = Style.RPC)
public interface GetConferences extends Remote{
	public String echoTest();
	public List<Conference> getConferences();
	public String putConferenceToDB(String title, String description, String starDate, String endDate);
}
