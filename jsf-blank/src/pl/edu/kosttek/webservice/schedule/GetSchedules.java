package pl.edu.kosttek.webservice.schedule;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.1-patch-01
 * Thu Aug 23 23:59:13 CEST 2012
 * Generated source version: 2.3.1-patch-01
 * 
 */
 
@WebService(targetNamespace = "http://webservice.kosttek.edu.pl/", name = "GetSchedules")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface GetSchedules {

    @WebResult(name = "return", targetNamespace = "http://webservice.kosttek.edu.pl/", partName = "return")
    @WebMethod
    public ScheduleArray getSchedules(
        @WebParam(partName = "arg0", name = "arg0")
        int arg0
    );
}
