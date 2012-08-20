/**
 * GetConferencesBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.edu.kosttek.webservice;

public class GetConferencesBeanServiceLocator extends org.apache.axis.client.Service implements pl.edu.kosttek.webservice.GetConferencesBeanService {

    public GetConferencesBeanServiceLocator() {
    }


    public GetConferencesBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetConferencesBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetConferencesBeanPort
    private java.lang.String GetConferencesBeanPort_address = "http://localhost:8080/ConferenceEJB/GetConferencesBean";

    public java.lang.String getGetConferencesBeanPortAddress() {
        return GetConferencesBeanPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetConferencesBeanPortWSDDServiceName = "GetConferencesBeanPort";

    public java.lang.String getGetConferencesBeanPortWSDDServiceName() {
        return GetConferencesBeanPortWSDDServiceName;
    }

    public void setGetConferencesBeanPortWSDDServiceName(java.lang.String name) {
        GetConferencesBeanPortWSDDServiceName = name;
    }

    public pl.edu.kosttek.webservice.GetConferences getGetConferencesBeanPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetConferencesBeanPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetConferencesBeanPort(endpoint);
    }

    public pl.edu.kosttek.webservice.GetConferences getGetConferencesBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pl.edu.kosttek.webservice.GetConferencesBeanServiceSoapBindingStub _stub = new pl.edu.kosttek.webservice.GetConferencesBeanServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetConferencesBeanPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetConferencesBeanPortEndpointAddress(java.lang.String address) {
        GetConferencesBeanPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pl.edu.kosttek.webservice.GetConferences.class.isAssignableFrom(serviceEndpointInterface)) {
                pl.edu.kosttek.webservice.GetConferencesBeanServiceSoapBindingStub _stub = new pl.edu.kosttek.webservice.GetConferencesBeanServiceSoapBindingStub(new java.net.URL(GetConferencesBeanPort_address), this);
                _stub.setPortName(getGetConferencesBeanPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GetConferencesBeanPort".equals(inputPortName)) {
            return getGetConferencesBeanPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.kosttek.edu.pl/", "GetConferencesBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.kosttek.edu.pl/", "GetConferencesBeanPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetConferencesBeanPort".equals(portName)) {
            setGetConferencesBeanPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
