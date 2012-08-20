/**
 * GetConferences.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.edu.kosttek.webservice;

public interface GetConferences extends java.rmi.Remote {
    public java.lang.String echoTest() throws java.rmi.RemoteException;
    public pl.edu.kosttek.webservice.Conference[] getConferences() throws java.rmi.RemoteException;
}
