
package pl.edu.kosttek.webservice.schedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boardroom" type="{http://webservice.kosttek.edu.pl/}boardroom" minOccurs="0"/>
 *         &lt;element name="conference" type="{http://webservice.kosttek.edu.pl/}conference" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="panel" type="{http://webservice.kosttek.edu.pl/}panel" minOccurs="0"/>
 *         &lt;element name="presentation" type="{http://webservice.kosttek.edu.pl/}presentation" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedule", propOrder = {
    "boardroom",
    "conference",
    "endDate",
    "panel",
    "presentation",
    "startDate"
})
public class Schedule {

    protected Boardroom boardroom;
    protected Conference conference;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Panel panel;
    protected Presentation presentation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Gets the value of the boardroom property.
     * 
     * @return
     *     possible object is
     *     {@link Boardroom }
     *     
     */
    public Boardroom getBoardroom() {
        return boardroom;
    }

    /**
     * Sets the value of the boardroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boardroom }
     *     
     */
    public void setBoardroom(Boardroom value) {
        this.boardroom = value;
    }

    /**
     * Gets the value of the conference property.
     * 
     * @return
     *     possible object is
     *     {@link Conference }
     *     
     */
    public Conference getConference() {
        return conference;
    }

    /**
     * Sets the value of the conference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conference }
     *     
     */
    public void setConference(Conference value) {
        this.conference = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the panel property.
     * 
     * @return
     *     possible object is
     *     {@link Panel }
     *     
     */
    public Panel getPanel() {
        return panel;
    }

    /**
     * Sets the value of the panel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Panel }
     *     
     */
    public void setPanel(Panel value) {
        this.panel = value;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link Presentation }
     *     
     */
    public Presentation getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation }
     *     
     */
    public void setPresentation(Presentation value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
