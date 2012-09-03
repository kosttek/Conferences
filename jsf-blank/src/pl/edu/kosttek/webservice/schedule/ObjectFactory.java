
package pl.edu.kosttek.webservice.schedule;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.edu.kosttek.webservice.schedule package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.edu.kosttek.webservice.schedule
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Speaker }
     * 
     */
    public Speaker createSpeaker() {
        return new Speaker();
    }

    /**
     * Create an instance of {@link Panel }
     * 
     */
    public Panel createPanel() {
        return new Panel();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link Conference }
     * 
     */
    public Conference createConference() {
        return new Conference();
    }

    /**
     * Create an instance of {@link ScheduleArray }
     * 
     */
    public ScheduleArray createScheduleArray() {
        return new ScheduleArray();
    }

    /**
     * Create an instance of {@link Boardroom }
     * 
     */
    public Boardroom createBoardroom() {
        return new Boardroom();
    }

    /**
     * Create an instance of {@link Presentation }
     * 
     */
    public Presentation createPresentation() {
        return new Presentation();
    }

}
