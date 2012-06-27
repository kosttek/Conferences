package pl.edu.kosttek.webservice;

import java.rmi.Remote;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import entity.Schedule;

@WebService
@SOAPBinding(style = Style.RPC)
public interface GetSchedules extends Remote{
	public List<Schedule> getSchedules(int conferenceId);
}
