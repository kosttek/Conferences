package pl.edu.kosttek.webservice;

import java.rmi.RemoteException;

public class GetConferencesProxy implements pl.edu.kosttek.webservice.GetConferences {
  private String _endpoint = null;
  private pl.edu.kosttek.webservice.GetConferences getConferences = null;
  
  public GetConferencesProxy() {
    _initGetConferencesProxy();
  }
  
  public GetConferencesProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetConferencesProxy();
  }
  
  private void _initGetConferencesProxy() {
    try {
      getConferences = (new pl.edu.kosttek.webservice.GetConferencesBeanServiceLocator()).getGetConferencesBeanPort();
      if (getConferences != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getConferences)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getConferences)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getConferences != null)
      ((javax.xml.rpc.Stub)getConferences)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pl.edu.kosttek.webservice.GetConferences getGetConferences() {
    if (getConferences == null)
      _initGetConferencesProxy();
    return getConferences;
  }

@Override
public String echoTest() throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Conference[] getConferences() throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}
  
  
}