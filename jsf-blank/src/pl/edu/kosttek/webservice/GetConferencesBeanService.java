
/*
 * 
 */

package pl.edu.kosttek.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1-patch-01
 * Mon Aug 27 21:27:56 CEST 2012
 * Generated source version: 2.3.1-patch-01
 * 
 */


@WebServiceClient(name = "GetConferencesBeanService", 
                  wsdlLocation = "http://localhost:8080/ConferenceEJB/GetConferencesBean?wsdl",
                  targetNamespace = "http://webservice.kosttek.edu.pl/") 
public class GetConferencesBeanService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://webservice.kosttek.edu.pl/", "GetConferencesBeanService");
    public final static QName GetConferencesBeanPort = new QName("http://webservice.kosttek.edu.pl/", "GetConferencesBeanPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ConferenceEJB/GetConferencesBean?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8080/ConferenceEJB/GetConferencesBean?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public GetConferencesBeanService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetConferencesBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetConferencesBeanService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GetConferencesBeanService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE);
    }
    public GetConferencesBeanService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE);
    }

    public GetConferencesBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns GetConferences
     */
    @WebEndpoint(name = "GetConferencesBeanPort")
    public GetConferences getGetConferencesBeanPort() {
        return super.getPort(GetConferencesBeanPort, GetConferences.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetConferences
     */
    @WebEndpoint(name = "GetConferencesBeanPort")
    public GetConferences getGetConferencesBeanPort(WebServiceFeature... features) {
        return super.getPort(GetConferencesBeanPort, GetConferences.class, features);
    }

}
